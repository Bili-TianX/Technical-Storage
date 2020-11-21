package com.bilitianx.technicalstorage.item;

import com.bilitianx.technicalstorage.block.BlockRegistryHandler;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.client.event.ModelRegistryEvent;

@EventBusSubscriber
public class ItemRegistryHandler {
	public static final ItemXtomIngot ITEM_XTOM_INGOT = new ItemXtomIngot();
	
	public static final ItemBlock ITEM_XTOM_ORE = withRegistryName(
					new ItemBlock(BlockRegistryHandler.BLOCK_XTOM_ORE));
	public static final ItemBlock ITEM_XTOM_BLOCK = withRegistryName(
			new ItemBlock(BlockRegistryHandler.BLOCK_XTOM_BLOCK));
	public static final ItemBlock ITEM_MAIN_FRAME_BLOCK = withRegistryName(new ItemBlock(BlockRegistryHandler.MAIN_FRAME));
	
	public static final ItemCpu BASIC_CPU = new ItemCpu("basic_cpu", "basicCpu");
	public static final ItemCpu CRAFTING_CPU = new ItemCpu("crafting_cpu", "craftingCpu");
	public static final ItemCpu ADVANCED_CRAFTING_CPU = new ItemCpu("advanced_crafting_cpu", "advancedCraftingCpu");
	
	
    private static ItemBlock withRegistryName(ItemBlock item) {
        item.setRegistryName(item.getBlock().getRegistryName());
        return item;
    }
    
    @SubscribeEvent
    public static void onRegistry(Register<Item> event) {
        IForgeRegistry<Item> registry = event.getRegistry();
        ITEM_MAIN_FRAME_BLOCK.setMaxStackSize(1);
        registry.register(ITEM_XTOM_ORE);
        registry.register(ITEM_XTOM_INGOT);
        registry.register(ITEM_XTOM_BLOCK);
        registry.register(BASIC_CPU);
        registry.register(CRAFTING_CPU);
        registry.register(ADVANCED_CRAFTING_CPU);
        registry.register(ITEM_MAIN_FRAME_BLOCK);
    }
    
    
    private static void registerModel(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0,
                new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
    
    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public static void onModelRegistry(ModelRegistryEvent event) {
    	registerModel(ITEM_XTOM_ORE);
    	registerModel(ITEM_XTOM_INGOT);
    	registerModel(ITEM_XTOM_BLOCK);
    	registerModel(BASIC_CPU);
    	registerModel(CRAFTING_CPU);
    	registerModel(ADVANCED_CRAFTING_CPU);
    	registerModel(ITEM_MAIN_FRAME_BLOCK);
    }
}
