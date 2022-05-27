package de.guntram.mcmod.easiervillagertrading.mixins;

import de.guntram.mcmod.easiervillagertrading.BetterGuiMerchant;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.network.chat.Component;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.MerchantMenu;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MenuScreens.class)
public abstract class GuiMerchantMixin {
    
    @Inject(method = "open", at = @At("HEAD"), cancellable = true)
    private static void displayVillagerTradeGui(MenuType type, Minecraft client,
            int any, Component component, CallbackInfo ci) {

        if (type == MenuType.MERCHANT) {
            MerchantMenu container = MenuType.MERCHANT.create(any, client.player.getInventory());
            BetterGuiMerchant screen = new BetterGuiMerchant(container, client.player.getInventory(), component);
            client.player.containerMenu = container;
            client.setScreen(screen);
            ci.cancel();
        }
    }
}
