package afroraydude.mainmod;

import afroraydude.mainmod.biome.BiomeDeadZone;
import afroraydude.mainmod.biome.BiomeDenseForestBiome;
import afroraydude.mainmod.block.BlockAwesomeGemOre;
import afroraydude.mainmod.item.ItemAwesomeGem;
import afroraydude.mainmod.tool.ToolAwesomeAxe;
import afroraydude.mainmod.tool.ToolAwesomeHoe;
import afroraydude.mainmod.tool.ToolAwesomePickaxe;
import afroraydude.mainmod.tool.ToolAwesomeShovel;
import afroraydude.mainmod.weapon.ToolAwesomeSword;
import afroraydude.mainmod.worldgen.AwesomeGemWorldGeneration;
import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = "AwesomeMod", name = "Awesome Mod", version = "Alpha 1")

@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class main {
	
	/**TODO: All Other TODOs
	 */
	//Define Tools
	public static Item awesomePickaxe;
	public static Item awesomeSword;
	public static Item awesomeHoe;
	public static Item awesomeAxe;
	public static Item awesomeShovel;
	
	//Define World Gen
	public static AwesomeGemWorldGeneration AAG_genWorld = new AwesomeGemWorldGeneration();
	
	//Define Material
	public static EnumToolMaterial PureAwesomeness = EnumHelper.addToolMaterial("PureAwesome", 3, 1561, 8.0F, 10.0F, 10);
	
	//Define Blocks and ores
	public static Block awesomeGemOre;
	
	//Define Armor
	//TODO: Add Awesome Helmet, maybe other stuff. 

	
	//Define Biomes
	public static BiomeGenBase denseForestBiome;
	public static BiomeGenBase deadZone;
	public static BiomeGenBase stoneBiome;
	public static BiomeGenBase lavaBiome;
	
	//Define Items
	public static Item awesomeGem;
	
	@EventHandler
	public void Load(FMLPreInitializationEvent Event) {
		
		//Settings for Tools
		awesomePickaxe = new ToolAwesomePickaxe(1000, PureAwesomeness).setUnlocalizedName("afroraydude:awesomepick").setCreativeTab(CreativeTabs.tabTools);
		awesomeAxe = new ToolAwesomeAxe(1001, PureAwesomeness).setUnlocalizedName("afroraydude:awesomeaxe").setCreativeTab(CreativeTabs.tabTools);
		awesomeShovel = new ToolAwesomeShovel(1002, PureAwesomeness).setUnlocalizedName("afroraydude:awesomeshovel").setCreativeTab(CreativeTabs.tabTools);
		awesomeHoe = new ToolAwesomeHoe(1003, PureAwesomeness).setUnlocalizedName("afroraydude:awesomehoe").setCreativeTab(CreativeTabs.tabTools);
		awesomeSword = new ToolAwesomeSword(1004, PureAwesomeness).setUnlocalizedName("afroraydude:awesomesword").setCreativeTab(CreativeTabs.tabCombat);
				
		//Settings for Items
		awesomeGem = new ItemAwesomeGem(1007).setUnlocalizedName("afroraydude:awesome_gem").setCreativeTab(CreativeTabs.tabMaterials);
		
		//Settings For Ores And Blocks
		awesomeGemOre = new BlockAwesomeGemOre(1006,Material.rock).setUnlocalizedName("afroraydude:awesomegem_ore").setCreativeTab(CreativeTabs.tabBlock).setTickRandomly(true);
		//TODO: Load
		
		//Settings for Biomes 
		denseForestBiome = new BiomeDenseForestBiome(150).setBiomeName("Dense Forest").setMinMaxHeight(0.23F, 0.10F);
		deadZone = new BiomeDeadZone(151).setBiomeName("Meteor").setMinMaxHeight(0.23F, 0.22F);		
		
		//Register Tools
		GameRegistry.registerItem(awesomeAxe, "awesomeAxe");
		GameRegistry.registerItem(awesomeHoe, "awesomeHoe");
		GameRegistry.registerItem(awesomePickaxe, "awesomePickaxe");
		GameRegistry.registerItem(awesomeShovel, "awesomeShovel");
		GameRegistry.registerItem(awesomeSword, "awesomeSword");
		
		LanguageRegistry.addName(awesomeAxe, "Awesome Axe");
		LanguageRegistry.addName(awesomeHoe, "Awesome Hoe");
		LanguageRegistry.addName(awesomePickaxe, "Awesome Pickaxe");
		LanguageRegistry.addName(awesomeShovel, "Awesome Shovel");
		LanguageRegistry.addName(awesomeSword, "Awesome Sword");
		
		//Register Blocks
		GameRegistry.registerBlock(awesomeGemOre, "awesomeGemOre");
		LanguageRegistry.addName(awesomeGemOre, "Awesome Gem Ore");		
		
		//Register Items
		GameRegistry.registerItem(awesomeGem, "awesomeGem");
		LanguageRegistry.addName(awesomeGem, "Awesome Gem");;
		
		//Register World Generation
		GameRegistry.registerWorldGenerator(AAG_genWorld);
		MinecraftForge.setBlockHarvestLevel(awesomeGemOre, "pickaxe", 2);
		
		//Register Biomes
		GameRegistry.addBiome(denseForestBiome);
		GameRegistry.addBiome(deadZone);
		
		//Define Recipes for Items
		GameRegistry.addSmelting(awesomeGemOre.blockID, new ItemStack(awesomeGem), 2.55F);
		
		//Define Recipes For Tools
		/**TODO:

		GameRegistry
		GameRegistry
		GameRegistry
		GameRegistry
		GameRegistry
		*/
	}
}
