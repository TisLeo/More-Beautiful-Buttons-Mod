package me.tisleo.morebeautifulbuttons.buttons;

import me.tisleo.morebeautifulbuttons.MoreBeautifulButtons;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.sound.BlockSoundGroup;

/**
 * Registers all the needed buttons for this mod.
 * @author TisLeo (Leo)
 */
public class ButtonInit {

    // LIGHT BUTTONS
    private static final StoneButtonBlock glowstone_btn = registerLightButton("glowstone_btn");
    private static final StoneButtonBlock beacon_btn = registerLightButton("beacon_btn");
    private static final StoneButtonBlock sea_lantern_btn = registerLightButton("sea_lantern_btn");

    // WET BUTTONS
    private static final StoneButtonBlock sponge_btn = registerWetButton("sponge_btn");
    private static final StoneButtonBlock slime_block_btn = registerWetButton("slime_block_btn");

    // DIRT BUTTONS
    private static final StoneButtonBlock dirt_btn = registerDirtButton("dirt_btn");
    private static final StoneButtonBlock grass_block_btn = registerDirtButton("grass_block_btn");
    private static final StoneButtonBlock coarse_dirt_btn = registerDirtButton("coarse_dirt_btn");
    private static final StoneButtonBlock podzol_btn = registerDirtButton("podzol_btn");
    private static final StoneButtonBlock gravel_btn = registerDirtButton("gravel_btn");
    private static final StoneButtonBlock farmland_btn = registerDirtButton("farmland_btn");
    private static final StoneButtonBlock clay_btn = registerDirtButton("clay_btn");

    // GLASS BUTTONS
    private static final StoneButtonBlock white_stained_glass_btn = registerGlassButton("white_stained_glass_btn");
    private static final StoneButtonBlock orange_stained_glass_btn = registerGlassButton("orange_stained_glass_btn");
    private static final StoneButtonBlock magenta_stained_glass_btn = registerGlassButton("magenta_stained_glass_btn");
    private static final StoneButtonBlock light_blue_stained_glass_btn = registerGlassButton("light_blue_stained_glass_btn");
    private static final StoneButtonBlock yellow_stained_glass_btn = registerGlassButton("yellow_stained_glass_btn");
    private static final StoneButtonBlock lime_stained_glass_btn = registerGlassButton("lime_stained_glass_btn");
    private static final StoneButtonBlock pink_stained_glass_btn = registerGlassButton("pink_stained_glass_btn");
    private static final StoneButtonBlock gray_stained_glass_btn = registerGlassButton("gray_stained_glass_btn");
    private static final StoneButtonBlock light_gray_stained_glass_btn = registerGlassButton("light_gray_stained_glass_btn");
    private static final StoneButtonBlock cyan_stained_glass_btn = registerGlassButton("cyan_stained_glass_btn");
    private static final StoneButtonBlock purple_stained_glass_btn = registerGlassButton("purple_stained_glass_btn");
    private static final StoneButtonBlock blue_stained_glass_btn = registerGlassButton("blue_stained_glass_btn");
    private static final StoneButtonBlock brown_stained_glass_btn = registerGlassButton("brown_stained_glass_btn");
    private static final StoneButtonBlock green_stained_glass_btn = registerGlassButton("green_stained_glass_btn");
    private static final StoneButtonBlock red_stained_glass_btn = registerGlassButton("red_stained_glass_btn");
    private static final StoneButtonBlock black_stained_glass_btn = registerGlassButton("black_stained_glass_btn");
    private static final StoneButtonBlock glass_btn = registerGlassButton("glass_btn");
    private static final StoneButtonBlock packed_ice_btn = registerGlassButton("packed_ice_btn");
    private static final StoneButtonBlock ice_btn = registerGlassButton("ice_btn");

