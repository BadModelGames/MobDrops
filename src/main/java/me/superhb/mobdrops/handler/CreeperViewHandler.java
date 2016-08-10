package me.superhb.mobdrops.handler;

import me.superhb.mobdrops.gui.CreeperViewGUI;
import net.minecraft.client.Minecraft;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class CreeperViewHandler {
	@SubscribeEvent
	public void onRenderGUI (RenderGameOverlayEvent.Post event) {
		if (event.getType() != ElementType.HOTBAR) return;
		new CreeperViewGUI(Minecraft.getMinecraft());
	}
}
