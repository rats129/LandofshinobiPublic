package net.Rats.LandOfShinobi.item.armor.client.model;// Made with Blockbench 5.1.3// Exported for Minecraft version 1.17 or later with Mojang mappings// Paste this class into your mod and generate all required importsimport com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class MistVestModel extends ArmorModel {

	public MistVestModel(ModelPart root) {
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



		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create()
						.texOffs(0, 6).addBox(-4.0F, -0.0F, -3F, 8.0F, 12.0F, 1.0F, new CubeDeformation(0.0F))  //front body
						.texOffs(18, 6).addBox(-4.0F, -0.0F, 1.5F, 8.0F, 12.0F, 1.0F, new CubeDeformation(0.0F))  //back body
				        .texOffs(1, 56).addBox(-4.0F, -0.25F, -2.25F, 8.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))   //top middle
			          	.texOffs(49, 34).addBox(3.0F, -0.0F, -2.0F, 1.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))   //left inner body
				        .texOffs(36, 47).addBox(-4.0F, -0.0F, -2.0F, 1.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),//right inner body
				PartPose.ZERO);

		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create()
				.texOffs(12, 35).addBox(-1.0F, -2.0F, 1.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))   //left back inner plate
				.texOffs(40, 19).addBox(1.0F, -2.0F, 1.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))  //left back outer plate
				.texOffs(20, 19).addBox(-1.0F, -2.0F, -2.75F, 4.0F, 12.0F, 1.0F, new CubeDeformation(0.0F))   //left front sleeve
				.texOffs(30, 19).addBox(-1.0F, -2.0F, 1.25F, 4.0F, 12.0F, 1.0F, new CubeDeformation(0.0F))  //left back sleeve
				.texOffs(40, 0).addBox(-1.0F, -2.0F, -3F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))  //left front inner plate
				.texOffs(40, 27).addBox(1.0F, -2.0F, -3F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))  //left front outer plate
				.texOffs(10, 19).addBox(2.25F, -2.0F, -2.5F, 1.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))   //left outer sleeve
				.texOffs(49, 17).addBox(-1.5F, -2.0F, -2.5F, 1.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))  //left inner sleeve
				.texOffs(0, 35).addBox(2.5F, -2.0F, -3F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))   //left new outer plate
				.texOffs(1, 47).addBox(-1F, -2.25F, -2.5F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)) , //top left arm
				PartPose.ZERO);

		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create()
				.texOffs(36, 14).addBox(-1.0F, -2.0F, -3F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))  //right front inner plate
				.texOffs(40, 23).addBox(-3.0F, -2.0F, -3F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))  //right front outer plate
				.texOffs(20, 32).addBox(-3.0F, 1.0F, -2.75F, 4.0F, 9.0F, 1.0F, new CubeDeformation(0.0F))  //Right front sleeve
				.texOffs(0, 19).addBox(-3.25F, -2.0F, -2.5F, 1.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))  //Right side sleeve
				.texOffs(30, 32).addBox(-3.0F, 1.0F, 1.25F, 4.0F, 9.0F, 1.0F, new CubeDeformation(0.0F))  //right back sleeve
				.texOffs(12, 40).addBox(-1.0F, -2.0F, 1.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))  //right back plate inner
				.texOffs(40, 31).addBox(-3.0F, -2.0F, 1.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))  //right back plate outer
				.texOffs(36, 6).addBox(-3.5F, -2.0F, -3F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))  //new right outer plate
				.texOffs(49, 0).addBox(0.75F, -2.0F, -2.5F, 1.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))  //right inner sleeve
				.texOffs(1, 47).addBox(-3.0F, -2.25F, -2.5F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),  //top right arm
				PartPose.ZERO);






		return LayerDefinition.create(meshdefinition, 64, 64);
	}
}