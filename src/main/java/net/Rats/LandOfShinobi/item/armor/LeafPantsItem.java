package net.Rats.LandOfShinobi.item.armor;

import net.Rats.LandOfShinobi.item.armor.client.model.LeafPantsModel;
import net.Rats.LandOfShinobi.item.armor.client.model.LeafVestModel;
import net.Rats.LandOfShinobi.item.armor.client.provider.ArmorModelProvider;
import net.Rats.LandOfShinobi.item.armor.client.provider.SimpleModelProvider;
import net.Rats.LandOfShinobi.landofshinobiMod;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import org.jetbrains.annotations.Nullable;

public class LeafPantsItem extends AbstractArmorItem {
    private static final String TEXTURE_LOCATION = makeCustomTextureLocation(landofshinobiMod.MODID, "leaf_pants");

    public LeafPantsItem() {
        super(ArmorMaterials.LEATHER, Type.LEGGINGS, new Properties().rarity(Rarity.EPIC));
    }

    @Override
    protected boolean withCustomModel() {
        return true;
    }

    @Override
    protected ArmorModelProvider createModelProvider() {
        return new SimpleModelProvider(LeafPantsModel::createBodyLayer, LeafPantsModel::new);
    }

    @Override
    public @Nullable String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
        return TEXTURE_LOCATION;
    }
}
