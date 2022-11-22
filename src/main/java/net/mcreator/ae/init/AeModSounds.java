
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ae.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.ae.AeMod;

public class AeModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, AeMod.MODID);
	public static final RegistryObject<SoundEvent> NICECOCK = REGISTRY.register("nicecock",
			() -> new SoundEvent(new ResourceLocation("ae", "nicecock")));
	public static final RegistryObject<SoundEvent> CZOLK = REGISTRY.register("czolk", () -> new SoundEvent(new ResourceLocation("ae", "czolk")));
	public static final RegistryObject<SoundEvent> CZOLKMIDADI = REGISTRY.register("czolkmidadi",
			() -> new SoundEvent(new ResourceLocation("ae", "czolkmidadi")));
}
