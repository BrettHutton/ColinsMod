
package net.mcreator.colinsmod.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ArmorItem;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.Entity;

import net.mcreator.colinsmod.ColinsModElements;

@ColinsModElements.ModElement.Tag
public class ColinArmorItem extends ColinsModElements.ModElement {
	@ObjectHolder("colinsmod:colinarmorhelmet")
	public static final Item helmet = null;
	@ObjectHolder("colinsmod:colinarmorbody")
	public static final Item body = null;
	@ObjectHolder("colinsmod:colinarmorlegs")
	public static final Item legs = null;
	@ObjectHolder("colinsmod:colinarmorboots")
	public static final Item boots = null;
	public ColinArmorItem(ColinsModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		IArmorMaterial armormaterial = new IArmorMaterial() {
			public int getDurability(EquipmentSlotType slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 0;
			}

			public int getDamageReductionAmount(EquipmentSlotType slot) {
				return new int[]{1000, 1000, 1000, 1000}[slot.getIndex()];
			}

			public int getEnchantability() {
				return 11;
			}

			public net.minecraft.util.SoundEvent getSoundEvent() {
				return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.anvil.place"));
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(Items.DIAMOND, (int) (1)));
			}

			@OnlyIn(Dist.CLIENT)
			public String getName() {
				return "colinarmor";
			}

			public float getToughness() {
				return 2f;
			}
		};
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.HEAD, new Item.Properties().group(ItemGroup.COMBAT)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "colinsmod:textures/models/armor/colinarmor__layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}
		}.setRegistryName("colinarmorhelmet"));
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.CHEST, new Item.Properties().group(ItemGroup.COMBAT)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "colinsmod:textures/models/armor/colinarmor__layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}
		}.setRegistryName("colinarmorbody"));
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.LEGS, new Item.Properties().group(ItemGroup.COMBAT)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "colinsmod:textures/models/armor/colinarmor__layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}
		}.setRegistryName("colinarmorlegs"));
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.FEET, new Item.Properties().group(ItemGroup.COMBAT)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "colinsmod:textures/models/armor/colinarmor__layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}
		}.setRegistryName("colinarmorboots"));
	}
}
