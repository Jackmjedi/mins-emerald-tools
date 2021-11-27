package april.mins.emerald.tools;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MinsEmeraldTools implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger("minsemeraldtools");

	public static ToolItem EMERALD_PICKAXE = new EmeraldPickaxe(EmeraldToolMaterial.INSTANCE, 0, 0.0F, new Item.Settings().group(ItemGroup.TOOLS));
	public static ToolItem EMERALD_SWORD = new EmeraldSword(EmeraldToolMaterial.INSTANCE, 5, -2.1F, new Item.Settings().group(ItemGroup.COMBAT));
	public static ToolItem EMERALD_SHOVEL = new EmeraldShovel(EmeraldToolMaterial.INSTANCE, 0, 0.0F, new Item.Settings().group(ItemGroup.TOOLS));
	public static ToolItem EMERALD_HOE = new EmeraldHoe(EmeraldToolMaterial.INSTANCE, 0, 0.0F, new Item.Settings().group(ItemGroup.TOOLS));
	public static ToolItem EMERALD_AXE = new EmeraldAxe(EmeraldToolMaterial.INSTANCE, 6.5F, -3.0F, new Item.Settings().group(ItemGroup.TOOLS));	

	public void onInitialize() {
		LOGGER.info("registering emerald_pickaxe");
		Registry.register(Registry.ITEM, new Identifier("minsemeraldtools", "emerald_pickaxe"), EMERALD_PICKAXE);

		LOGGER.info("registering emerald_sword");
		Registry.register(Registry.ITEM, new Identifier("minsemeraldtools", "emerald_sword"), EMERALD_SWORD);

		LOGGER.info("registering emerald_shovel");
		Registry.register(Registry.ITEM, new Identifier("minsemeraldtools", "emerald_shovel"), EMERALD_SHOVEL);

		LOGGER.info("registering emerald_hoe");
		Registry.register(Registry.ITEM, new Identifier("minsemeraldtools", "emerald_hoe"), EMERALD_HOE);

		LOGGER.info("registering emerald_axe");
		Registry.register(Registry.ITEM, new Identifier("minsemeraldtools", "emerald_axe"), EMERALD_AXE);
	}
}
