package net.Rats.LandOfShinobi.item.armor.client.model;// Made with Blockbench 5.1.3// Exported for Minecraft version 1.17 or later with Mojang mappings// Paste this class into your mod and generate all required importsimport com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class MistPantsModel extends ArmorModel {

	public MistPantsModel(ModelPart root) {
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


		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create()
				.texOffs(20, 0).addBox(-2.0F, -0.0F, 1.5F, 4.0F, 9.0F, 1.0F, new CubeDeformation(0.0F))  //left back
				.texOffs(0, 0).addBox(1.20F, -0.0F, -2.0F, 1.0F, 9.0F, 4.0F, new CubeDeformation(0.0F))  //left outer
				.texOffs(20, 13).addBox(-2.0F, -0.0F, -2.5F, 4.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)) //left front
				.texOffs(10, 0).addBox(-2.F, -0.0F, -2.0F, 1.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)),  //left inner
				PartPose.ZERO);

		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create()
				.texOffs(20, 26).addBox(-2F, -0.0F, 1.5F, 4.0F, 9.0F, 1.0F, new CubeDeformation(0.0F))  //right back
				.texOffs(0, 16).addBox(-2.20F, -0.0F, -2.0F, 1.0F, 9.0F, 4.0F, new CubeDeformation(0.0F))//right outer
				.texOffs(30, 0).addBox(-2F, -0.0F, -2.25F, 4.0F, 9.0F, 1.0F, new CubeDeformation(0.0F))//right front
				.texOffs(10, 16).addBox(1, -0.0F, -2.0F, 1.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), //right inner
				PartPose.ZERO);


		return LayerDefinition.create(meshdefinition, 64, 64);


	}}