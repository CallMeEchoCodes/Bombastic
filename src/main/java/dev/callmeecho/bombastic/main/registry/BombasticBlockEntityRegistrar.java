package dev.callmeecho.bombastic.main.registry;

import dev.callmeecho.bombastic.main.block.entity.ConfettiCannonBlockEntity;
import dev.callmeecho.bombastic.main.block.entity.FirecrackerBlockEntity;
import dev.callmeecho.cabinetapi.registry.BlockEntityTypeRegistrar;
import net.minecraft.block.entity.BlockEntityType;

public class BombasticBlockEntityRegistrar implements BlockEntityTypeRegistrar {
    public static final BlockEntityType<ConfettiCannonBlockEntity> CONFETTI_CANNON = BlockEntityType.Builder.create(
            ConfettiCannonBlockEntity::new,
            BombasticBlockRegistrar.CONFETTI_CANNON
    ).build();

    public static final BlockEntityType<FirecrackerBlockEntity> FIRECRACKER = BlockEntityType.Builder.create(
            FirecrackerBlockEntity::new,
            BombasticBlockRegistrar.FIRECRACKER
    ).build();
}
