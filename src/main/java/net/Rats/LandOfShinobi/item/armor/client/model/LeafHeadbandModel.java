package net.Rats.LandOfShinobi.item.armor.client.model;// Made with Blockbench 5.1.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

import javax.swing.text.html.parser.Entity;

public class LeafHeadbandModel extends ArmorModel {

	public LeafHeadbandModel(ModelPart root) {
		super(root);
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-6.0F, -18.0F, 0.5F, 0.5F, 2.0F, 9.0F, new CubeDeformation(0.0F))
				.texOffs(0, 11).addBox(-14.5F, -18.0F, 0.5F, 0.5F, 2.0F, 9.0F, new CubeDeformation(0.0F))
				.texOffs(20, 0).addBox(-14.0F, -18.0F, 0.5F, 8.0F, 2.0F, 0.5F, new CubeDeformation(0.0F))
				.texOffs(20, 3).addBox(-14.0F, -18.0F, 9.0F, 8.0F, 2.0F, 0.5F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}
}
