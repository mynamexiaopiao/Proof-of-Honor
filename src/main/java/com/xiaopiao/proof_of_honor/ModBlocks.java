package com.xiaopiao.proof_of_honor;

import net.minecraft.core.Direction;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Proofofhonor.MODID);
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Proofofhonor.MODID);


    public static final DeferredBlock<Block> CHAMPIONPLATFORM = registerBlock(
            "championplatform" , (resourceLocation) -> new FacingBlock(BlockBehaviour.Properties.of().noOcclusion()
                    .setId(ResourceKey.create(Registries.BLOCK,resourceLocation))
            , ModShapes::ChampionplatformBlock));


    public static void registerBlocks(List<Integer> integers,List<Function<Direction, VoxelShape>> function , List<String> strings ){
        for (int i = 0; i < strings.size(); i++) {
            int finalI = i;
            int finalI1 = i;
            registerBlock(strings.get(i), (resourceLocation) -> new FacingBlock(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK,resourceLocation))
                    .noOcclusion()
                    .strength(integers.get(finalI1), 10.0F),function.get(finalI)));
        }
    }


    public static DeferredBlock<Block> registerBlock(String name, Function<ResourceLocation, ? extends Block> blockSupplier){
        DeferredBlock<Block> deff = BLOCKS.register(name, blockSupplier);
//        ITEMS.registerItem(name,(key)-> new BlockItem(deff.get(),key.useBlockDescriptionPrefix()));
        registerModBlockItem(deff);
//        ITEMS.registerSimpleBlockItem(name , deff);
        return deff;
    }

    public static <T extends Block> DeferredItem<BlockItem> registerModBlockItem(DeferredHolder<Block, T> block) {
        return ITEMS.register(
                Objects.requireNonNull(block.getKey()).location().getPath(),
                (key) -> new BlockItem(
                        block.value(), new Item.Properties()
                        .setId(ResourceKey.create(Registries.ITEM, key))
                        .useBlockDescriptionPrefix()
                )
        );
    }
}
