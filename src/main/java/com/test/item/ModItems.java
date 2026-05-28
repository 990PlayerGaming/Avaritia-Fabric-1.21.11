package com.test.item;

import com.test.Test;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item CRYSTAL_MATRIX_INGOT = registerItem("crystal_matrix_ingot", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Test.MOD_ID, "crystal_matrix_ingot")))));
    public static final Item DIAMOND_LATTICE = registerItem("diamond_lattice", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Test.MOD_ID, "diamond_lattice")))));
    public static final Item NEUTRON_PILE = registerItem("neutron_pile", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Test.MOD_ID, "neutron_pile")))));
    public static final Item NEUTRONIUM_INGOT = registerItem("neutronium_ingot", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Test.MOD_ID, "neutronium_ingot")))));
    public static final Item NEUTRON_NUGGET = registerItem("neutron_nugget", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Test.MOD_ID, "neutron_nugget")))));
    public static final Item INFINITY_INGOT = registerItem("infinity_ingot", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Test.MOD_ID, "infinity_ingot")))));

    // helper method to register items
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Test.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Test.LOGGER.info("Registering Mod Items for " + Test.MOD_ID);

    }


}
