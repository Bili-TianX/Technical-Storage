package com.bilitianx.technicalstorage.block;

import com.bilitianx.technicalstorage.TechnicalStorage;
import com.bilitianx.technicalstorage.creativetab.TabTechnicalStorage;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockXtomOre extends Block {
	public BlockXtomOre() {
		super(Material.ROCK);
		this.setUnlocalizedName(TechnicalStorage.MODID + ".xtomOre");
		this.setRegistryName("xtom_ore");
		this.setHarvestLevel("pickaxe", 1);
		this.setCreativeTab(TabTechnicalStorage.TAB_TECHNICAL_STORAGE);
		this.setHardness(2.5F);
	}
}
