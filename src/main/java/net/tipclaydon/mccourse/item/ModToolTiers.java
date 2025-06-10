package net.tipclaydon.mccourse.item;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;
import net.tipclaydon.mccourse.MCCourseMod;
import net.tipclaydon.mccourse.util.ModTags;

import java.util.List;

public class ModToolTiers {
    public static final Tier ALEXANDRITE = TierSortingRegistry.registerTier(
            new ForgeTier(5, 1400, 11f, 3f, 26,
                ModTags.Blocks.NEEDS_ALEXANDRITE_TOOL, () -> Ingredient.of(ModItems.ALEXANDRITE.get())),
            new ResourceLocation(MCCourseMod.MOD_ID,"alexandrite"), List.of(Tiers.NETHERITE), List.of());

}