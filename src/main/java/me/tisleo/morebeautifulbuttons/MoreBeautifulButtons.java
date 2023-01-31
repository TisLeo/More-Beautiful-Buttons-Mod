package me.tisleo.morebeautifulbuttons;

import me.tisleo.morebeautifulbuttons.buttons.ButtonInit;
import me.tisleo.morebeautifulbuttons.items.ButtonPress;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MoreBeautifulButtons implements ModInitializer {

	/**
	 * The mod id.
	 */
	public static final String MOD_ID = "mbb-mod";

	/**
	 * The default console logger.
	 */
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

	/**
	 * Creates the inventory item group for the buttons.
	 */
	public static final ItemGroup MORE_BUTTONS = FabricItemGroupBuilder.create(
					new Identifier(MOD_ID, "more_beautiful_buttons"))
			.icon(() -> new ItemStack(Items.OAK_BUTTON))
			.build();

	/**
	 * Startup logic for the mod.
	 */
	@Override
	public void onInitialize() {
		LOGGER.info("Registering Items for More-Beautiful-Buttons mod...");
		ButtonPress.register();

		ButtonInit.logInit();

		LOGGER.info("MoreBeautifulButtons Initialised!");
	}
}
