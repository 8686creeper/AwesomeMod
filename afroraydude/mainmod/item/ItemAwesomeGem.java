package afroraydude.mainmod.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class ItemAwesomeGem extends Item{

	public ItemAwesomeGem(int par1) {
		super(par1);
		
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1RegisterIcon) {
		this.itemIcon = par1RegisterIcon.registerIcon("afroraydude:awesome_gem");
	
	}
}
