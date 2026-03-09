package camoweed.ediblemud;

import net.minecraft.core.item.ItemStack;
import turniplabs.halplibe.helper.RecipeBuilder;
import turniplabs.halplibe.util.RecipeEntrypoint;

import static camoweed.ediblemud.Blocks.edibleMud;
import static camoweed.ediblemud.EdibleMud.MOD_ID;
import static org.apache.log4j.builders.appender.SocketAppenderBuilder.LOGGER;

public class Recipes implements RecipeEntrypoint {
	@Override
	public void onRecipesReady() {
		RecipeBuilder.Furnace(MOD_ID)
			.setInput(net.minecraft.core.block.Blocks.MUD_BAKED)
			.create("cook_mud", new ItemStack(edibleMud, 1));
	}

	@Override
	public void initNamespaces() {
		RecipeBuilder.initNameSpace(MOD_ID);
	}
}
