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
						.texOffs(0, 0).addBox(-4.0F, -0.0F, -3F, 8.0F, 12.0F, 1.0F, new CubeDeformation(0.0F))   //body front
						.texOffs(0, 13).addBox(-4.0F, 0.0F, 1.5F, 8.0F, 12.0F, 1.0F, new CubeDeformation(0.0F))     //body back
						.texOffs(10, 26).addBox(1F, 6.0F, -3.25F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)) //body pocket
						.texOffs(20, 32).addBox(-4.0F, 6.0F, -3.25F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))  //body pocket
						.texOffs(9, 42).addBox(-4.0F, -0.25F, -2.25F, 8F, 2.0F, 4.0F, new CubeDeformation(0.0F)) //body top
						.texOffs(46, 40).addBox(-4.0F, -0F, -2.F, 1F, 12.0F, 4.0F, new CubeDeformation(0.0F))//body inner
						.texOffs(46, 40).addBox(3.0F, -0F, -2.F, 1F, 12.0F, 4.0F, new CubeDeformation(0.0F)), //body inner
				PartPose.ZERO);

		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm",CubeListBuilder.create()
						.texOffs(28, 36).addBox(-1F, -2.0F, 1.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)) //arm L back plate
						.texOffs(38, 5).addBox(1.0F, -2.0F, 1.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))  //arm L back plate
						.texOffs(28, 0).addBox(-1.0F, -2.0F, -2.75F, 4.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)) //arm L  front sleeve
						.texOffs(28, 13).addBox(-1.0F, -2.0F, 1.25F, 4.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)) //arm L back sleeve
						.texOffs(20, 37).addBox(-1.0F, -2.0F, -3F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)) //arm L front plate
						.texOffs(38, 13).addBox(1.0F, -2.0F, -3F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)) //arm L front plate
						.texOffs(0, 26).addBox(2.25F, -2.0F, -2.5F, 1.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))  //arm L left sleeve
				        .texOffs(41, 21).addBox(-1.5F, -2.0F, -2.5F, 1.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)) //arm L inner sleeve
				        .texOffs(11, 42).addBox(-2F, -2.25F, -2.5F, 5F, 2F, 4.0F, new CubeDeformation(0.0F)), //arm top
				PartPose.offset(-5.0F, 2.0F, 0.0F)
		);


		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm",CubeListBuilder.create()
						.texOffs(10, 32).addBox(-3.0F, 1.0F, 1.25F, 4.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)) // arm R back sleeve
						.texOffs(38, 0).addBox(-1.0F, -2.0F, 1.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)) //arm r back plate
						.texOffs(38, 17).addBox(-3.0F, -2.0F, 1.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)) // arm R back plate
						.texOffs(18, 0).addBox(-3.25F, -2.0F, -2.5F, 1.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))  //arm R right sleeve
						.texOffs(34, 36).addBox(-1.0F, -2.0F, -3F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)) //arm R front plate
						.texOffs(38, 9).addBox(-3.0F, -2.0F, -3F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))  //arm R front plate
						.texOffs(28, 26).addBox(-3.0F, 1.0F, -2.75F, 4.0F, 9.0F, 1.0F, new CubeDeformation(0.0F))  //arm R front sleeve
				        .texOffs(41, 21).addBox(0.75F, -2.0F, -2.5F, 1.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)) //arm r inner sleeve
				        .texOffs(11, 42).addBox(-3F, -2.25F, -2.5F, 5F, 2F, 4.0F, new CubeDeformation(0.0F)), //arm top
				PartPose.offset(5.0F, 2.0F, 0.0F)
		);





		return LayerDefinition.create(meshdefinition, 64, 64);
	}
}