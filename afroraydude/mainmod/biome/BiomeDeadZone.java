package afroraydude.mainmod.biome;

import net.minecraft.block.Block;
import net.minecraft.world.biome.*;

public class BiomeDeadZone extends BiomeGenBase {

	public BiomeDeadZone(int par1) {
		super(par1);
		this.topBlock = (byte)Block.fire.blockID;
		this.fillerBlock = (byte)Block.netherrack.blockID;
		this.spawnableCreatureList.clear();
		this.spawnableCaveCreatureList.clear();
		this.spawnableMonsterList.clear();
		this.spawnableWaterCreatureList.clear();
		this.theBiomeDecorator.generateLakes = false;

	}

}
