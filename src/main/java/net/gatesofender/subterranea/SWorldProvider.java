package net.gatesofender.HallowGen;

import net.minecraft.server.v1_6_R2.WorldProviderNormal;


public class SWorldProvider extends WorldProviderNormal {
    @Override
    public int getSeaLevel() {
        return 192;
    }
}
