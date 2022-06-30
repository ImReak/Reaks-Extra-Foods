package com.net.reaksextrafoods.mixin;

import com.net.reaksextrafoods.ReaksExtraFoodsMod;
import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class ReaksExtraFoodsModMixin {
	@Inject(at = @At("HEAD"), method = "init()V")
	private void init(CallbackInfo info) {
		ReaksExtraFoodsMod.LOGGER.info("This line is printed by Reak's Extra Foods mod mixin!");
	}
}
