package fr.minemobs.firstmodfabric.registry;

import fr.minemobs.firstmodfabric.FirstModFabric;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.HashMap;
import java.util.Map;

public class ModItems {

    public static final Map<Item, String> ITEMS = new HashMap<>();

    //Items
    public static final Item TEST_ITEM = createItem(new Item.Settings().group(FirstModFabric.FABRIC_CREATIVE_TAB), "test_item");
    public static final Item RUBY = createItem(new Item.Settings().group(FirstModFabric.FABRIC_CREATIVE_TAB), "ruby");

    //Block Items
    public static final BlockItem RUBY_BLOCK = createBlockItem(ModBlocks.RUBY_BLOCK, new Item.Settings().group(FirstModFabric.FABRIC_CREATIVE_TAB), "ruby_block");

    private static Item createItem(Item.Settings properties, String name){
        Item item = new Item(properties);
        ITEMS.put(item, name);
        return item;
    }

    private static BlockItem createBlockItem(Block block, Item.Settings properties, String name){
        BlockItem item = new BlockItem(block, properties);
        ITEMS.put(item, name);
        return item;
    }

    public static void registerItems(){
        ITEMS.forEach((item, s) -> Registry.register(Registry.ITEM, new Identifier(FirstModFabric.MOD_ID, s), item));
    }

}
