package camoweed.ediblemud;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.sound.BlockSounds;
import turniplabs.halplibe.helper.BlockBuilder;
import static camoweed.ediblemud.EdibleMud.MOD_ID;
import turniplabs.halplibe.helper.creativeInventory.CreativeInventoryCategory;
import turniplabs.halplibe.helper.creativeInventory.CreativeInventoryPlacement;

public class Blocks {
	public static Block<BlockLogicEdibleMud> edibleMud;
public static void initBlocks() {
		edibleMud = new BlockBuilder(MOD_ID)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.FOOD))
			.setHardness(0.1f)
			.setResistance(1.0f)
			.setBlockSound(BlockSounds.CLOTH)
			.addTags(BlockTags.MINEABLE_BY_SHOVEL)
			.build("ediblemud", 15001, BlockLogicEdibleMud::new)
			.setBlockItem(() -> new ItemBlockEdibleMud(edibleMud));
}
}
