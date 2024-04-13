package net.luhcarti.dutchcraft.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.luhcarti.dutchcraft.DutchCraft;
import net.luhcarti.dutchcraft.entity.custom.HerringEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class HerringRenderer extends MobRenderer<HerringEntity, HerringModel<HerringEntity>> {
    public HerringRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new HerringModel<>(pContext.bakeLayer(ModModelLayers.HERRING_LAYER)), 0.2f);
    }

    @Override
    public ResourceLocation getTextureLocation(HerringEntity herringEntity) {
        return new ResourceLocation(DutchCraft.MOD_ID, "textures/entity/herring.png");
    }

    @Override
    public void render(HerringEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pPoseStack, MultiBufferSource pBuffer, int pPackedLight) {
        super.render(pEntity, pEntityYaw, pPartialTicks, pPoseStack, pBuffer, pPackedLight);
    }
}
