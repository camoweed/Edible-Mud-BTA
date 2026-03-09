package camoweed.ediblemud;

import net.minecraft.client.render.EntityRenderDispatcher;
import net.minecraft.client.render.TileEntityRenderDispatcher;
import net.minecraft.client.render.block.color.BlockColorDispatcher;
import net.minecraft.client.render.block.model.BlockModelCake;
import net.minecraft.client.render.block.model.BlockModelDispatcher;
import net.minecraft.client.render.block.model.BlockModelStandard;
import net.minecraft.client.render.item.model.ItemModelDispatcher;
import net.minecraft.core.util.helper.Side;
import turniplabs.halplibe.helper.ModelHelper;
import turniplabs.halplibe.util.ModelEntrypoint;

import static camoweed.ediblemud.Blocks.edibleMud;

public class Models implements ModelEntrypoint {

	@Override
	public void initBlockModels(BlockModelDispatcher dispatcher) {
		ModelHelper.setBlockModel(edibleMud, () ->
			new BlockModelCake<>(edibleMud)
				.setTex(0,"minecraft:block/mud",Side.sides)
//				.setTex(1,"ediblemud:block/less_mud",Side.sides)
//				.setTex(2,"minecraft:block/mud",Side.sides)
//				.setTex(3,"minecraft:block/mud",Side.sides)
		);


	}


	@Override
	public void initItemModels(ItemModelDispatcher dispatcher) {}

	@Override
	public void initEntityModels(EntityRenderDispatcher dispatcher) {}

	@Override
	public void initTileEntityModels(TileEntityRenderDispatcher dispatcher) {}

	@Override
	public void initBlockColors(BlockColorDispatcher dispatcher) {}

}
