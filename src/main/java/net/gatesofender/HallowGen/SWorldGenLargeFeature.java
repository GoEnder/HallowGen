package net.gatesofender.HallowGen;

import net.minecraft.server.v1_6_R2.StructureStart;
import net.minecraft.server.v1_6_R2.WorldGenLargeFeature;


public class SWorldGenLargeFeature extends WorldGenLargeFeature {
    @Override
    protected StructureStart b(int i, int j) {
        return new SWorldGenLargeFeatureStart(this.c, this.b, i, j);
    }
}
