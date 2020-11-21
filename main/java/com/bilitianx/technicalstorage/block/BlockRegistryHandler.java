package com.bilitianx.technicalstorage.block;

import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraft.block.Block;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

@EventBusSubscriber
public class BlockRegistryHandler {
	public static final BlockXtomOre BLOCK_XTOM_ORE = new BlockXtomOre();
	public static final BlockXtomBlock BLOCK_XTOM_BLOCK = new BlockXtomBlock();
	public static final MainFrame MAIN_FRAME = new MainFrame();
	
	@SubscribeEvent
	public static void onRegistry(Register<Block> event) {
		IForgeRegistry<Block> registry = event.getRegistry();
		registry.register(BLOCK_XTOM_ORE);
		registry.register(BLOCK_XTOM_BLOCK);
		registry.register(MAIN_FRAME);
	}

}
