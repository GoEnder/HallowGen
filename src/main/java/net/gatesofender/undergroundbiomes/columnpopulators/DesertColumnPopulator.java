//    Copyright (C) 2012  Ryan Michela
//
//    This program is free software: you can redistribute it and/or modify
//    it under the terms of the GNU General Public License as published by
//    the Free Software Foundation, either version 3 of the License, or
//    (at your option) any later version.
//
//    This program is distributed in the hope that it will be useful,
//    but WITHOUT ANY WARRANTY; without even the implied warranty of
//    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
//    GNU General Public License for more details.
//
//    You should have received a copy of the GNU General Public License
//    along with this program.  If not, see <http://www.gnu.org/licenses/>.

package net.gatesofender.undergroundbiomes.columnpopulators;

import net.gatesofender.undergroundbiomes.ColumnPopulatorBase;
import org.bukkit.Material;
import org.bukkit.block.Biome;

/**
 */
public class DesertColumnPopulator extends ColumnPopulatorBase {
    @Override
    public boolean appliesToBiome(Biome biome) {
        return biome == Biome.DESERT || biome == Biome.DESERT_HILLS;
    }

    @Override
    protected Material[] getBiomeSoilBlocks() {
        return new Material[] {Material.SANDSTONE, Material.SAND, Material.SAND, Material.SAND};
    }
}
