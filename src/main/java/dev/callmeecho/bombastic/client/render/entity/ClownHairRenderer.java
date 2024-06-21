package dev.callmeecho.bombastic.client.render.entity;

import dev.callmeecho.bombastic.client.render.entity.model.ClownBootsEntityModel;
import dev.callmeecho.bombastic.client.render.entity.model.ClownHairEntityModel;
import net.fabricmc.fabric.api.client.rendering.v1.ArmorRenderer;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.joml.Vector3f;

import static dev.callmeecho.bombastic.main.Bombastic.MODID;

public class ClownHairRenderer implements ArmorRenderer {
    private static final Identifier TEXTURE = Identifier.of(MODID, "textures/entity/armor/clown_hair.png");

    private BipedEntityModel<LivingEntity> armorModel;


    @Override
    public void render(MatrixStack matrices, VertexConsumerProvider vertexConsumers, ItemStack stack, LivingEntity entity, EquipmentSlot slot, int light, BipedEntityModel<LivingEntity> model) {
        if (armorModel == null)
            armorModel = new BipedEntityModel<>(MinecraftClient.getInstance().getEntityModelLoader().getModelPart(ClownHairEntityModel.LAYER_LOCATION));

        model.copyBipedStateTo(armorModel);

        armorModel.setVisible(false);
        armorModel.head.visible = true;
        ArmorRenderer.renderPart(matrices, vertexConsumers, light, stack, armorModel, TEXTURE);
    }
}
