/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.addi_ari.babyknife.init;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

import net.addi_ari.babyknife.item.*;
import net.addi_ari.babyknife.BabyKnifeMod;

import java.util.function.Function;

public class BabyKnifeModItems {
	public static Item STONE_BABYKNIFE;
	public static Item WOOD_BABYKNIFE;
	public static Item IRON_BABYKNIFE;
	public static Item GOLD_BABYKNIFE;
	public static Item DIAMOND_BABYKNIFE;
	public static Item NETHERITE_BABYKNIFE;

	public static void load() {
		STONE_BABYKNIFE = register("stone_babyknife", ShankItem::new);
		WOOD_BABYKNIFE = register("wood_babyknife", ShankwoodItem::new);
		IRON_BABYKNIFE = register("iron_babyknife", ShankironItem::new);
		GOLD_BABYKNIFE = register("gold_babyknife", GoldShankItem::new);
		DIAMOND_BABYKNIFE = register("diamond_babyknife", DiamondShankItem::new);
		NETHERITE_BABYKNIFE = register("netherite_babyknife", NetheriteShankItem::new);
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> I register(String name, Function<Item.Properties, ? extends I> supplier) {
		return (I) Items.registerItem(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(BabyKnifeMod.MODID, name)), (Function<Item.Properties, Item>) supplier);
	}
}