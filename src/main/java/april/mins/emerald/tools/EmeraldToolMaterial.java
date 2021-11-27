package april.mins.emerald.tools;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class EmeraldToolMaterial implements ToolMaterial {

    public static final EmeraldToolMaterial INSTANCE = new EmeraldToolMaterial();

    public int getDurability() {
        return 2300;
        // return 1;
    }

    public float getMiningSpeedMultiplier() {
        return 6.0F;
    }

    public float getAttackDamage() {
        return 0.0F;
    }

    public int getMiningLevel() {
        return 2;
    }

    public int getEnchantability() {
        return 15;
    }

    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.EMERALD);
    }
}
