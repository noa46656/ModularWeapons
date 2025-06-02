package net.keylime36.modularweapons.item.custom;

import net.minecraft.item.Item;

public class ModuleItem extends Item {

    @Override
    public int getMaxCount() {
        return 1;
    }

    public ModuleItem(Settings settings) {
        super(settings);
    }
}
