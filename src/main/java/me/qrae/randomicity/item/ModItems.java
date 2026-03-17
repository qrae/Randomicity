package me.qrae.randomicity.item;

import me.qrae.randomicity.Randomicity;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item GOLD_CHAIN = registerItem("gold_chain", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Randomicity.MOD_ID, name), item);
    }
    public static void registerModItems() {
        Randomicity.LOGGER.info("Registering mod items for " + Randomicity.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(GOLD_CHAIN);
        });
    }
}
