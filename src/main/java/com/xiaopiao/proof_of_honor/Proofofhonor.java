package com.xiaopiao.proof_of_honor;

import net.minecraft.world.item.*;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.registries.*;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

import java.util.List;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(Proofofhonor.MODID)
public class Proofofhonor {
    public static final String MODID = "proof_of_honor";

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> EXAMPLE_TAB = CREATIVE_MODE_TABS.register("example_tab", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.proof_of_honor")) //The language key for the title of your CreativeModeTab
            .withTabsBefore(CreativeModeTabs.COMBAT)
            .icon(() -> ModBlocks.CHAMPIONPLATFORM.get().asItem().getDefaultInstance())
            .displayItems((parameters, output) -> {
                ModBlocks.ITEMS.getEntries().forEach(entry -> output.accept(entry.get()));


                ModBlocks.BLOCKS.getEntries().forEach(blockEntry -> {
                    Item item = blockEntry.get().asItem();
                    if (item != Items.AIR) {
                            output.accept(item);
                    }
                });
            }).build());

   public Proofofhonor(IEventBus modEventBus, ModContainer modContainer) {

       ModBlocks.registerBlocks(
               List.of(
                       2,
                       2,
                       1,
                       1, // 源码为-1
                       2,
                       1,
                       1,
                       1,
                       1,
                       1,
                       1,
                       1,
                       1
               ),
               List.of(
                       ModShapes::ProofofhonorBlock,
                       ModShapes::ThirdplaceplatformBlock,
                       ModShapes::RunnerupplatformBlock,
                       ModShapes::RunnerupTrophyBlock,
                       ModShapes::ThirdplacetrophyBlock,
                       ModShapes::ChampionMedalBlock,
                       ModShapes::RunnerupmedalBlock,
                       ModShapes::ThirdplacemedalBlock,
                       ModShapes::LargescalehangingblessingsBlock,
                       ModShapes::MediumsizedhangingblessingBlock,
                       ModShapes::SmallscalehangingblessingBlock,
                       ModShapes::SilkbannerBlock,
                       ModShapes::BracketAwardCertificateBlock
               ),
               List.of(
                       "proofofhonor",
                       "thirdplaceplatform",
                       "runnerupplatform",
                       "runnerup_trophy",
                       "thirdplacetrophy",
                       "champion_medal",
                       "runnerupmedal",
                       "thirdplacemedal",
                       "largescalehangingblessings",
                       "mediumsizedhangingblessing",
                       "smallscalehangingblessing",
                       "silkbanner",
                       "bracket_award_certificate"
               )
       );

       ModBlocks.BLOCKS.register(modEventBus);
       ModBlocks.ITEMS.register(modEventBus);

       CREATIVE_MODE_TABS.register(modEventBus);



    }




}
