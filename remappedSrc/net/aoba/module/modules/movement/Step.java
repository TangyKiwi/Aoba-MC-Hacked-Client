/*
* Aoba Hacked Client
* Copyright (C) 2019-2023 coltonk9043
*
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
*
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
*
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

/**
 * Step Module
 */
package net.aoba.module.modules.movement;

import org.lwjgl.glfw.GLFW;
import net.aoba.module.Module;
import net.aoba.settings.SliderSetting;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.network.Packet;

public class Step extends Module {

	private SliderSetting stepHeight;
	
	public Step() {
		this.setName("Step");
		this.setBind(new KeyBinding("key.step", GLFW.GLFW_KEY_UNKNOWN, "key.categories.aoba"));
		this.setCategory(Category.Movement);
		this.setDescription("Steps up blocks.");
		
		stepHeight = new SliderSetting("Height", "step_height", 1f, 0.0f, 2f, 0.5f);
		this.addSetting(stepHeight);
	}

	@Override
	public void onDisable() {
		if(MC.world != null) {
			MC.player.stepHeight = .5f;
		}
	}

	@Override
	public void onEnable() {
		MC.player.stepHeight = stepHeight.getValueFloat();
	}

	@Override
	public void onToggle() {

	}

	@Override
	public void onUpdate() {

	}

	@Override
	public void onRender(MatrixStack matrixStack, float partialTicks) {
		
	}

	@Override
	public void onSendPacket(Packet<?> packet) {
		
	}

	@Override
	public void onReceivePacket(Packet<?> packet) {
		
		
	}
	
	public void setStepHeight(float height) {
		this.stepHeight.setValue(height);
	}
}