    // SAND BUTTONS
    private static final StoneButtonBlock white_concrete_powder_btn = registerSandButton("white_concrete_powder_btn");
    private static final StoneButtonBlock orange_concrete_powder_btn = registerSandButton("orange_concrete_powder_btn");
    private static final StoneButtonBlock magenta_concrete_powder_btn = registerSandButton("magenta_concrete_powder_btn");
    private static final StoneButtonBlock light_blue_concrete_powder_btn = registerSandButton("light_blue_concrete_powder_btn");
    private static final StoneButtonBlock yellow_concrete_powder_btn = registerSandButton("yellow_concrete_powder_btn");
    private static final StoneButtonBlock lime_concrete_powder_btn = registerSandButton("lime_concrete_powder_btn");
    private static final StoneButtonBlock pink_concrete_powder_btn = registerSandButton("pink_concrete_powder_btn");
    private static final StoneButtonBlock gray_concrete_powder_btn = registerSandButton("gray_concrete_powder_btn");
    private static final StoneButtonBlock light_gray_concrete_powder_btn = registerSandButton("light_gray_concrete_powder_btn");
    private static final StoneButtonBlock cyan_concrete_powder_btn = registerSandButton("cyan_concrete_powder_btn");
    private static final StoneButtonBlock purple_concrete_powder_btn = registerSandButton("purple_concrete_powder_btn");
    private static final StoneButtonBlock blue_concrete_powder_btn = registerSandButton("blue_concrete_powder_btn");
    private static final StoneButtonBlock brown_concrete_powder_btn = registerSandButton("brown_concrete_powder_btn");
    private static final StoneButtonBlock green_concrete_powder_btn = registerSandButton("green_concrete_powder_btn");
    private static final StoneButtonBlock red_concrete_powder_btn = registerSandButton("red_concrete_powder_btn");
    private static final StoneButtonBlock black_concrete_powder_btn = registerSandButton("black_concrete_powder_btn");
    private static final StoneButtonBlock sand_btn = registerSandButton("sand_btn");
    private static final StoneButtonBlock red_sand_btn = registerSandButton("red_sand_btn");
    private static final StoneButtonBlock soul_sand_btn = registerSandButton("soul_sand_btn");

