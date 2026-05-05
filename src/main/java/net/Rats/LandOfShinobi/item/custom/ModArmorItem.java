package net.Rats.LandOfShinobi.item.custom;

import com.google.common.collect.ImmutableMap;
import net.Rats.LandOfShinobi.item.ModArmorMaterials;
import net.Rats.LandOfShinobi.item.ModItems;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

import java.util.Map;


public class ModArmorItem extends ArmorItem {

    private static final Map<ArmorMaterial, MobEffectInstance> MATERIAL_TO_EFFECT_MAP =
            (new ImmutableMap.Builder<ArmorMaterial, MobEffectInstance>())
                    .put(ModArmorMaterials.SAPPHIRE,
                            new MobEffectInstance(MobEffects.DAMAGE_BOOST, 200, 1, false, false, true))
                    .build();

    public ModArmorItem(ArmorMaterial material, Type type, Properties properties) {
        super(material, type, properties);
    }

    @Override
    public void onArmorTick(ItemStack stack, Level world, Player player) {
        if (world.isClientSide()) return;

        // 🌿 Leaf set
        if (isWearingLeafSet(player)) {
            applyEffect(player, new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200, 1, false ,false, true));
            return;
        }

        // 💎 Material-based (Sapphire etc.)
        if (hasFullSuitOfArmorOn(player)) {
            evaluateMaterialEffects(player);
        }
    }



    // 🌿 Leaf armor check
    private boolean isWearingLeafSet(Player player) {
        return player.getInventory().getArmor(0).getItem() == ModItems.LEAF_BOOTS.get()
                && player.getInventory().getArmor(1).getItem() == ModItems.LEAF_PANTS.get()
                && player.getInventory().getArmor(2).getItem() == ModItems.LEAF_VEST.get()
                && player.getInventory().getArmor(3).getItem() == ModItems.LEAF_HEADBAND.get();
    }

    // 💎 Material effects
    private void evaluateMaterialEffects(Player player) {
        for (Map.Entry<ArmorMaterial, MobEffectInstance> entry : MATERIAL_TO_EFFECT_MAP.entrySet()) {
            if (hasCorrectArmorOn(entry.getKey(), player)) {
                applyEffect(player, entry.getValue());
            }
        }
    }

    // ✅ Prevents effect spam even without "run once"
    private void applyEffect(Player player, MobEffectInstance effect) {
        if (!player.hasEffect(effect.getEffect())) {
            player.addEffect(new MobEffectInstance(effect));
        }
    }

    private boolean hasFullSuitOfArmorOn(Player player) {
        return !player.getInventory().getArmor(0).isEmpty() &&
                !player.getInventory().getArmor(1).isEmpty() &&
                !player.getInventory().getArmor(2).isEmpty() &&
                !player.getInventory().getArmor(3).isEmpty();
    }

    private boolean hasCorrectArmorOn(ArmorMaterial material, Player player) {
        for (ItemStack stack : player.getInventory().armor) {
            if (!(stack.getItem() instanceof ArmorItem armorItem)) return false;
            if (armorItem.getMaterial() != material) return false;
        }
        return true;
    }
}
