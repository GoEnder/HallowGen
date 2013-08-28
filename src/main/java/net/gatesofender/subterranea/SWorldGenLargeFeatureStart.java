package net.gatesofender.HallowGen;

import net.minecraft.server.v1_6_R2.*;

import java.util.Random;


public class SWorldGenLargeFeatureStart extends StructureStart {

    public SWorldGenLargeFeatureStart(World world, Random random, int i, int j) {
        BiomeBase biomebase = world.getBiome(i * 16 + 8, j * 16 + 8);

        if (biomebase != BiomeBase.JUNGLE && biomebase != BiomeBase.JUNGLE_HILLS) {
            if (biomebase == BiomeBase.SWAMPLAND) {
                WorldGenWitchHut worldgenwitchhut = new WorldGenWitchHut(random, i * 16, j * 16);

                this.a.add(worldgenwitchhut);
            } else {
                WorldGenPyramidPiece worldgenpyramidpiece = new SWorldGenPyramidPiece(random, i * 16, j * 16);

                this.a.add(worldgenpyramidpiece);
            }
        } else {
            WorldGenJungleTemple worldgenjungletemple = new WorldGenJungleTemple(random, i * 16, j * 16);

            this.a.add(worldgenjungletemple);
        }

        this.c();
    }
}
