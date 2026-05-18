package camoweed.ediblemud;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogicEdible;
import net.minecraft.core.block.Blocks;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.Items;
import net.minecraft.core.world.World;
import net.minecraft.core.world.pos.TilePosc;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

public class BlockLogicEdibleMud extends BlockLogicEdible {

	public BlockLogicEdibleMud(Block<?> block) {
		super(block, 1, () -> Blocks.MUD.asItem());
		this.setBlockBounds(0.05F, 0.0F, 0.05F, 0.95F , 0.5F, 0.95F );
	}
	@Override
	public int getHealAmount(@NotNull World world, @NotNull TilePosc pos) {
		return 1;
	}
}
