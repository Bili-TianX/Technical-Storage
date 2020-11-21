package com.bilitianx.technicalstorage.block;

import com.bilitianx.technicalstorage.TechnicalStorage;
import com.bilitianx.technicalstorage.creativetab.TabTechnicalStorage;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class MainFrame extends Block{

	public MainFrame() {
		super(Material.ROCK);
		this.setUnlocalizedName(TechnicalStorage.MODID + ".mainFrame");
		this.setRegistryName("main_frame");
		this.setHarvestLevel("pickaxe", 1);
		this.setCreativeTab(TabTechnicalStorage.TAB_TECHNICAL_STORAGE);
		this.setHardness(5F);
	}
}
