package com.enderdevelopment.plugin;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onPlayerChat(AsyncPlayerChatEvent event) {
        Player player = event.getPlayer();
        Block targetBlock = player.getTargetBlockExact(5);

        if (targetBlock != null) {
            Material material = targetBlock.getType();
            ChatColor color = getColorForMaterial(material);
            String message = event.getMessage();
            event.setMessage(color + message);
        }
    }

    private ChatColor getColorForMaterial(Material material) {
        switch (material) {
            case GRASS_BLOCK:
                return ChatColor.GREEN;
            case DIRT:
                return ChatColor.DARK_GREEN;
            case STONE:
                return ChatColor.GRAY;
            case OAK_LOG:
                return ChatColor.DARK_GREEN;
            case BIRCH_LOG:
                return ChatColor.WHITE;
            case SPRUCE_LOG:
                return ChatColor.DARK_GREEN;
            case JUNGLE_LOG:
                return ChatColor.DARK_GREEN;
            case ACACIA_LOG:
                return ChatColor.GOLD;
            case DARK_OAK_LOG:
                return ChatColor.DARK_GREEN;
            case SAND:
                return ChatColor.YELLOW;
            case WATER:
                return ChatColor.BLUE;
            case LAVA:
                return ChatColor.RED;
            case DIAMOND_ORE:
                return ChatColor.AQUA;
            case EMERALD_ORE:
                return ChatColor.GREEN;
            case GOLD_ORE:
                return ChatColor.GOLD;
            case IRON_ORE:
                return ChatColor.WHITE;
            case COAL_ORE:
                return ChatColor.BLACK;
            case REDSTONE_ORE:
                return ChatColor.RED;
            case LAPIS_ORE:
                return ChatColor.BLUE;
            case OBSIDIAN:
                return ChatColor.DARK_PURPLE;
            case NETHERITE_BLOCK:
                return ChatColor.DARK_GRAY;
            case END_STONE:
                return ChatColor.WHITE;
            case BEDROCK:
                return ChatColor.DARK_GRAY;
            case SNOW_BLOCK:
                return ChatColor.WHITE;
            case ICE:
                return ChatColor.AQUA;
            case CLAY:
                return ChatColor.WHITE;
            case GLOWSTONE:
                return ChatColor.YELLOW;
            case PUMPKIN:
                return ChatColor.GOLD;
            case MELON:
                return ChatColor.GREEN;
            case HAY_BLOCK:
                return ChatColor.YELLOW;
            case TERRACOTTA:
                return ChatColor.RED;
            case WHITE_WOOL:
                return ChatColor.WHITE;
            case ORANGE_WOOL:
                return ChatColor.GOLD;
            case MAGENTA_WOOL:
                return ChatColor.LIGHT_PURPLE;
            case LIGHT_BLUE_WOOL:
                return ChatColor.BLUE;
            case YELLOW_WOOL:
                return ChatColor.YELLOW;
            case LIME_WOOL:
                return ChatColor.GREEN;
            case PINK_WOOL:
                return ChatColor.LIGHT_PURPLE;
            case GRAY_WOOL:
                return ChatColor.GRAY;
            case LIGHT_GRAY_WOOL:
                return ChatColor.GRAY;
            case CYAN_WOOL:
                return ChatColor.AQUA;
            case PURPLE_WOOL:
                return ChatColor.DARK_PURPLE;
            case BLUE_WOOL:
                return ChatColor.BLUE;
            case BROWN_WOOL:
                return ChatColor.GOLD;
            case GREEN_WOOL:
                return ChatColor.GREEN;
            case RED_WOOL:
                return ChatColor.RED;
            case BLACK_WOOL:
                return ChatColor.BLACK;
            default:
                return ChatColor.WHITE;
        }
    }
}