package net.Rats.LandOfShinobi.item.armor;

import net.Rats.LandOfShinobi.item.armor.client.model.MistHeadbandModel;
import net.Rats.LandOfShinobi.item.armor.client.model.MistVestModel;
import net.Rats.LandOfShinobi.item.armor.client.provider.ArmorModelProvider;
import net.Rats.LandOfShinobi.item.armor.client.provider.SimpleModelProvider;
import net.Rats.LandOfShinobi.landofshinobiMod;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import org.jetbrains.annotations.Nullable;

public class MistVestItem extends AbstractArmorItem  {
    private static final String TEXTURE_LOCATION = makeCustomTextureLocation(landofshinobiMod.MODID, "mist_vest");

    public MistVestItem() {
        super(ArmorMaterials.LEATHER, Type.CHESTPLATE, new Properties().rarity(Rarity.EPIC));
    }

    @Override
    protected boolean withCustomModel() {
        return true;
    }

    @Override
    protected ArmorModelProvider createModelProvider() {
        return new SimpleModelProvider(MistVestModel::createBodyLayer, MistVestModel::new);
    }

    @Override
    public @Nullable String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
        return TEXTURE_LOCATION;
    }
}
