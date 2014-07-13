package com.mothy.letsmod2

import com.mothy.letsmod2.handler.ConfigurationHandler
import com.mothy.letsmod2.init.{ModBlocks, ModItems}
import com.mothy.letsmod2.proxy.IProxy
import com.mothy.letsmod2.reference.Reference
import com.mothy.letsmod2.utility.LogHelper
import cpw.mods.fml.common.{FMLCommonHandler, SidedProxy, Mod}
import cpw.mods.fml.common.event.{FMLPostInitializationEvent, FMLPreInitializationEvent, FMLInitializationEvent}

@Mod(modid = Reference.ModId , name = Reference.ModName, version = Reference.Version, modLanguage = Reference.ModLang,
     guiFactory = Reference.GuiFactoryClass)
object Letsmod2 {

  @Mod.Instance(Reference.ModId)
  var instance = Letsmod2

  @SidedProxy(clientSide = Reference.ClientProxyClass ,serverSide = Reference.ServerProxyClass)
  var proxy: IProxy = null

  @Mod.EventHandler
  def preInit(event: FMLPreInitializationEvent){

    ConfigurationHandler.init(event.getSuggestedConfigurationFile)
    FMLCommonHandler.instance().bus().register(ConfigurationHandler)


    ModItems.init()
    ModBlocks.init()


    LogHelper.info("Pre-initialisation complete")
  }

  @Mod.EventHandler
  def init(event: FMLInitializationEvent) {

    LogHelper.info("Initialisation complete")
  }

  @Mod.EventHandler
  def postInit(event: FMLPostInitializationEvent){

    LogHelper.info("Post-initialisation complete")
  }
}



