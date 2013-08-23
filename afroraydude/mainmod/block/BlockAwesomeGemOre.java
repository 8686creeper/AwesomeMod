package afroraydude.mainmod.block;

import java.util.Random;

import afroraydude.mainmod.main;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class BlockAwesomeGemOre extends Block {

	public BlockAwesomeGemOre(int par1, Material par2Material) {
		super(par1, par2Material);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setHardness(10.0F);
		this.setResistance(12.0F);
		this.setLightValue(15.0F);
		this.setTickRandomly(true);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister) {
		this.blockIcon = par1IconRegister.registerIcon("afroraydude:awesomegem_ore");
		
	}

	public int idDropped(int par1, Random par2random, int par3) {
		return main.awesomeGemOre.blockID;
		
	}
	
	public int quantityDropped(int par1, Random par2random, int par3) {
		return 10;
	
	}
}

