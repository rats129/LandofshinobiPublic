package net.Rats.LandOfShinobi.item.armor.client.model;// Made with Blockbench 5.1.3// Exported for Minecraft version 1.17 or later with Mojang mappings// Paste this class into your mod and generate all required importsimport com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class LeafPantsModel extends ArmorModel {

	public LeafPantsModel(ModelPart root) {
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



		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create()
				.texOffs(41, 9).addBox(-2F, 0.0F, 1.5F, 4.0F, 9.0F, 1.0F, new CubeDeformation(0.0F))  //right back
				.texOffs(1, 48).addBox(-2.20F, 0.0F, -2.0F, 1.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)) //right outer
				.texOffs(15, 50).addBox(-2F, 0F, -2.5F, 4.0F, 9.0F, 1.0F, new CubeDeformation(0.0F))  //right front
				.texOffs(42, 46).addBox(1F, 0.0F, -2.0F, 1.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)),  //right inner
				PartPose.ZERO);

		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create()
				.texOffs(0, 32).addBox(-2F, 0.0F, 1.5F, 4.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)) //left back
				.texOffs(17, 1).addBox(1.20F, 0.0F, -2.0F, 1.0F, 9.0F, 4.0F, new CubeDeformation(0.0F))  //left outer
				.texOffs(10, 34).addBox(-2F, 0.0F, -2.5F, 4.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)) //left front
				.texOffs(17, 18).addBox(-2F, 0.0F, -2.0F, 1.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)) //left inner
				.texOffs(40, 0).addBox(2F, 1.50F, -1.5F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), //pocket
				PartPose.ZERO);







		return LayerDefinition.create(meshdefinition, 64, 64);
	}
}