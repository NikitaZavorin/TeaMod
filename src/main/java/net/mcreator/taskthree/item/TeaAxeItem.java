
package net.mcreator.taskthree.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;
import net.minecraft.network.chat.Component;

import net.mcreator.taskthree.init.TaskthreeModTabs;
import net.mcreator.taskthree.init.TaskthreeModItems;

import java.util.List;

public class TeaAxeItem extends AxeItem {
	public TeaAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 90;
			}

			public float getSpeed() {
				return 10f;
			}

			public float getAttackDamageBonus() {
				return 1.9999999999999996f;
			}

			public int getLevel() {
				return 0;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(TaskthreeModItems.BLACK_TEA_ORE_DUST.get()));
			}
		}, 1, -3.3f, new Item.Properties().tab(TaskthreeModTabs.TAB_TEAS));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("Test"));
		list.add(Component.literal("\u0422\u0435\u0441\u0442"));
	}
}
