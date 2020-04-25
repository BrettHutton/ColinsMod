
package net.mcreator.colinsmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.colinsmod.ColinsModElements;

@ColinsModElements.ModElement.Tag
public class ColinspickaxeItem extends ColinsModElements.ModElement {
	@ObjectHolder("colinsmod:colinspickaxe")
	public static final Item block = null;
	public ColinspickaxeItem(ColinsModElements instance) {
		super(instance, 6);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 100;
			}

			public float getEfficiency() {
				return 55.5f;
			}

			public float getAttackDamage() {
				return 30f;
			}

			public int getHarvestLevel() {
				return 100;
			}

			public int getEnchantability() {
				return 89;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(Items.DIAMOND, (int) (1)));
			}
		}, 1, 13.200000000000003f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("colinspickaxe"));
	}
}