    // STONE BUTTONS
    private static final StoneButtonBlock granite_btn = registerStoneButton("granite_btn");
    private static final StoneButtonBlock polished_granite_btn = registerStoneButton("polished_granite_btn");
    private static final StoneButtonBlock diorite_btn = registerStoneButton("diorite_btn");
    private static final StoneButtonBlock polished_diorite_btn = registerStoneButton("polished_diorite_btn");
    private static final StoneButtonBlock andesite_btn = registerStoneButton("andesite_btn");
    private static final StoneButtonBlock polished_andesite_btn = registerStoneButton("polished_andesite_btn");
    private static final StoneButtonBlock cobblestone_btn = registerStoneButton("cobblestone_btn");
    private static final StoneButtonBlock bedrock_btn = registerStoneButton("bedrock_btn");
    private static final StoneButtonBlock lapis_lazuli_block_btn = registerStoneButton("lapis_lazuli_block_btn");
    private static final StoneButtonBlock sandstone_btn = registerStoneButton("sandstone_btn");
    private static final StoneButtonBlock chiseled_sandstone_btn = registerStoneButton("chiseled_sandstone_btn");
    private static final StoneButtonBlock gold_block_btn = registerStoneButton("gold_block_btn");
    private static final StoneButtonBlock iron_block_btn = registerStoneButton("iron_block_btn");
    private static final StoneButtonBlock bricks_btn = registerStoneButton("bricks_btn");
    private static final StoneButtonBlock tnt_btn = registerStoneButton("tnt_btn");
    private static final StoneButtonBlock mossy_cobblestone_btn = registerStoneButton("mossy_cobblestone_btn");
    private static final StoneButtonBlock obsidian_btn = registerStoneButton("obsidian_btn");
    private static final StoneButtonBlock diamond_block_btn = registerStoneButton("diamond_block_btn");
    private static final StoneButtonBlock pumpkin_btn = registerStoneButton("pumpkin_btn");
    private static final StoneButtonBlock netherrack_btn = registerStoneButton("netherrack_btn");
    private static final StoneButtonBlock cake_block_btn = registerStoneButton("cake_block_btn");
    private static final StoneButtonBlock stone_bricks_btn = registerStoneButton("stone_bricks_btn");
    private static final StoneButtonBlock mossy_stone_bricks_btn = registerStoneButton("mossy_stone_bricks_btn");
    private static final StoneButtonBlock cracked_stone_bricks_btn = registerStoneButton("cracked_stone_bricks_btn");
    private static final StoneButtonBlock chiseled_stone_bricks_btn = registerStoneButton("chiseled_stone_bricks_btn");
    private static final StoneButtonBlock melon_block_btn = registerStoneButton("melon_block_btn");
    private static final StoneButtonBlock mycelium_btn = registerStoneButton("mycelium_btn");
    private static final StoneButtonBlock lily_pad_btn = registerStoneButton("lily_pad_btn");
    private static final StoneButtonBlock nether_brick_btn = registerStoneButton("nether_brick_btn");
    private static final StoneButtonBlock emerald_block_btn = registerStoneButton("emerald_block_btn");
    private static final StoneButtonBlock redstone_block_btn = registerStoneButton("redstone_block_btn");
    private static final StoneButtonBlock quartz_block_btn = registerStoneButton("quartz_block_btn");
    private static final StoneButtonBlock chiseled_quartz_block_btn = registerStoneButton("chiseled_quartz_block_btn");
    private static final StoneButtonBlock pillar_quartz_block_btn = registerStoneButton("pillar_quartz_block_btn");
    private static final StoneButtonBlock prismarine_btn = registerStoneButton("prismarine_btn");
    private static final StoneButtonBlock prismarine_bricks_btn = registerStoneButton("prismarine_bricks_btn");
    private static final StoneButtonBlock dark_prismarine_btn = registerStoneButton("dark_prismarine_btn");
    private static final StoneButtonBlock hay_block_btn = registerStoneButton("hay_block_btn");
    private static final StoneButtonBlock block_of_coal_btn = registerStoneButton("block_of_coal_btn");
    private static final StoneButtonBlock red_sandstone_btn = registerStoneButton("red_sandstone_btn");
    private static final StoneButtonBlock chiseled_red_sandstone_btn = registerStoneButton("chiseled_red_sandstone_btn");
    private static final StoneButtonBlock smooth_red_sandstone_btn = registerStoneButton("smooth_red_sandstone_btn");
    private static final StoneButtonBlock smooth_sandstone_btn = registerStoneButton("smooth_sandstone_btn");
    private static final StoneButtonBlock chorus_plant_btn = registerStoneButton("chorus_plant_btn");
    private static final StoneButtonBlock chorus_flower_btn = registerStoneButton("chorus_flower_btn");
    private static final StoneButtonBlock purpur_block_btn = registerStoneButton("purpur_block_btn");
    private static final StoneButtonBlock purpur_pillar_btn = registerStoneButton("purpur_pillar_btn");
    private static final StoneButtonBlock end_stone_bricks_btn = registerStoneButton("end_stone_bricks_btn");
    private static final StoneButtonBlock magma_block_btn = registerStoneButton("magma_block_btn");
    private static final StoneButtonBlock nether_wart_block_btn = registerStoneButton("nether_wart_block_btn");
    private static final StoneButtonBlock red_nether_brick_btn = registerStoneButton("red_nether_brick_btn");
    private static final StoneButtonBlock bone_block_btn = registerStoneButton("bone_block_btn");
    private static final StoneButtonBlock white_shulker_box_btn = registerStoneButton("white_shulker_box_btn");
    private static final StoneButtonBlock orange_shulker_box_btn = registerStoneButton("orange_shulker_box_btn");
    private static final StoneButtonBlock magenta_shulker_box_btn = registerStoneButton("magenta_shulker_box_btn");
    private static final StoneButtonBlock light_blue_shulker_box_btn = registerStoneButton("light_blue_shulker_box_btn");
    private static final StoneButtonBlock yellow_shulker_box_btn = registerStoneButton("yellow_shulker_box_btn");
    private static final StoneButtonBlock lime_shulker_box_btn = registerStoneButton("lime_shulker_box_btn");
    private static final StoneButtonBlock pink_shulker_box_btn = registerStoneButton("pink_shulker_box_btn");
    private static final StoneButtonBlock gray_shulker_box_btn = registerStoneButton("gray_shulker_box_btn");
    private static final StoneButtonBlock light_gray_shulker_box_btn = registerStoneButton("light_gray_shulker_box_btn");
    private static final StoneButtonBlock cyan_shulker_box_btn = registerStoneButton("cyan_shulker_box_btn");
    private static final StoneButtonBlock purple_shulker_box_btn = registerStoneButton("purple_shulker_box_btn");
    private static final StoneButtonBlock blue_shulker_box_btn = registerStoneButton("blue_shulker_box_btn");
    private static final StoneButtonBlock brown_shulker_box_btn = registerStoneButton("brown_shulker_box_btn");
    private static final StoneButtonBlock green_shulker_box_btn = registerStoneButton("green_shulker_box_btn");
    private static final StoneButtonBlock red_shulker_box_btn = registerStoneButton("red_shulker_box_btn");
    private static final StoneButtonBlock black_shulker_box_btn = registerStoneButton("black_shulker_box_btn");
    private static final StoneButtonBlock white_glazed_terracotta_btn = registerStoneButton("white_glazed_terracotta_btn");
    private static final StoneButtonBlock orange_glazed_terracotta_btn = registerStoneButton("orange_glazed_terracotta_btn");
    private static final StoneButtonBlock magenta_glazed_terracotta_btn = registerStoneButton("magenta_glazed_terracotta_btn");
    private static final StoneButtonBlock light_blue_glazed_terracotta_btn = registerStoneButton("light_blue_glazed_terracotta_btn");
    private static final StoneButtonBlock yellow_glazed_terracotta_btn = registerStoneButton("yellow_glazed_terracotta_btn");
    private static final StoneButtonBlock lime_glazed_terracotta_btn = registerStoneButton("lime_glazed_terracotta_btn");
    private static final StoneButtonBlock pink_glazed_terracotta_btn = registerStoneButton("pink_glazed_terracotta_btn");
    private static final StoneButtonBlock gray_glazed_terracotta_btn = registerStoneButton("gray_glazed_terracotta_btn");
    private static final StoneButtonBlock light_gray_glazed_terracotta_btn = registerStoneButton("light_gray_glazed_terracotta_btn");
    private static final StoneButtonBlock cyan_glazed_terracotta_btn = registerStoneButton("cyan_glazed_terracotta_btn");
    private static final StoneButtonBlock purple_glazed_terracotta_btn = registerStoneButton("purple_glazed_terracotta_btn");
    private static final StoneButtonBlock blue_glazed_terracotta_btn = registerStoneButton("blue_glazed_terracotta_btn");
    private static final StoneButtonBlock brown_glazed_terracotta_btn = registerStoneButton("brown_glazed_terracotta_btn");
    private static final StoneButtonBlock green_glazed_terracotta_btn = registerStoneButton("green_glazed_terracotta_btn");
    private static final StoneButtonBlock red_glazed_terracotta_btn = registerStoneButton("red_glazed_terracotta_btn");
    private static final StoneButtonBlock black_glazed_terracotta_btn = registerStoneButton("black_glazed_terracotta_btn");
    private static final StoneButtonBlock white_concrete_btn = registerStoneButton("white_concrete_btn");
    private static final StoneButtonBlock orange_concrete_btn = registerStoneButton("orange_concrete_btn");
    private static final StoneButtonBlock magenta_concrete_btn = registerStoneButton("magenta_concrete_btn");
    private static final StoneButtonBlock light_blue_concrete_btn = registerStoneButton("light_blue_concrete_btn");
    private static final StoneButtonBlock yellow_concrete_btn = registerStoneButton("yellow_concrete_btn");
    private static final StoneButtonBlock lime_concrete_btn = registerStoneButton("lime_concrete_btn");
    private static final StoneButtonBlock pink_concrete_btn = registerStoneButton("pink_concrete_btn");
    private static final StoneButtonBlock gray_concrete_btn = registerStoneButton("gray_concrete_btn");
    private static final StoneButtonBlock light_gray_concrete_btn = registerStoneButton("light_gray_concrete_btn");
    private static final StoneButtonBlock cyan_concrete_btn = registerStoneButton("cyan_concrete_btn");
    private static final StoneButtonBlock purple_concrete_btn = registerStoneButton("purple_concrete_btn");
    private static final StoneButtonBlock blue_concrete_btn = registerStoneButton("blue_concrete_btn");
    private static final StoneButtonBlock brown_concrete_btn = registerStoneButton("brown_concrete_btn");
    private static final StoneButtonBlock green_concrete_btn = registerStoneButton("green_concrete_btn");
    private static final StoneButtonBlock red_concrete_btn = registerStoneButton("red_concrete_btn");
    private static final StoneButtonBlock black_concrete_btn = registerStoneButton("black_concrete_btn");
    private static final StoneButtonBlock cactus_btn = registerStoneButton("cactus_btn");
    private static final StoneButtonBlock snow_btn = registerStoneButton("snow_btn");

