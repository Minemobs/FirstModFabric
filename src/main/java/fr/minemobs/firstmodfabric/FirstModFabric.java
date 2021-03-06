package fr.minemobs.firstmodfabric;

import fr.minemobs.firstmodfabric.registry.ModArmors;
import fr.minemobs.firstmodfabric.registry.ModBlocks;
import fr.minemobs.firstmodfabric.registry.ModEnchantments;
import fr.minemobs.firstmodfabric.registry.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

import java.util.logging.Logger;

public class FirstModFabric implements ModInitializer {

    public static final String MOD_ID = "firstmodfabric";
    public static final Logger LOGGER = Logger.getLogger("First Mod Fabric");

    @Override
    public void onInitialize() {
        ModItems.registerItems();
        ModBlocks.registerBlocks();
        ModEnchantments.registerEnchants();
        ModArmors.registerArmors();
    }

    public static final ItemGroup FABRIC_CREATIVE_TAB = FabricItemGroupBuilder.build(
            new Identifier(MOD_ID, "general"), () -> new ItemStack(ModItems.RUBY)
    ).setName("fabric_tab");

    public static Identifier id(String name) {
        return new Identifier(MOD_ID, name);
    }
}
