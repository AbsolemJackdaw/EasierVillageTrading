package de.guntram.mcmod.easiervillagertrading.mixins;

//@Mixin(MenuScreens.class)
//public abstract class GuiMerchantMixin {
//
//    @Inject(method = "create", at = @At("HEAD"), cancellable = true)
//    private static void displayVillagerTradeGui(MenuType type, Minecraft client, int any, Component component, CallbackInfo ci) {
//
//        if (type == MenuType.MERCHANT) {
//            MerchantMenu container = MenuType.MERCHANT.create(any, client.player.getInventory());
//            BetterGuiMerchant screen = new BetterGuiMerchant(container, client.player.getInventory(), component);
//            client.player.containerMenu = container;
//            client.setScreen(screen);
//            ci.cancel();
//        }
//    }
//}