    // WOOD BUTTONS
    private static final WoodenButtonBlock white_wool_btn = registerWoodButton("white_wool_btn");
    private static final WoodenButtonBlock orange_wool_btn = registerWoodButton("orange_wool_btn");
    private static final WoodenButtonBlock magenta_wool_btn = registerWoodButton("magenta_wool_btn");
    private static final WoodenButtonBlock light_blue_wool_btn = registerWoodButton("light_blue_wool_btn");
    private static final WoodenButtonBlock yellow_wool_btn = registerWoodButton("yellow_wool_btn");
    private static final WoodenButtonBlock lime_wool_btn = registerWoodButton("lime_wool_btn");
    private static final WoodenButtonBlock pink_wool_btn = registerWoodButton("pink_wool_btn");
    private static final WoodenButtonBlock gray_wool_btn = registerWoodButton("gray_wool_btn");
    private static final WoodenButtonBlock light_gray_wool_btn = registerWoodButton("light_gray_wool_btn");
    private static final WoodenButtonBlock cyan_wool_btn = registerWoodButton("cyan_wool_btn");
    private static final WoodenButtonBlock purple_wool_btn = registerWoodButton("purple_wool_btn");
    private static final WoodenButtonBlock blue_wool_btn = registerWoodButton("blue_wool_btn");
    private static final WoodenButtonBlock brown_wool_btn = registerWoodButton("brown_wool_btn");
    private static final WoodenButtonBlock green_wool_btn = registerWoodButton("green_wool_btn");
    private static final WoodenButtonBlock red_wool_btn = registerWoodButton("red_wool_btn");
    private static final WoodenButtonBlock black_wool_btn = registerWoodButton("black_wool_btn");
    private static final WoodenButtonBlock acacia_wood_btn = registerWoodButton("acacia_wood_btn");
    private static final WoodenButtonBlock dark_oak_wood_btn = registerWoodButton("dark_oak_wood_btn");
    private static final WoodenButtonBlock oak_wood_btn = registerWoodButton("oak_wood_btn");
    private static final WoodenButtonBlock spruce_wood_btn = registerWoodButton("spruce_wood_btn");
    private static final WoodenButtonBlock birch_wood_btn = registerWoodButton("birch_wood_btn");
    private static final WoodenButtonBlock jungle_wood_btn = registerWoodButton("jungle_wood_btn");
    private static final WoodenButtonBlock oak_leaves_btn = registerWoodButton("oak_leaves_btn");
    private static final WoodenButtonBlock spruce_leaves_btn = registerWoodButton("spruce_leaves_btn");
    private static final WoodenButtonBlock birch_leaves_btn = registerWoodButton("birch_leaves_btn");
    private static final WoodenButtonBlock jungle_leaves_btn = registerWoodButton("jungle_leaves_btn");
    private static final WoodenButtonBlock acacia_leaves_btn = registerWoodButton("acacia_leaves_btn");
    private static final WoodenButtonBlock dark_oak_leaves_btn = registerWoodButton("dark_oak_leaves_btn");
    private static final WoodenButtonBlock brown_mushroom_block_btn = registerWoodButton("brown_mushroom_block_btn");
    private static final WoodenButtonBlock red_mushroom_block_btn = registerWoodButton("red_mushroom_block_btn");
    private static final WoodenButtonBlock bookshelf_btn = registerWoodButton("bookshelf_btn");
    private static final WoodenButtonBlock crafting_table_btn = registerWoodButton("crafting_table_btn");

