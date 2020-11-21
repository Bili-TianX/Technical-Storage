package com.bilitianx.technicalstorage.crafting;

import com.bilitianx.technicalstorage.item.ItemRegistryHandler;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class FurnaceRecipeRegistryHandler {
	public static void register() {
		GameRegistry.addSmelting(ItemRegistryHandler.ITEM_XTOM_ORE, 
				new ItemStack(ItemRegistryHandler.ITEM_XTOM_INGOT), 0.7F);
	}
}
