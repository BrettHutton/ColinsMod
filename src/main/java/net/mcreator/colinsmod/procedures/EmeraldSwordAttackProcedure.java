package net.mcreator.colinsmod.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.colinsmod.ColinsModElements;

@ColinsModElements.ModElement.Tag
public class EmeraldSwordAttackProcedure extends ColinsModElements.ModElement {
	public EmeraldSwordAttackProcedure(ColinsModElements instance) {
		super(instance, 14);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure EmeraldSwordAttack!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.LEVITATION, (int) 120, (int) 5));
	}
}
