package net.Rats.LandOfShinobi.item;

import net.Rats.LandOfShinobi.block.ModBlocks;
import net.Rats.LandOfShinobi.landofshinobiMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, landofshinobiMod.MODID);

    public static final RegistryObject<CreativeModeTab> LAND_OF_SHINOBI_TAB = CREATIVE_MODE_TABS.register("land_of_shinobi_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.RAW_SAPPHIRE.get()))
                    .title(Component.translatable("creativetab.land_of_shinobi_tab"))  //the key for lang
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.SAPPHIRE.get());
                        pOutput.accept(ModItems.RAW_SAPPHIRE.get()); //adds item to creative mode tab


                        pOutput.accept(ModBlocks.SAPPHIRE_BLOCK.get()); //adds block to creative mode tab
                        pOutput.accept(ModBlocks.RAW_SAPPHIRE_BLOCK.get()); //adds block to creative mode tab


                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);

    }
}
