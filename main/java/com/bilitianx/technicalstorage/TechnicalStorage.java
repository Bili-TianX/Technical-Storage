package com.bilitianx.technicalstorage;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import com.bilitianx.technicalstorage.crafting.FurnaceRecipeRegistryHandler;
import com.bilitianx.technicalstorage.item.ItemRegistryHandler;
import com.bilitianx.technicalstorage.worldgen.XtomWorldGen;


@Mod(modid = TechnicalStorage.MODID, name = TechnicalStorage.NAME, version = TechnicalStorage.VERSION, acceptedMinecraftVersions = TechnicalStorage.MCVERSION)
public class TechnicalStorage
{
    public static final String MODID = "technicalstorage";
    public static final String NAME = "Technical Storage";
    public static final String VERSION = "1.0";
    public static final String MCVERSION = "1.12.2";
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	GameRegistry.registerWorldGenerator(new XtomWorldGen(), 3);
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        FurnaceRecipeRegistryHandler.register();
        OreDictionary.registerOre("ingotXtom", ItemRegistryHandler.ITEM_XTOM_INGOT);
        OreDictionary.registerOre("oreXtom", ItemRegistryHandler.ITEM_XTOM_ORE);
    }
}
