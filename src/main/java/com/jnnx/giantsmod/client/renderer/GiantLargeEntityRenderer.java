package com.jnnx.giantsmod.client.renderer;

import com.jnnx.giantsmod.GiantsMod;
import com.jnnx.giantsmod.common.entity.GiantLargeEntity;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.ZombieModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.renderer.entity.*;
import net.minecraft.resources.ResourceLocation;

public class GiantLargeEntityRenderer<Type extends GiantLargeEntity> extends AbstractZombieRenderer<Type, ZombieModel<Type>> {

//    private static final ResourceLocation TEXTURE = new ResourceLocation(GiantsMod.MODID, "textures/entities/giant_large_entity.png");

    public GiantLargeEntityRenderer(EntityRendererProvider.Context context){
        this(context, ModelLayers.ZOMBIE, ModelLayers.ZOMBIE_INNER_ARMOR, ModelLayers.ZOMBIE_OUTER_ARMOR);
    }
    public GiantLargeEntityRenderer(EntityRendererProvider.Context context, ModelLayerLocation layer, ModelLayerLocation legsArmorLayer, ModelLayerLocation bodyArmorLayer){
        super(context, new ZombieModel(context.bakeLayer(layer)), new ZombieModel(context.bakeLayer(legsArmorLayer)), new ZombieModel(context.bakeLayer(bodyArmorLayer)));
    }

//    @Override
//    public ResourceLocation getTextureLocation(Type entity) {
//        return TEXTURE;
//    }
}
