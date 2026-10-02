package net.addi_ari.babyknife.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.ItemStackTemplate;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

public class ShankironItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 60, 4f, 0, 2, TagKey.create(Registries.ITEM, Identifier.parse("baby_knife:iron_babyknife_repair_items")));

	public ShankironItem(Item.Properties properties) {
		super(properties.sword(TOOL_MATERIAL, 2.8f, -3.3f));
	}

	@Override
	public ItemStackTemplate getCraftingRemainder(ItemStack itemstack) {
		return new ItemStackTemplate(this);
	}
}