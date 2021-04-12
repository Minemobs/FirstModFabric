package fr.minemobs.firstmodfabric;

import fr.minemobs.firstmodfabric.registry.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class FirstModFabric implements ModInitializer {

    public static final String MOD_ID = "firstmodfabric";

    @Override
    public void onInitialize() {
        ModItems.registerItems();
    }

    public static final ItemGroup FABRIC_CREATIVE_TAB = FabricItemGroupBuilder.build(
            new Identifier(MOD_ID, "general"), () -> new ItemStack(ModItems.RUBY)
    ).setName("fabric_tab");
}
