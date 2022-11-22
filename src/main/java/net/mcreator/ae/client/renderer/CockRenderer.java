
package net.mcreator.ae.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.ChickenModel;

import net.mcreator.ae.entity.CockEntity;

public class CockRenderer extends MobRenderer<CockEntity, ChickenModel<CockEntity>> {
	public CockRenderer(EntityRendererProvider.Context context) {
		super(context, new ChickenModel(context.bakeLayer(ModelLayers.CHICKEN)), 2f);
	}

	@Override
	public ResourceLocation getTextureLocation(CockEntity entity) {
		return new ResourceLocation("ae:textures/entities/chicken.png");
	}
}
