package com.test.item;

import com.test.Test;
import com.test.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup AVARITIA_GROUP = Registry.register(Registries.ITEM_GROUP,
                    Identifier.of(Test.MOD_ID, "avaritia_group"),
                    FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.INFINITY_INGOT))
                    .displayName(Text.translatable("itemgroup.test.avaritia_group"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.NEUTRONIUM_INGOT);
                        entries.add(ModItems.NEUTRON_NUGGET);
                        entries.add(ModItems.NEUTRON_PILE);
                        entries.add(ModBlocks.BLOCK_CRYSTAL_MATRIX);
                        entries.add(ModItems.CRYSTAL_MATRIX_INGOT);
                        entries.add(ModItems.DIAMOND_LATTICE);
                        entries.add(ModItems.INFINITY_INGOT);

                    })
                    .build());


    public static void registerItemGroups() {
        Test.LOGGER.info("Registering Item Groups for " + Test.MOD_ID);

    }

}
