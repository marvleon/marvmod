package com.marvmod.crafting;

import com.marvmod.MarvMod;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CraftingManager {
    public static void addRecipes() {
        GameRegistry.addRecipe(new ItemStack(MarvMod.emeraldPickaxe),
                "EEE",
                " S ",
                " S ",
                'E', Items.emerald, 'S', Items.stick);
        GameRegistry.addRecipe(new ItemStack(MarvMod.emeraldSword),
                " E ",
                " E ",
                " S ",
                'E', Items.emerald, 'S', Items.stick);
    }
}
