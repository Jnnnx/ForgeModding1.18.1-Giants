package com.jnnx.giantsmod.client.renderer;

import com.jnnx.giantsmod.GiantsMod;
import com.jnnx.giantsmod.common.entity.GiantLargeEntity;
import net.minecraft.client.model.AbstractZombieModel;
import net.minecraft.client.model.GiantZombieModel;
import net.minecraft.client.model.ZombieModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.monster.Giant;
import net.minecraft.world.entity.monster.Monster;

public class GiantLargeEntityModel<Type extends GiantLargeEntity> extends AbstractZombieModel<Type> {

    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
            new ResourceLocation(GiantsMod.MODID, "giant_large_entity"), "main");

    public GiantLargeEntityModel(ModelPart modelPart) {
        super(modelPart);
    }

    @Override
    public boolean isAggressive(Type p_101999_) {
        return false;
    }


//    @Override
//    public boolean isAggressive(Monster p_101999_) {
//        return false;
//    }

//    public boolean isAggressive(Type p_102692_) {
//        return false;
//    }

//    @Override
//    public void setupAnim(Entity p_102618_, float p_102619_, float p_102620_, float p_102621_, float p_102622_, float p_102623_) {
//
//    }
}
