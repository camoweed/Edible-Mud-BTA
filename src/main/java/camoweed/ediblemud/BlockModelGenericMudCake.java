package camoweed.ediblemud;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.block.color.BlockColorDispatcher;
import net.minecraft.client.render.block.model.BlockModelDispatcher;
import net.minecraft.client.render.block.model.generic.BlockModelGeneric;
import net.minecraft.client.render.tessellator.TessellatorGeneral;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogic;
import org.jetbrains.annotations.NotNull;
import org.useless.dragonfly.models.block.StaticBlockModel;

// i just copied BlockModelGenericCake cus wtf

@Environment(EnvType.CLIENT)
public class BlockModelGenericMudCake<T extends BlockLogic> extends BlockModelGeneric<T> {
	public final StaticBlockModel[] models = new StaticBlockModel[6];

	public BlockModelGenericMudCake(@NotNull Block<T> block) {
		super(block, BlockModelDispatcher.loadDataModel("ediblemud:block/edible_mud/0"));

		for(int i = 0; i < this.models.length; ++i) {
			this.models[i] = BlockModelDispatcher.loadDataModel("ediblemud:block/edible_mud/" + i).asModel();
		}

	}
	public @NotNull StaticBlockModel getModelFromData(int data) {return this.models[data % this.models.length];}
}
