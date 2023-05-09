
package net.elo.taskthree.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.elo.taskthree.init.TaskthreeModTabs;
import net.elo.taskthree.init.TaskthreeModItems;

public class BlackTeaPickaxeItem extends PickaxeItem {
	public BlackTeaPickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 50;
			}

			public float getSpeed() {
				return 10f;
			}

			public float getAttackDamageBonus() {
				return 2f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 5;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(TaskthreeModItems.BLACK_TEA_ORE_DUST.get()));
			}
		}, 1, -3f, new Item.Properties().tab(TaskthreeModTabs.TAB_TEAS));
	}
}
