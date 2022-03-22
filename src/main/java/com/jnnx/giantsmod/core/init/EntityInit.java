package com.jnnx.giantsmod.core.init;

import com.jnnx.giantsmod.GiantsMod;
import com.jnnx.giantsmod.common.entity.GiantLargeEntity;
import net.minecraft.ResourceLocationException;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class EntityInit {

    private EntityInit(){

    }

    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES, GiantsMod.MODID);

    public static final RegistryObject<EntityType<GiantLargeEntity>> GIANT_LARGE_ENTITY = ENTITIES.register("giant_large_entity",
            () -> EntityType.Builder.of(GiantLargeEntity::new, MobCategory.MONSTER)
                    .sized(1.5F, 5.25F)
                    .build(new ResourceLocation(GiantsMod.MODID, "giant_large_entity").toString()));
}
