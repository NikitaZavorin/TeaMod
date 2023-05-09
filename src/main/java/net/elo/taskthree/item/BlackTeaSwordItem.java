
package net.elo.taskthree.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.elo.taskthree.init.TaskthreeModTabs;
import net.elo.taskthree.init.TaskthreeModItems;

public class BlackTeaSwordItem extends SwordItem {
	public BlackTeaSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 100;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 3.2f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(TaskthreeModItems.BLACK_TEA_ORE_DUST.get()));
			}
		}, 3, -2.2999999999999998f, new Item.Properties().tab(TaskthreeModTabs.TAB_TEAS));
	}
}
