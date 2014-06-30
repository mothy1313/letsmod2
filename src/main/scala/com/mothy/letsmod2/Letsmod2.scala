package com.mothy.letsmod2


import com.mothy.letsmod2.configuration.ConfigurationHandler
import com.mothy.letsmod2.proxy.IProxy
import com.mothy.letsmod2.reference.Reference
import cpw.mods.fml.common.{SidedProxy, Mod}
import cpw.mods.fml.common.event.{FMLPostInitializationEvent, FMLPreInitializationEvent, FMLInitializationEvent}

@Mod(modid = Reference.MODID , name = Reference.MODNAME, version = Reference.VERSION, modLanguage = Reference.MODLANG)
object Letsmod2 {

  @Mod.Instance(Reference.MODID)
  var instance = Letsmod2

  @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS ,serverSide = Reference.SERVER_PROXY_CLASS)
  var proxy: IProxy = null

  @Mod.EventHandler
  def preInit(event: FMLPreInitializationEvent){

    ConfigurationHandler.init(event.getSuggestedConfigurationFile)

  }

  @Mod.EventHandler
  def init(event: FMLInitializationEvent) {


  }

  @Mod.EventHandler
  def postInit(event: FMLPostInitializationEvent){


  }
}



