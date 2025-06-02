package net.keylime36.modularweapons.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.keylime36.modularweapons.ModularWeapons;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item TEST_MODULE = registerItem("test_module", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(ModularWeapons.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ModularWeapons.LOGGER.info("Registering Mod Items for " + ModularWeapons.MOD_ID);

    }
}
