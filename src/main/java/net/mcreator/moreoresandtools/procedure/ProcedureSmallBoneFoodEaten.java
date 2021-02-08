package net.mcreator.moreoresandtools.procedure;

import net.minecraft.potion.PotionEffect;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.moreoresandtools.ElementsMoreOresAndToolsMod;

import java.util.Map;

@ElementsMoreOresAndToolsMod.ModElement.Tag
public class ProcedureSmallBoneFoodEaten extends ElementsMoreOresAndToolsMod.ModElement {
	public ProcedureSmallBoneFoodEaten(ElementsMoreOresAndToolsMod instance) {
		super(instance, 163);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure SmallBoneFoodEaten!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.NAUSEA, (int) 120, (int) 1));
	}
}
