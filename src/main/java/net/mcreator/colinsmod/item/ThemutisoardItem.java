
package net.mcreator.colinsmod.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.colinsmod.ColinsModElements;

@ColinsModElements.ModElement.Tag
public class ThemutisoardItem extends ColinsModElements.ModElement {
	@ObjectHolder("colinsmod:themutisoard")
	public static final Item block = null;
	public ThemutisoardItem(ColinsModElements instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 156;
			}

			public float getEfficiency() {
				return 18.5f;
			}

			public float getAttackDamage() {
				return 2f;
			}

			public int getHarvestLevel() {
				return 100;
			}

			public int getEnchantability() {
				return 131;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(Items.COAL, (int) (1)));
			}
		}, 3, 27.700000000000003f, new Item.Properties().group(ItemGroup.COMBAT)) {
			@Override
			@OnlyIn(Dist.CLIENT)
			public boolean hasEffect(ItemStack itemstack) {
				return true;
			}
		}.setRegistryName("themutisoard"));
	}
}
