package me.tisleo.morebeautifulbuttons.items;

import me.tisleo.morebeautifulbuttons.MoreBeautifulButtons;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * The item needed for survival players to create new buttons belonging to this mod.
 * This class handle's the button press item's logic.
 */
public class ButtonPress extends Item {

    /**
     * The button press item.
     */
    public static final Item button_press = new ButtonPress(new FabricItemSettings().group(MoreBeautifulButtons.MORE_BUTTONS).maxCount(64));

    public ButtonPress(Settings settings) {
        super(settings);
    }

    /**
     * Adds the tooltip from lang file to the item.
     */
    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(new TranslatableText("item.mbb-mod.button_press.tooltip"));
    }

    /**
     * Adds the button press item to the game registry.
     */
    public static void register() {
        Registry.register(Registry.ITEM, new Identifier(MoreBeautifulButtons.MOD_ID, "button_press"), button_press);
    }
}
