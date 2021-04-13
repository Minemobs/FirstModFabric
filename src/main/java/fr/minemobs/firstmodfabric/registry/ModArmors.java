package fr.minemobs.firstmodfabric.registry;

import fr.minemobs.firstmodfabric.FirstModFabric;
import fr.minemobs.firstmodfabric.objects.armors.ModArmorMaterials;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.HashMap;
import java.util.Map;

public class ModArmors {

    public static final Map<ArmorItem, String> ARMORS = new HashMap<>();
    
    public static final ArmorItem UGLY_HELMET = createArmorItem(ModArmorMaterials.UGLY, EquipmentSlot.HEAD,
            new Item.Settings().group(FirstModFabric.FABRIC_CREATIVE_TAB).fireproof(), "ugly_helmet");
    public static final ArmorItem UGLY_CHESTPLATE = createArmorItem(ModArmorMaterials.UGLY, EquipmentSlot.CHEST,
            new Item.Settings().group(FirstModFabric.FABRIC_CREATIVE_TAB).fireproof(), "ugly_chestplate");
    public static final ArmorItem UGLY_LEGGINGS = createArmorItem(ModArmorMaterials.UGLY, EquipmentSlot.LEGS,
            new Item.Settings().group(FirstModFabric.FABRIC_CREATIVE_TAB).fireproof(), "ugly_leggings");
    public static final ArmorItem UGLY_BOOTS = createArmorItem(ModArmorMaterials.UGLY, EquipmentSlot.FEET,
            new Item.Settings().group(FirstModFabric.FABRIC_CREATIVE_TAB).fireproof(), "ugly_boots");

    private static ArmorItem createArmorItem(ModArmorMaterials materials, EquipmentSlot equipmentSlot, Item.Settings properties, String name){
        ArmorItem armorItem = new ArmorItem(materials, equipmentSlot, properties);
        ARMORS.put(armorItem, name);
        return armorItem;
    }

    public static void registerArmors(){
        ARMORS.forEach((item, s) -> Registry.register(Registry.ITEM, new Identifier(FirstModFabric.MOD_ID, s), item));
    }

}
