package com.jnnx.giantsmod.common.entity;

import com.jnnx.giantsmod.client.renderer.GiantLargeEntityRenderer;
import com.jnnx.giantsmod.core.init.EntityInit;
import com.jnnx.giantsmod.goal.giantGoal.BreakBlockGoal;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.Mth;
import net.minecraft.world.Difficulty;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.BreakDoorGoal;
import net.minecraft.world.entity.animal.Animal;

import net.minecraft.world.entity.monster.AbstractIllager;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.monster.Ravager;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.GrassBlock;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

import java.util.function.Predicate;

public class GiantLargeEntity extends Zombie {

    public GiantLargeEntity(EntityType<? extends Zombie> entityType, Level level) {
        super(entityType, level);
    }


    public static AttributeSupplier.Builder createAttributes() {
        return Monster.createMonsterAttributes().add(Attributes.FOLLOW_RANGE, 35.0D).add(Attributes.MOVEMENT_SPEED, 0.30F)
                .add(Attributes.ATTACK_DAMAGE, 15.0D).add(Attributes.ARMOR, 2.0D).add(Attributes.SPAWN_REINFORCEMENTS_CHANCE)
                .add(Attributes.MAX_HEALTH, 100.0D).add(Attributes.KNOCKBACK_RESISTANCE, 5D);
    }

//Zombie
    protected boolean isSunSensitive() {
        return false;
    }

    private static final Predicate<Difficulty> DOOR_BREAKING_PREDICATE = (p_34284_) -> {
        return p_34284_ == Difficulty.HARD;
    };
    private final BreakBlockGoal breakBlockGoal = new BreakBlockGoal(this, DOOR_BREAKING_PREDICATE);

//Entity

    protected float getStandingEyeHeight(Pose p_34313_, EntityDimensions p_34314_) {
        return this.isBaby() ? 0.93F* GiantLargeEntityRenderer.scaleHeight : 1.74F*GiantLargeEntityRenderer.scaleHeight;
    }

//    protected float getJumpPower() {
//        return 0.42F * 1.6F * this.getBlockJumpFactor();
//    }

//    protected void jumpFromGround() {
//        double d0 = (double)this.getJumpPower() + this.getJumpBoostPower();
//        Vec3 vec3 = this.getDeltaMovement();
//        this.setDeltaMovement(vec3.x, d0, vec3.z);
//        if (this.isSprinting()) {
//            float f = this.getYRot() * ((float)Math.PI / 180F);
//            this.setDeltaMovement(this.getDeltaMovement().add((double)(-Mth.sin(f) * 0.2F), 2.0D, (double)(Mth.cos(f) * 0.2F)));
//        }
//
//        this.hasImpulse = true;
//        net.minecraftforge.common.ForgeHooks.onLivingJump(this);
//    }
    protected boolean canRide(Entity p_31169_) {
    return true;
}

//Ravager

    public void aiStep() {
        super.aiStep();
        if (this.isAlive()) {

            if (this.horizontalCollision && net.minecraftforge.event.ForgeEventFactory.getMobGriefingEvent(this.level, this)) {
                boolean flag = false;
                AABB aabb = this.getBoundingBox().inflate(0.2D);

                for(BlockPos blockpos : BlockPos.betweenClosed(Mth.floor(aabb.minX), Mth.floor(aabb.minY), Mth.floor(aabb.minZ), Mth.floor(aabb.maxX), Mth.floor(aabb.maxY), Mth.floor(aabb.maxZ))) {
                    BlockState blockstate = this.level.getBlockState(blockpos);
                    Block block = blockstate.getBlock();
                    if (block instanceof LeavesBlock) {
                        flag = this.level.destroyBlock(blockpos, true, this) || flag;
                    }
//                    else if (block instanceof RotatedPillarBlock) {
//                        flag = this.level.destroyBlock(blockpos, true, this) || flag;
//                    }
                    else if (blockstate.getMaterial() == Material.WOOD) {
                            flag = this.level.destroyBlock(blockpos, true, this) || flag;
                    }
                    else if (blockstate.getMaterial() == Material.STONE) {
                        flag = this.level.destroyBlock(blockpos, true, this) || flag;
                    }
                    else if (block instanceof GrassBlock) {
                        flag = this.level.destroyBlock(blockpos, true, this) || flag;
                    }
                }

                if (!flag && this.onGround) {
                    this.jumpFromGround();
                }
            }
        }
    }




}
