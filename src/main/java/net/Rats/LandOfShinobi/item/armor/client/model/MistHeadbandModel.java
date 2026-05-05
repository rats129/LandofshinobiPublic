package net.Rats.LandOfShinobi.item.armor.client.model;// Made with Blockbench 5.1.3// Exported for Minecraft version 1.17 or later with Mojang mappings// Paste this class into your mod and generate all required importsimport com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class MistHeadbandModel extends ArmorModel {

	public MistHeadbandModel(ModelPart root) {
		super(root);
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		partdefinition.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.ZERO);
		partdefinition.addOrReplaceChild("body",CubeListBuilder.create(), PartPose.ZERO);
		partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create(), PartPose.ZERO);
		partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create(), PartPose.ZERO);
		partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create(), PartPose.ZERO);
		partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create(), PartPose.ZERO);
		partdefinition.addOrReplaceChild("right_boot", CubeListBuilder.create(), PartPose.ZERO);
		partdefinition.addOrReplaceChild("left_boot", CubeListBuilder.create(), PartPose.ZERO);

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create()
				.texOffs(1, 1).addBox(-4.0F, -6.0F, -3.5F, 0.5F, 2.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(1, 12).addBox(3.5F, -6.0F, -3.5F, 0.5F, 2.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(20, 0).addBox(-4.0F, -6.0F, -4.0F, 8.0F, 2.0F, 0.5F, new CubeDeformation(0.0F))
				.texOffs(20, 3).addBox(-4.0F, -6.0F, 4.5F, 8.0F, 2.0F, 0.5F, new CubeDeformation(0.0F)),
				PartPose.ZERO);


		return LayerDefinition.create(meshdefinition, 64, 64);
	}
}

