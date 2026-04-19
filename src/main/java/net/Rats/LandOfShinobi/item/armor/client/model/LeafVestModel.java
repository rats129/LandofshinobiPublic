package net.Rats.LandOfShinobi.item.armor.client.model;// Made with Blockbench 5.1.3// Exported for Minecraft version 1.17 or later with Mojang mappings// Paste this class into your mod and generate all required importsimport com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class LeafVestModel extends ArmorModel {

	public LeafVestModel(ModelPart root) {
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



		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-8.0F, -24.0F, -0.5F, 8.0F, 12.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 13).addBox(10.0F, -24.0F, 3.5F, 8.0F, 12.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 36).addBox(0.0F, -24.0F, 3.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(38, 5).addBox(2.0F, -24.0F, 3.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(34, 36).addBox(-10.0F, -24.0F, -0.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(38, 9).addBox(-12.0F, -24.0F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 26).addBox(-12.0F, -21.0F, -0.25F, 4.0F, 9.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 0).addBox(0.0F, -24.0F, -0.25F, 4.0F, 12.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(10, 26).addBox(-3.0F, -18.0F, -1.0F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(20, 32).addBox(-8.0F, -18.0F, -1.0F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(18, 0).addBox(-12.25F, -24.0F, 0.0F, 1.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(28, 13).addBox(0.0F, -24.0F, 3.25F, 4.0F, 12.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(20, 37).addBox(0.0F, -24.0F, -0.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(38, 13).addBox(2.0F, -24.0F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 26).addBox(3.25F, -24.0F, 0.0F, 1.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(10, 32).addBox(-12.0F, -21.0F, 3.25F, 4.0F, 9.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(38, 0).addBox(-10.0F, -24.0F, 3.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(38, 17).addBox(-12.0F, -24.0F, 3.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}
}


