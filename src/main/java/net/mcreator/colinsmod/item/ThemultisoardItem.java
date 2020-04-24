
package net.mcreator.colinsmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.colinsmod.ColinsModElements;

@ColinsModElements.ModElement.Tag
public class ThemultisoardItem extends ColinsModElements.ModElement {
	@ObjectHolder("colinsmod:themultisoard")
	public static final Item block = null;
	public ThemultisoardItem(ColinsModElements instance) {
		super(instance, 4);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 100;
			}

			public float getEfficiency() {
				return 31.5f;
			}

			public float getAttackDamage() {
				return 98f;
			}

			public int getHarvestLevel() {
				return 84;
			}

			public int getEnchantability() {
				return 28;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(Items.FEATHER, (int) (1)));
			}
		}, 3, 27.900000000000002f, new Item.Properties().group(ItemGroup.COMBAT)) {
		}.setRegistryName("themultisoard"));
	}
}
