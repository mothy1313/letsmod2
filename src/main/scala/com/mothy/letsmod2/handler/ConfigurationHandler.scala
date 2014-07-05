package com.mothy.letsmod2.handler

import java.io.File

import com.mothy.letsmod2.reference.Reference
import cpw.mods.fml.client.event.ConfigChangedEvent.OnConfigChangedEvent
import cpw.mods.fml.common.eventhandler.SubscribeEvent
import net.minecraftforge.common.config.Configuration


object ConfigurationHandler {

  var testValue: Boolean = false

  private var config: Option[Configuration] = None

  def init(configFile: File) {

    if (config.isEmpty) {
      config = Some(new Configuration(configFile))
      syncConfig
    }

  }

  @SubscribeEvent
  def onConfigurationChangedEvent(event: OnConfigChangedEvent):Unit = {

    if (event.modID == Reference.ModId){
      syncConfig
    }

  }

  def configuration: Configuration = {
    config.get
  }

  private def syncConfig: Unit = {
    testValue = configuration.get(Configuration.CATEGORY_GENERAL,"configValue", true, "Config value").getBoolean(true)

    if (configuration.hasChanged) configuration.save()
  }

}
