package net.Rats.LandOfShinobi.item.armor.client.model;// Made with Blockbench 5.1.3// Exported for Minecraft version 1.17 or later with Mojang mappings// Paste this class into your mod and generate all required importsimport com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class LeafBootsModel extends ArmorModel {

	public LeafBootsModel(ModelPart root) {
		super(root);
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.ZERO);
		partdefinition.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.ZERO);

		partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.ZERO);

		partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create(), PartPose.ZERO);
		partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create(), PartPose.ZERO);

		partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create(), PartPose.ZERO);
		partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create(), PartPose.ZERO);

// your custom ones
		partdefinition.addOrReplaceChild("left_boot", CubeListBuilder.create(), PartPose.ZERO);
		partdefinition.addOrReplaceChild("right_boot", CubeListBuilder.create(), PartPose.ZERO);




		PartDefinition left_boot = partdefinition.addOrReplaceChild("left_boot", CubeListBuilder.create()
				.texOffs(10, 13).addBox(-2F, 9.0F, -2.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))  //L front
				.texOffs(0, 13).addBox(-2F, 9.0F, 1.5F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)) //L
				.texOffs(0, 6).addBox(1.25F, 9.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))  //L
				.texOffs(10, 6).addBox(-2.25F, 9.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))  //L
				.texOffs(0, 0).addBox(-2F, 11.5F, -2.5F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), //L
		PartPose.ZERO);


		PartDefinition right_boot = partdefinition.addOrReplaceChild("right_boot", CubeListBuilder.create()
				.texOffs(0, 17).addBox(-2F, 11.5F, -2.5F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(21, 7).addBox(1.25F, 9F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(20, 14).addBox(-2.25F, 9F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(0, 24).addBox(-2F, 9F, 1.5F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(20, 22).addBox(-2F, 9F, -2.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.ZERO);

		return LayerDefinition.create(meshdefinition, 32, 32);
	}
}