package com.mothy.letsmod2.client.gui

import com.mothy.letsmod2.handler.ConfigurationHandler
import com.mothy.letsmod2.reference.Reference
import cpw.mods.fml.client.config.GuiConfig
import net.minecraft.client.gui.GuiScreen
import net.minecraftforge.common.config.{Configuration, ConfigElement}



class ModGuiConfig(guiScreen: GuiScreen) extends GuiConfig(guiScreen,
    new ConfigElement[Any](ConfigurationHandler.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements,
    Reference.MODID,
    false,
    false,
    GuiConfig.getAbridgedConfigPath(ConfigurationHandler.configuration.toString)
)