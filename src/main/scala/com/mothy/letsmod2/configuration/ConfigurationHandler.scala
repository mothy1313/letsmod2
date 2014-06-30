package com.mothy.letsmod2.configuration

import java.io.File

import net.minecraftforge.common.config.Configuration


object ConfigurationHandler {

  def init(configFile: File): Unit = {

    val configuration = new Configuration(configFile)

    try {
      configuration.load()

      val configValue: Boolean = configuration.get(Configuration.CATEGORY_GENERAL,"configValue", true, "Config value").getBoolean(true)

    } catch {
      // log exception
      case e: Exception => println("Loading configuration failed: " + e)

    } finally {
      configuration.save()
    }


  }

}
