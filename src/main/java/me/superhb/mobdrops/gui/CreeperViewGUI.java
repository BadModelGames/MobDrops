package me.superhb.mobdrops.gui;

import me.superhb.mobdrops.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.VertexBuffer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.util.ResourceLocation;

public class CreeperViewGUI extends Gui {
	public CreeperViewGUI (Minecraft minecraft) {
		ResourceLocation texture = new ResourceLocation(Reference.MODID + ":textures/gui/creeper_view_overlay.png");
		ScaledResolution scaled = new ScaledResolution(minecraft);
		int width = scaled.getScaledWidth();
		int height = scaled.getScaledHeight();
		
		GlStateManager.enableBlend();
		GlStateManager.enableAlpha();
		GlStateManager.tryBlendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
		minecraft.renderEngine.bindTexture(texture);
		//minecraft.ingameGUI.drawTexturedModalRect(width / 5, height /4, 0, 0, 256, 256);
		minecraft.ingameGUI.drawModalRectWithCustomSizedTexture(width / 2, height / 2, 0, 0, width, height, 256, 256);
		GlStateManager.disableBlend();
		GlStateManager.enableAlpha();
	}
}
