package fr.minemobs.firstmodfabric.registry;

import fr.minemobs.firstmodfabric.FirstModFabric;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.HashMap;
import java.util.Map;

public class ModBlocks {

    public static final Map<Block, String> BLOCKS = new HashMap<>();

    public static final Block RUBY_BLOCK = createBlock(FabricBlockSettings
                    .of(Material.METAL)
                    .breakByTool(FabricToolTags.PICKAXES, 2)
            .requiresTool()
            .strength(5.0f, 30.0f)
            .sounds(BlockSoundGroup.METAL),
            "ruby_block");

    private static Block createBlock(Block.Settings properties, String name){
        Block block = new Block(properties);
        BLOCKS.put(block, name);
        return block;
    }

    public static void registerBlocks(){
        BLOCKS.forEach((item, s) -> Registry.register(Registry.BLOCK, new Identifier(FirstModFabric.MOD_ID, s), item));
    }
}
