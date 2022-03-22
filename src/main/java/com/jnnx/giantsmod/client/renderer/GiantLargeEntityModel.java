package com.jnnx.giantsmod.client.renderer;

import com.jnnx.giantsmod.GiantsMod;
import com.jnnx.giantsmod.common.entity.GiantLargeEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;

import net.minecraft.client.model.*;

import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.resources.ResourceLocation;


public class GiantLargeEntityModel<Type extends GiantLargeEntity> extends ZombieModel<Type>{

    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
            new ResourceLocation(GiantsMod.MODID, "giant_large_entity"), "main");

    public GiantLargeEntityModel(ModelPart p_171090_) {
        super(p_171090_);
    }

    @Override
    public void setupAnim(Type entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

    }

//    @Override
//    public boolean isAggressive(Type p_101999_) {
//        return false;
//    }

//    @Override
//    public boolean isAggressive(Type p_101999_) {
//        return false;
//    }





//    private final ModelPart headwear;
//    private final ModelPart head;
//    private final ModelPart body;
//    private final ModelPart left_arm;
//    private final ModelPart right_arm;
//    private final ModelPart left_leg;
//    private final ModelPart right_leg;
//    private final ModelPart belly;
//    private final ModelPart chest;
//    private final ModelPart back;
//    private final ModelPart side_fat;
//    private final ModelPart side_fat2;
//
//    public GiantLargeEntityModel(ModelPart root) {
//        super(root);
//        this.headwear = root.getChild("hat");
//        this.head = root.getChild("head");
//        this.body = root.getChild("body");
//        this.left_arm = root.getChild("left_arm");
//        this.right_arm = root.getChild("right_arm");
//        this.left_leg = root.getChild("left_leg");
//        this.right_leg = root.getChild("right_leg");
//        this.belly = root.getChild("belly");
//        this.chest = root.getChild("chest");
//        this.back = root.getChild("back");
//        this.side_fat = root.getChild("side_fat");
//        this.side_fat2 = root.getChild("side_fat2");
//    }
//
//    public static LayerDefinition createBodyLayer() {
//        MeshDefinition meshdefinition = new MeshDefinition();
//        PartDefinition partdefinition = meshdefinition.getRoot();
//
//        PartDefinition headwear = partdefinition.addOrReplaceChild("hat", CubeListBuilder.create().texOffs(34, 0).addBox(-3.0F, -8.5F, -4.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
//                .texOffs(34, 0).addBox(3.5F, -6.5F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
//                .texOffs(38, 0).addBox(-4.5F, -2.5F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
//                .texOffs(38, 0).addBox(-4.5F, -5.5F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
//                .texOffs(38, 0).addBox(0.0F, -1.5F, -4.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
//                .texOffs(34, 0).addBox(-1.0F, -1.5F, -4.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
//                .texOffs(34, 0).addBox(0.0F, -0.5F, -4.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
//
//        PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));
//
//        PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
//
//        PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create().texOffs(38, 0).addBox(11.5F, -1.1F, -2.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
//                .texOffs(40, 16).mirror().addBox(9.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.0F, 2.0F, 0.0F, -1.6144F, 0.0F, 0.0F));
//
//        PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create().texOffs(34, 0).addBox(-12.5F, 0.4F, -2.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
//                .texOffs(40, 16).addBox(-13.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, 2.0F, 0.0F, -1.6144F, 0.0F, 0.0F));
//
//        PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(0, 16).mirror().addBox(1.9F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-1.9F, 12.0F, 0.0F));
//
//        PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(0, 16).mirror().addBox(-5.9F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(1.9F, 12.0F, 0.0F));
//
//        PartDefinition belly = partdefinition.addOrReplaceChild("belly", CubeListBuilder.create().texOffs(38, 0).addBox(-1.0F, -19.409F, -14.3834F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
//                .texOffs(38, 0).addBox(-1.0F, -18.4128F, -15.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
//                .texOffs(38, 0).addBox(0.0F, -17.3294F, -15.2052F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
//                .texOffs(38, 0).addBox(0.3F, -17.9F, -15.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
//                .texOffs(38, 0).addBox(2.5F, -14.7F, -14.9384F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
//                .texOffs(34, 0).addBox(2.4F, -15.6962F, -14.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
//                .texOffs(38, 0).addBox(-2.2F, -15.9F, -15.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
//                .texOffs(34, 0).addBox(-1.9F, -16.3F, -15.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
//                .texOffs(34, 0).addBox(0.0F, -18.3523F, -14.8821F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
//                .texOffs(34, 0).addBox(0.0F, -18.1F, -15.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
//                .texOffs(34, 0).addBox(-1.0F, -18.1F, -15.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
//                .texOffs(34, 0).addBox(0.0F, -19.1F, -14.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
//                .texOffs(0, 33).addBox(-3.0F, -18.0F, -15.0F, 6.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
//                .texOffs(19, 35).mirror().addBox(-3.5F, -19.0F, -14.0F, 7.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
//                .texOffs(0, 46).mirror().addBox(-3.5F, -13.0F, -13.0F, 7.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 24.0F, 9.0F, -0.0873F, 0.0F, 0.0F));
//
//        PartDefinition chest = partdefinition.addOrReplaceChild("chest", CubeListBuilder.create().texOffs(0, 39).addBox(-3.0F, -21.5F, -3.0F, 6.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
//                .texOffs(0, 39).addBox(-3.0F, -22.15F, 2.0F, 6.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
//                .texOffs(41, 35).mirror().addBox(-3.5F, -21.0F, 1.5F, 7.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 24.0F, 0.0F));
//
//        PartDefinition back = partdefinition.addOrReplaceChild("back", CubeListBuilder.create().texOffs(36, 59).addBox(-3.0F, -18.0F, -5.5F, 6.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
//                .texOffs(33, 48).mirror().addBox(-3.5F, -19.0F, -5.0F, 7.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
//                .texOffs(0, 51).mirror().addBox(-3.5F, -13.0F, -4.5F, 7.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 23.0F, -3.0F, 0.0872F, 3.1416F, 0.0F));
//
//        PartDefinition side_fat = partdefinition.addOrReplaceChild("side_fat", CubeListBuilder.create().texOffs(17, 58).addBox(3.15F, -14.5F, -2.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
//                .texOffs(47, 53).addBox(3.35F, -19.5F, -2.5F, 2.0F, 5.0F, 6.0F, new CubeDeformation(0.0F))
//                .texOffs(0, 56).addBox(5.0F, -19.0F, -1.5F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 24.0F, -2.0F, -0.0873F, 0.0F, 0.0F));
//
//        PartDefinition side_fat2 = partdefinition.addOrReplaceChild("side_fat2", CubeListBuilder.create().texOffs(17, 58).mirror().addBox(-5.15F, -14.5F, -2.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
//                .texOffs(47, 53).mirror().addBox(-5.35F, -19.5F, -2.5F, 2.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
//                .texOffs(0, 56).mirror().addBox(-6.0F, -19.0F, -1.5F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, 24.0F, -2.0F, -0.0873F, 0.0F, 0.0F));
//
//        return LayerDefinition.create(meshdefinition, 64, 64);
//    }

//    @Override
//    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
//
//    }

//    @Override
//    public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
//        headwear.render(poseStack, buffer, packedLight, packedOverlay);
//        head.render(poseStack, buffer, packedLight, packedOverlay);
//        body.render(poseStack, buffer, packedLight, packedOverlay);
//        left_arm.render(poseStack, buffer, packedLight, packedOverlay);
//        right_arm.render(poseStack, buffer, packedLight, packedOverlay);
//        left_leg.render(poseStack, buffer, packedLight, packedOverlay);
//        right_leg.render(poseStack, buffer, packedLight, packedOverlay);
//        belly.render(poseStack, buffer, packedLight, packedOverlay);
//        chest.render(poseStack, buffer, packedLight, packedOverlay);
//        back.render(poseStack, buffer, packedLight, packedOverlay);
//        side_fat.render(poseStack, buffer, packedLight, packedOverlay);
//        side_fat2.render(poseStack, buffer, packedLight, packedOverlay);
//    }

}

