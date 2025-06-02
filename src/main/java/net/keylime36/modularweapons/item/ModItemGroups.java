package net.keylime36.modularweapons.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.keylime36.modularweapons.ModularWeapons;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup ModularWeaponsGroup = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(ModularWeapons.MOD_ID, "modular_weapons_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.TEST_MODULE))
                    .displayName(Text.translatable("itemgroup.modularweapons.modular_weapons_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.TEST_MODULE);
                    }).build());

    public static void registerItemGroups() {
        ModularWeapons.LOGGER.info("Registering Item Groups for " + ModularWeapons.MOD_ID);
    }
}
