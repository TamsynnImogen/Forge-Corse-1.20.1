package net.tipclaydon.mccourse.item;

import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;
import net.tipclaydon.mccourse.MCCourseMod;

public class ModItemProperties {
    public static void addCustomItemProperties() {
        ItemProperties.register(ModItems.DATA_TABLET.get(), new ResourceLocation(MCCourseMod.MOD_ID, "on"),
                (pStack, pLevel, pEntity, pSeed) -> pStack.hasTag() ? 1f :0f);
    }
}
