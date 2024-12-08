package net.mcreator.campermc.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.campermc.world.inventory.CampsiteHubGUIMenu;
import net.mcreator.campermc.network.CampsiteHubGUIButtonMessage;
import net.mcreator.campermc.CampermcMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class CampsiteHubGUIScreen extends AbstractContainerScreen<CampsiteHubGUIMenu> {
	private final static HashMap<String, Object> guistate = CampsiteHubGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_craftingmenu;

	public CampsiteHubGUIScreen(CampsiteHubGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 300;
		this.imageHeight = 175;
	}

	private static final ResourceLocation texture = new ResourceLocation("campermc:textures/screens/campsite_hub_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.campermc.campsite_hub_gui.label_campsite"), 131, 11, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.campermc.campsite_hub_gui.label_crafting"), 50, 29, -11119018, false);
	}

	@Override
	public void init() {
		super.init();
		imagebutton_craftingmenu = new ImageButton(this.leftPos + 23, this.topPos + 38, 96, 64, 0, 0, 64, new ResourceLocation("campermc:textures/screens/atlas/imagebutton_craftingmenu.png"), 96, 128, e -> {
			if (true) {
				CampermcMod.PACKET_HANDLER.sendToServer(new CampsiteHubGUIButtonMessage(0, x, y, z));
				CampsiteHubGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_craftingmenu", imagebutton_craftingmenu);
		this.addRenderableWidget(imagebutton_craftingmenu);
	}
}
