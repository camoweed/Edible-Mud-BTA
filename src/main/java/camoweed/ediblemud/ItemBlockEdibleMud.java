package camoweed.ediblemud;

import net.minecraft.core.block.Block;
import net.minecraft.core.item.block.ItemBlock;

public class ItemBlockEdibleMud extends ItemBlock {
	public ItemBlockEdibleMud(Block<?> block) {
		super(block);
		this.maxStackSize = 1;
	}
}
