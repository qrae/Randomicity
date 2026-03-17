package me.qrae.randomicity;

import me.qrae.randomicity.block.ModBlocks;
import me.qrae.randomicity.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Randomicity implements ModInitializer {
	public static final String MOD_ID = "randomicity";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
	}
}