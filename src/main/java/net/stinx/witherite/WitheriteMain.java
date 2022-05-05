package net.stinx.witherite;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FuelRegistry;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraft.block.Block;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.BlockItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

import net.stinx.witherite.block.WitheriteBlock;
import net.stinx.witherite.items.ArmorBase;
import net.stinx.witherite.items.WitheritePetals;
import net.stinx.witherite.items.Witherite;
import net.stinx.witherite.items.tools.AxeBase;
import net.stinx.witherite.items.tools.HoeBase;
import net.stinx.witherite.items.tools.PickaxeBase;
import net.stinx.witherite.items.tools.ShovelBase;
import net.stinx.witherite.items.tools.SwordBase;
import net.stinx.witherite.util.WitheriteArmorMaterial;
import net.stinx.witherite.util.WitheriteToolMaterial;


public class WitheriteMain implements ModInitializer {

	/* compiling variables */
	private static final String MODID = "witherite";

	/* register variables */
	public static final Item WITHERITE_ITEM = new Witherite(new Item.Settings().group(ItemGroup.MISC));
	public static final Item WITHERITE_PETALS = new WitheritePetals(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(10).saturationModifier(15f).snack().meat().statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE,20*20), 0.2f).build()));
	public static final Block WITHERITE_BLOCK = new WitheriteBlock();
	public static final ArmorMaterial WITHERITE_ARMOR = new WitheriteArmorMaterial();

	@Override
	public void onInitialize() {
		
		/* log4j */
		Logger logger = LogManager.getLogger();
		logger.info("Successfully initialized Witherite");
		
		/* base */
		Registry.register(Registry.ITEM, new Identifier(MODID, "witherite_item"), WITHERITE_ITEM);
		Registry.register(Registry.ITEM, new Identifier(MODID, "witherite_petals"), WITHERITE_PETALS);
		Registry.register(Registry.BLOCK, new Identifier(MODID, "witherite_block"), WITHERITE_BLOCK); /* fabric block */
		Registry.register(Registry.ITEM, new Identifier(MODID, "witherite_block"), new BlockItem(WITHERITE_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS))); /* fabric block item */
		
		/* tools */
		Registry.register(Registry.ITEM, new Identifier(MODID, "witherite_pickaxe"), new PickaxeBase(new WitheriteToolMaterial()));
		Registry.register(Registry.ITEM, new Identifier(MODID, "witherite_axe"), new AxeBase(new WitheriteToolMaterial()));
		Registry.register(Registry.ITEM, new Identifier(MODID, "witherite_hoe"), new HoeBase(new WitheriteToolMaterial()));
		Registry.register(Registry.ITEM, new Identifier(MODID, "witherite_sword"), new SwordBase(new WitheriteToolMaterial()));
		Registry.register(Registry.ITEM, new Identifier(MODID, "witherite_shovel"), new ShovelBase(new WitheriteToolMaterial()));

		/* armor */
		Registry.register(Registry.ITEM, new Identifier(MODID, "witherite_helmet"), new ArmorBase (WITHERITE_ARMOR, EquipmentSlot.HEAD));
		Registry.register(Registry.ITEM, new Identifier(MODID, "witherite_chestplate"), new ArmorBase (WITHERITE_ARMOR, EquipmentSlot.CHEST));
		Registry.register(Registry.ITEM, new Identifier(MODID, "witherite_leggins"), new ArmorBase (WITHERITE_ARMOR, EquipmentSlot.LEGS));
		Registry.register(Registry.ITEM, new Identifier(MODID, "witherite_boots"), new ArmorBase (WITHERITE_ARMOR, EquipmentSlot.FEET));

		/* fuel registries */
		FuelRegistry.INSTANCE.add(WITHERITE_PETALS, 2400);
	}
}