package net.addi_ari.babyknife.mixin;

import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.Mixin;

import net.minecraft.world.item.crafting.RepairItemRecipe;
import net.minecraft.world.item.crafting.CraftingInput;
import net.minecraft.world.item.ItemStack;

import net.addi_ari.babyknife.init.BabyKnifeModItems;

import java.util.ArrayList;

import com.google.common.collect.Lists;

@Mixin(RepairItemRecipe.class)
public abstract class RepairItemRecipeMixin {
	@Inject(method = "assemble(Lnet/minecraft/world/item/crafting/CraftingInput;)Lnet/minecraft/world/item/ItemStack;", at = @At("HEAD"))
	public void assemble(CraftingInput input, CallbackInfoReturnable<ItemStack> cir) {
		ItemStack itemStack, itemStack3;
		ArrayList<ItemStack> list = Lists.newArrayList();
		for (int i = 0; i < input.ingredientCount(); ++i) {
			itemStack = input.getItem(i);
			if (itemStack.isEmpty())
				continue;
			list.add(itemStack);
		}
		itemStack3 = list.get(0);
		if (itemStack3.is(BabyKnifeModItems.STONE_BABYKNIFE))
			cir.setReturnValue(ItemStack.EMPTY);
		else if (itemStack3.is(BabyKnifeModItems.WOOD_BABYKNIFE))
			cir.setReturnValue(ItemStack.EMPTY);
		else if (itemStack3.is(BabyKnifeModItems.IRON_BABYKNIFE))
			cir.setReturnValue(ItemStack.EMPTY);
		else if (itemStack3.is(BabyKnifeModItems.GOLD_BABYKNIFE))
			cir.setReturnValue(ItemStack.EMPTY);
		else if (itemStack3.is(BabyKnifeModItems.DIAMOND_BABYKNIFE))
			cir.setReturnValue(ItemStack.EMPTY);
		else if (itemStack3.is(BabyKnifeModItems.NETHERITE_BABYKNIFE))
			cir.setReturnValue(ItemStack.EMPTY);
	}
}