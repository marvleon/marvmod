package com.marvmod;

import com.marvmod.item.ItemEmeraldPickaxe;
import com.marvmod.item.ItemEmeraldSword;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = MarvMod.MODID, version = MarvMod.VERSION)
public class MarvMod
{
    public static final String MODID = "marvmod";
    public static final String VERSION = "1.0";
    public static Item emeraldPickaxe;
    public static Item emeraldSword;


    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        emeraldPickaxe = new ItemEmeraldPickaxe(Item.ToolMaterial.EMERALD)
                .setUnlocalizedName("emeraldPickaxe");
                //.setTextureName("MarvMod:emerald_pickaxe");
        GameRegistry.registerItem(emeraldPickaxe, "emeraldPickaxe");
        emeraldSword = new ItemEmeraldSword(Item.ToolMaterial.EMERALD)
                .setUnlocalizedName("emeraldSword");
                //.setTextureName("MarvMod:emerald_sword");
        GameRegistry.registerItem(emeraldSword, "emeraldSword");
    }
}