    /**
     * Registers a new stone button
     * @param buttonPath the button path
     * @return an instance of the button
     */
    private static StoneButtonBlock registerStoneButton(String buttonPath) {
        return ButtonRegister.registerNewStoneButton(buttonPath, FabricBlockSettings.of(Material.DECORATION));
    }

    /**
     * Registers a new dirt button
     * @param buttonPath the button path
     * @return an instance of the button
     */
    private static StoneButtonBlock registerDirtButton(String buttonPath) {
        return ButtonRegister.registerNewStoneButton(buttonPath, FabricBlockSettings.of(Material.DECORATION).sounds(BlockSoundGroup.ROOTED_DIRT));
    }

    /**
     * Registers a new glass button
     * @param buttonPath the button path
     * @return an instance of the button
     */
    private static StoneButtonBlock registerGlassButton(String buttonPath) {
        return ButtonRegister.registerNewStoneButton(buttonPath, FabricBlockSettings.of(Material.DECORATION).sounds(BlockSoundGroup.GLASS));
    }

    /**
     * Registers a new wet button
     * @param buttonPath the button path
     * @return an instance of the button
     */
    private static StoneButtonBlock registerWetButton(String buttonPath) {
        return ButtonRegister.registerNewStoneButton(buttonPath, FabricBlockSettings.of(Material.DECORATION).sounds(BlockSoundGroup.SLIME));
    }

    /**
     * Registers a new sand button
     * @param buttonPath the button path
     * @return an instance of the button
     */
    private static StoneButtonBlock registerSandButton(String buttonPath) {
        return ButtonRegister.registerNewStoneButton(buttonPath, FabricBlockSettings.of(Material.DECORATION).sounds(BlockSoundGroup.SAND));
    }

    /**
     * Registers a new light button
     * @param buttonPath the button path
     * @return an instance of the button
     */
    private static StoneButtonBlock registerLightButton(String buttonPath) {
        return ButtonRegister.registerNewStoneButton(buttonPath, FabricBlockSettings.of(Material.DECORATION).sounds(BlockSoundGroup.GLASS).luminance(15));
    }

    /**
     * Registers a new wood button
     * @param buttonPath the button path
     * @return an instance of the button
     */
    private static WoodenButtonBlock registerWoodButton(String buttonPath) {
        return ButtonRegister.registerNewWoodButton(buttonPath, FabricBlockSettings.of(Material.DECORATION));
    }

    /**
     * Logs to the console that the mod is registering the buttons
     */
    public static void logInit() {
        MoreBeautifulButtons.LOGGER.info("Registering Blocks for More-Beautiful-Buttons mod...");
    }
}
