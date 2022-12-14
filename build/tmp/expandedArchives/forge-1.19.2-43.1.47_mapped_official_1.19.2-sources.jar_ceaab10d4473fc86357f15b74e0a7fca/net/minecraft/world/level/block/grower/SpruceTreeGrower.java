package net.minecraft.world.level.block.grower;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.TreeFeatures;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;

public class SpruceTreeGrower extends AbstractMegaTreeGrower {
   protected Holder<? extends ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource p_222943_, boolean p_222944_) {
      return TreeFeatures.SPRUCE;
   }

   protected Holder<? extends ConfiguredFeature<?, ?>> getConfiguredMegaFeature(RandomSource p_222941_) {
      return p_222941_.nextBoolean() ? TreeFeatures.MEGA_SPRUCE : TreeFeatures.MEGA_PINE;
   }
}