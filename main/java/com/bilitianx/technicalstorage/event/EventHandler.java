package com.bilitianx.technicalstorage.event;

import com.bilitianx.technicalstorage.TechnicalStorage;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class EventHandler {
	@SubscribeEvent
	public static void onPlayerJoin(EntityJoinWorldEvent event) {
		Entity entity = event.getEntity();
		if(! entity.world.isRemote && entity instanceof EntityPlayer) {
			entity.sendMessage(
					new TextComponentTranslation("message.technicalstorage.welcome",
							TechnicalStorage.NAME, entity.getName()));
		}
	}
}
