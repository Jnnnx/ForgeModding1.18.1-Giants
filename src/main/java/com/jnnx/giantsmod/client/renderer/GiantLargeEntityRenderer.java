package com.jnnx.giantsmod.client.renderer;

import com.jnnx.giantsmod.GiantsMod;
import com.jnnx.giantsmod.common.entity.GiantLargeEntity;
import net.minecraft.client.model.ZombieModel;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.renderer.entity.*;
import net.minecraft.resources.ResourceLocation;

public class GiantLargeEntityRenderer<Type extends GiantLargeEntity> extends AbstractZombieRenderer<Type, ZombieModel<Type>> {

//    private static final ResourceLocation TEXTURE = new ResourceLocation(GiantsMod.MODID, "textures/entities/giant_large_entity.png");

    public GiantLargeEntityRenderer(EntityRendererProvider.Context context){
        super(context.bakeLayer(ModelPart ));
    }

//    @Override
//    public ResourceLocation getTextureLocation(Type entity) {
//        return TEXTURE;
//    }
}
