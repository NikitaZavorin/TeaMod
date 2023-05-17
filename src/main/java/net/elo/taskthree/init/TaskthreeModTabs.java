
package net.elo.taskthree.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class TaskthreeModTabs {
	public static CreativeModeTab TAB_TEAS;

	public static void load() {
		TAB_TEAS = new CreativeModeTab("tabteas") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(TaskthreeModItems.BLACK_TEA_ORE_DUST.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
