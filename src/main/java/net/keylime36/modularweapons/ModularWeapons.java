package net.keylime36.modularweapons;

import net.fabricmc.api.ModInitializer;

import net.keylime36.modularweapons.item.ModItemGroups;
import net.keylime36.modularweapons.item.ModItems;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ModularWeapons implements ModInitializer {
	public static final String MOD_ID = "modularweapons";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
	}
}