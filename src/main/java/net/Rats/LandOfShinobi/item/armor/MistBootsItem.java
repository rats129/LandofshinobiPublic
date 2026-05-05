package net.Rats.LandOfShinobi.item.armor;

import net.Rats.LandOfShinobi.item.armor.client.model.LeafBootsModel;
import net.Rats.LandOfShinobi.item.armor.client.model.MistBootsModel;
import net.Rats.LandOfShinobi.item.armor.client.provider.ArmorModelProvider;
import net.Rats.LandOfShinobi.item.armor.client.provider.SimpleModelProvider;
import net.Rats.LandOfShinobi.landofshinobiMod;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import org.jetbrains.annotations.Nullable;

public class MistBootsItem extends AbstractArmorItem {
    private static final String TEXTURE_LOCATION = makeCustomTextureLocation(landofshinobiMod.MODID, "mist_boots");

    public MistBootsItem() {
        super(ArmorMaterials.LEATHER, Type.BOOTS, new Properties().rarity(Rarity.EPIC));
    }

    @Override
    protected boolean withCustomModel() {
        return true;
    }

    @Override
    protected ArmorModelProvider createModelProvider() {
        return new SimpleModelProvider(MistBootsModel::createBodyLayer, MistBootsModel::new);
    }

    @Override
    public @Nullable String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
        return TEXTURE_LOCATION;
    }
}
