
package net.elo.taskthree.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.elo.taskthree.init.TaskthreeModTabs;
import net.elo.taskthree.init.TaskthreeModItems;
import net.elo.taskthree.init.TaskthreeModBlocks;

public abstract class BlackArmorItem extends ArmorItem {
	public BlackArmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 10;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{2, 4, 3, 2}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 9;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(TaskthreeModItems.BLACK_TEA_ORE_DUST.get()), new ItemStack(TaskthreeModBlocks.BLACK_TEA_ORE_BLOCK.get()));
			}

			@Override
			public String getName() {
				return "black_armor";
			}

			@Override
			public float getToughness() {
				return 0.5f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		}, slot, properties);
	}

	public static class Helmet extends BlackArmorItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(TaskthreeModTabs.TAB_TEAS));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "taskthree:textures/models/armor/black_layer_1.png";
		}
	}

	public static class Chestplate extends BlackArmorItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(TaskthreeModTabs.TAB_TEAS));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "taskthree:textures/models/armor/black_layer_1.png";
		}
	}

	public static class Leggings extends BlackArmorItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(TaskthreeModTabs.TAB_TEAS));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "taskthree:textures/models/armor/black_layer_2.png";
		}
	}

	public static class Boots extends BlackArmorItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(TaskthreeModTabs.TAB_TEAS));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "taskthree:textures/models/armor/black_layer_1.png";
		}
	}
}
