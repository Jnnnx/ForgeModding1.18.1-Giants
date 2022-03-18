package com.jnnx.giantsmod.client.event;

import com.jnnx.giantsmod.GiantsMod;
import com.jnnx.giantsmod.client.renderer.GiantLargeEntityModel;
import com.jnnx.giantsmod.client.renderer.GiantLargeEntityRenderer;
import com.jnnx.giantsmod.common.entity.GiantLargeEntity;
import com.jnnx.giantsmod.core.init.EntityInit;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = GiantsMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientModEvents {

    private ClientModEvents() {}

    @SubscribeEvent
    public  static void clientSetup(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(GiantLargeEntityModel.LAYER_LOCATION, GiantLargeEntityModel::createBodyLayer);
    }

    @SubscribeEvent
    public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(EntityInit.GIANT_LARGE_ENTITY.get(), GiantLargeEntityRenderer::new);
    }

}
