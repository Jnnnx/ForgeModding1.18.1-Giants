package com.jnnx.giantsmod.client.renderer;

import com.google.common.collect.Queues;
import com.jnnx.giantsmod.GiantsMod;
import com.jnnx.giantsmod.common.entity.GiantLargeEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Matrix3f;
import com.mojang.math.Matrix4f;
import net.minecraft.Util;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.GiantZombieModel;
import net.minecraft.client.model.ZombieModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.*;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.layers.ItemInHandLayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Pose;
import net.minecraft.world.entity.monster.Giant;
import org.lwjgl.opengl.GL11;

import java.util.Random;



public class GiantLargeEntityRenderer<Type extends GiantLargeEntity> extends AbstractZombieRenderer<Type, ZombieModel<Type>> {

//    private static final ResourceLocation TEXTURE = new ResourceLocation(GiantsMod.MODID, "textures/entities/giant_large_entity.png");

//    public GiantLargeEntityRenderer(EntityRendererProvider.Context context){
//        super(context, new GiantLargeEntityModel(context.bakeLayer(GiantLargeEntityModel.LAYER_LOCATION)), 0.5f);
////        this(context, ModelLayers.ZOMBIE, ModelLayers.ZOMBIE_INNER_ARMOR, ModelLayers.ZOMBIE_OUTER_ARMOR);
//    }

    public static Float scaleWidth = 4f;
    public static Float scaleHeight = 4f;
    public static Float scaleZaxis = 4f;

    public GiantLargeEntityRenderer(EntityRendererProvider.Context context){
        this(context, ModelLayers.ZOMBIE, ModelLayers.ZOMBIE_INNER_ARMOR, ModelLayers.ZOMBIE_OUTER_ARMOR);
    }
    public GiantLargeEntityRenderer(EntityRendererProvider.Context context, ModelLayerLocation layer, ModelLayerLocation legsArmorLayer, ModelLayerLocation bodyArmorLayer){
        super(context, new ZombieModel(context.bakeLayer(layer)), new ZombieModel(context.bakeLayer(legsArmorLayer)), new ZombieModel(context.bakeLayer(bodyArmorLayer)));
    }

    public void render(Type a, float b, float c, PoseStack d, MultiBufferSource e, int f){

        d.scale(scaleWidth,scaleHeight,scaleZaxis);
        super.render(a,b,c,d,e,f);
    }


//    public GiantLargeEntityRenderer(EntityRendererProvider.Context context, float xScale){
//        super(context, new GiantZombieModel(context.bakeLayer(ModelLayers.GIANT)), 0.5F * xScale);
//        this.scale = xScale;
//        this.addLayer(new ItemInHandLayer<>(this));
//        this.addLayer(new HumanoidArmorLayer<>(this, new GiantZombieModel(context.bakeLayer(ModelLayers.GIANT_INNER_ARMOR)), new GiantZombieModel(context.bakeLayer(ModelLayers.GIANT_OUTER_ARMOR))));
//    }
//
//    protected void scale(Giant p_114775_, PoseStack p_114776_, float p_114777_) {
//        p_114776_.scale(this.scale, this.scale, this.scale);
//    }

//    @Override
//    public ResourceLocation getTextureLocation(Type entity) {
//        return TEXTURE;
//    }

}
