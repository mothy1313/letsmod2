package com.mothy.letsmod2.handler

import java.io.File

import com.mothy.letsmod2.reference.Reference
import cpw.mods.fml.client.event.ConfigChangedEvent.OnConfigChangedEvent
import cpw.mods.fml.common.eventhandler.SubscribeEvent
import net.minecraftforge.common.config.Configuration


object ConfigurationHandler {

  var testValue: Boolean = false

  var configuration: Configuration = null

  def init(configFile: File) {

    if (configuration == null){
      configuration = new Configuration(configFile)
      loadConfiguration
    }

  }

  @SubscribeEvent
  def onConfigurationChangedEvent(event: OnConfigChangedEvent):Unit = {

    if (event.modID == Reference.MODID){
      loadConfiguration
    }

  }

  private def loadConfiguration {

    testValue = configuration.get(Configuration.CATEGORY_GENERAL,"configValue", true, "Config value").getBoolean(true)

    if (configuration.hasChanged) configuration.save()



  }

}
