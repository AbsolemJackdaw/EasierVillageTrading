/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.guntram.mcmod.easiervillagertrading.mixins;

import de.guntram.mcmod.easiervillagertrading.AutoTrade;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.screens.inventory.MerchantScreen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.ClickType;
import net.minecraft.world.inventory.MerchantMenu;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

//@Mixin(MerchantScreen.class)
//public abstract class MerchantScreenMixin extends AbstractContainerScreen<MerchantMenu> {
//
//    @Shadow
//    private int shopItem;
//
//    public MerchantScreenMixin(MerchantMenu merchantContainer_1, Inventory playerInventory_1, Component text_1) {
//        super(merchantContainer_1, playerInventory_1, text_1);
//    }
//
//    @Inject(method = "postButtonClick", at = @At("RETURN"))
//    public void tradeOnSetRecipeIndex(CallbackInfo ci) {
//        if (Screen.hasControlDown()) {
//            return;
//        }
//        this.slotClicked(null, 0, 0, ClickType.QUICK_MOVE);
//        this.slotClicked(null, 1, 0, ClickType.QUICK_MOVE);
//
//        ((AutoTrade) this).trade(shopItem);
//    }
//}
