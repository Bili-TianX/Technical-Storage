package com.bilitianx.technicalstorage.block;

import com.bilitianx.technicalstorage.TechnicalStorage;
import com.bilitianx.technicalstorage.creativetab.TabTechnicalStorage;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockXtomBlock extends Block {
	public BlockXtomBlock() {
		super(Material.ROCK);
		this.setUnlocalizedName(TechnicalStorage.MODID + ".xtomBlock");
		this.setRegistryName("xtom_block");
		this.setHarvestLevel("pickaxe", 1);
		this.setCreativeTab(TabTechnicalStorage.TAB_TECHNICAL_STORAGE);
		this.setHardness(3.0F);
	}
}
