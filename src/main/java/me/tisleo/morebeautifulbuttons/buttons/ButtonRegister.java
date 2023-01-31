package me.tisleo.morebeautifulbuttons.buttons;

import me.tisleo.morebeautifulbuttons.MoreBeautifulButtons;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractButtonBlock;
import net.minecraft.block.StoneButtonBlock;
import net.minecraft.block.WoodenButtonBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

/**
 * A class that registers new buttons; either of stone or wooden origin.
 * @author TisLeo (Leo)
 */
public class ButtonRegister {

    /**
     * Registers a new stone button. Default strength of 4.0F
     * @param buttonPath the button path name
     * @param settings the specific button block settings
     * @return an instance of the registered button
     */
    public static StoneButtonBlock registerNewStoneButton(String buttonPath, FabricBlockSettings settings) {
        StoneButtonBlock btnBlock = Registry.register(Registry.BLOCK, new Identifier(MoreBeautifulButtons.MOD_ID, buttonPath), new StoneButtonBlock(
                settings.strength(4.0f)
        ));

        toRegistry(buttonPath, btnBlock);

        return btnBlock;

    }

    /**
     * Registers a new wooden button.
     * @param buttonPath the button path name
     * @param settings the specific button block settings
     * @return an instance of the registered button
     */
    public static WoodenButtonBlock registerNewWoodButton(String buttonPath, FabricBlockSettings settings) {
        WoodenButtonBlock btnBlock = Registry.register(Registry.BLOCK, new Identifier(MoreBeautifulButtons.MOD_ID, buttonPath), new WoodenButtonBlock(
                settings
        ));

        toRegistry(buttonPath, btnBlock);

        return btnBlock;
    }

    /**
     * Adds a button to the game registry.
     * @param btnPath the button path name
     * @param btnBlock the button block to register
     */
    private static void toRegistry(String btnPath, AbstractButtonBlock btnBlock) {
        Registry.register(Registry.ITEM, new Identifier(MoreBeautifulButtons.MOD_ID, btnPath), new BlockItem(
                btnBlock, new FabricItemSettings().group(MoreBeautifulButtons.MORE_BUTTONS)
        ));
    }
}
