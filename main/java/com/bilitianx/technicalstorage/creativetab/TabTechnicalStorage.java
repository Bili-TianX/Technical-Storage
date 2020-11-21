package com.bilitianx.technicalstorage.creativetab;

import com.bilitianx.technicalstorage.item.ItemRegistryHandler;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class TabTechnicalStorage extends CreativeTabs {
	public static final TabTechnicalStorage TAB_TECHNICAL_STORAGE = new TabTechnicalStorage();
	public TabTechnicalStorage() {
		super("technicalstorage");
	}
	
	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ItemRegistryHandler.ITEM_XTOM_INGOT);
	}
	
	@Override
	public boolean hasSearchBar() {
		return true;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() {
		return "technicalstorage.png";
	}
}
