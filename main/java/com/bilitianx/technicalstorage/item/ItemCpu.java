package com.bilitianx.technicalstorage.item;

import com.bilitianx.technicalstorage.TechnicalStorage;
import com.bilitianx.technicalstorage.creativetab.TabTechnicalStorage;

import net.minecraft.item.Item;

public class ItemCpu extends Item {
	public ItemCpu(String RegistryName, String UnlocalizedName) {
		this.setUnlocalizedName(TechnicalStorage.MODID + "." + UnlocalizedName);
		this.setRegistryName(RegistryName);
		this.setCreativeTab(TabTechnicalStorage.TAB_TECHNICAL_STORAGE);
		this.setMaxStackSize(1);
	}
}
