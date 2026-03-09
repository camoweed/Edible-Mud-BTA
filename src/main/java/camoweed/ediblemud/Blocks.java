package camoweed.ediblemud;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.sound.BlockSounds;
import turniplabs.halplibe.helper.BlockBuilder;
import static camoweed.ediblemud.EdibleMud.MOD_ID;

public class Blocks {
	public static Block<BlockLogicEdibleMud> edibleMud;
public static void initBlocks() {
		edibleMud = new BlockBuilder(MOD_ID)
			.setHardness(0.1f)
			.setResistance(1.0f)
			//.setLuminance(0)
			.setBlockSound(BlockSounds.CLOTH)
			.addTags(BlockTags.MINEABLE_BY_SHOVEL)
			.build("ediblemud", 15001, BlockLogicEdibleMud::new);



	}
}
