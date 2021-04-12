package fr.minemobs.firstmodfabric.registry;

import fr.minemobs.firstmodfabric.FirstModFabric;
import fr.minemobs.firstmodfabric.enchantments.ExplosionEnchantment;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.HashMap;
import java.util.Map;

public class ModEnchantments {

    public static final Map<Enchantment, String> ENCHANTMENTS = new HashMap<>();

    public static final Enchantment EXPLOSION_ENCHANT = createEnchantment(new ExplosionEnchantment(Enchantment.Rarity.VERY_RARE, EnchantmentTarget.WEAPON, new EquipmentSlot[]{EquipmentSlot.MAINHAND}), "explosion_enchant");

    private static Enchantment createEnchantment(Enchantment enchantment, String name) {
        ENCHANTMENTS.put(enchantment, name);
        return enchantment;
    }

    public static void registerEnchants(){
        ENCHANTMENTS.forEach((enchantment, s) -> Registry.register(Registry.ENCHANTMENT, new Identifier(FirstModFabric.MOD_ID, s), enchantment));
    }

}
