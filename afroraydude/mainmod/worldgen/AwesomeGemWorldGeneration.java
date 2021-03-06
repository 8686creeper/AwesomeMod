package afroraydude.mainmod.worldgen;

import java.util.Random;

import afroraydude.mainmod.main;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class AwesomeGemWorldGeneration implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch(world.provider.dimensionId) {
		
		case -1:
			generateNether(world, random, chunkX*10, chunkZ*16);
			break;
			
		case 0:
			generateSurface(world, random, chunkX*10, chunkZ*16);
			break;
			
		case 1:
			generateEnd(world, random, chunkX*10, chunkZ*16);
			break;
			
		}

	}
	
	private void generateSurface(World world, Random random, int i, int j) {
		// TODO Auto-generated method stub
		for (int k = 0; k < 25; k++) {
			int chunkX = i + random.nextInt(16);
			int chunkY = random.nextInt(256);
			int chunkZ = j+ random.nextInt(16);
			
			(new WorldGenMinable(main.awesomeGemOre.blockID, 64)).generate(world, random, chunkX, chunkY, chunkZ);
		}
		
	}
	
	private void generateEnd(World world, Random random, int i, int j) {
		
	}

	private void generateNether(World world, Random random, int i, int j) {
		
	}

}
