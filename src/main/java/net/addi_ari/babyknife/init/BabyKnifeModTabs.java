/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.addi_ari.babyknife.init;

import net.minecraft.world.item.CreativeModeTabs;

import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;

public class BabyKnifeModTabs {
	public static void load() {
		CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.TOOLS_AND_UTILITIES).register(tabData -> {
			tabData.accept(BabyKnifeModItems.STONE_BABYKNIFE);
			tabData.accept(BabyKnifeModItems.WOOD_BABYKNIFE);
			tabData.accept(BabyKnifeModItems.IRON_BABYKNIFE);
			tabData.accept(BabyKnifeModItems.GOLD_BABYKNIFE);
			tabData.accept(BabyKnifeModItems.DIAMOND_BABYKNIFE);
			tabData.accept(BabyKnifeModItems.NETHERITE_BABYKNIFE);
		});
	}
}