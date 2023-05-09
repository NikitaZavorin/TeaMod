
package net.elo.taskthree.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.elo.taskthree.init.TaskthreeModTabs;

public class BlackTeaOreDustItem extends Item {
	public BlackTeaOreDustItem() {
		super(new Item.Properties().tab(TaskthreeModTabs.TAB_TEAS).stacksTo(64).rarity(Rarity.COMMON));
	}
}
