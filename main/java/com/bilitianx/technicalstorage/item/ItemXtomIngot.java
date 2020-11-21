package com.bilitianx.technicalstorage.item;

import com.bilitianx.technicalstorage.TechnicalStorage;
import com.bilitianx.technicalstorage.creativetab.TabTechnicalStorage;

import net.minecraft.item.Item;

public class ItemXtomIngot extends Item{
	public ItemXtomIngot() {
		this.setUnlocalizedName(TechnicalStorage.MODID + ".xtomIngot");
		this.setRegistryName("xtom_ingot");
		this.setCreativeTab(TabTechnicalStorage.TAB_TECHNICAL_STORAGE);
		this.setMaxStackSize(64);
	}
}
