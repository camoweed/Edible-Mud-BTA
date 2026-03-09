package camoweed.ediblemud;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogicEdible;
import net.minecraft.core.block.Blocks;

public class BlockLogicEdibleMud extends BlockLogicEdible {

	public BlockLogicEdibleMud(Block<?> block) {
		super(block, 1, 1, () -> Blocks.MUD.asItem());
		this.setBlockBounds(0.05F, 0.0F, 0.05F, 0.95F , 0.5F, 0.95F );
	}

}
