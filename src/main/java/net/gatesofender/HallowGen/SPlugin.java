package net.gatesofender.HallowGen;


import org.bukkit.ChatColor;
import org.bukkit.craftbukkit.libs.joptsimple.OptionException;
import org.bukkit.craftbukkit.libs.joptsimple.OptionParser;
import org.bukkit.craftbukkit.libs.joptsimple.OptionSet;
import org.bukkit.generator.ChunkGenerator;
import org.bukkit.plugin.java.JavaPlugin;

import javax.swing.text.html.Option;


public class SPlugin extends JavaPlugin {
    @Override
    public ChunkGenerator getDefaultWorldGenerator(String worldName, String id) {
        getLogger().info("HallowGen loaded for world " + worldName);
        if (id == null) {
            id = "";
        }

        OptionParser parser = new OptionParser() {
            {
                accepts("underground-biomes")
                        .withRequiredArg()
                        .ofType(Boolean.class)
                        .defaultsTo(true);
            }
        };

        try {
            OptionSet optionSet = parser.parse(id.split(" "));

            GeneratorOptions options = new GeneratorOptions();
            options.undergroundBiomes = (Boolean)optionSet.valueOf("underground-biomes");

            return new SChunkGenerator(this, options);
        } catch (OptionException ex) {
            getLogger().severe(ChatColor.RED + "Failed to parse generator options: " + id);
        }

        return null;
    }
}
