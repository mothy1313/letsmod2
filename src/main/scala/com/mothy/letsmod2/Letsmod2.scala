package com.mothy.letsmod2


import com.mothy.letsmod2.proxy.IProxy
import com.mothy.letsmod2.reference.Reference
import cpw.mods.fml.common.{SidedProxy, Mod}
import cpw.mods.fml.common.event.{FMLPostInitializationEvent, FMLPreInitializationEvent, FMLInitializationEvent}

@Mod(modid = Reference.MODID , name = Reference.MODNAME, version = Reference.VERSION, modLanguage = Reference.MODLANG)
object Letsmod2 {

  @Mod.Instance("letsmod2")
  var instance = Letsmod2

  @SidedProxy(clientSide = "com.mothy.letsmod2.proxy.ClientProxy", serverSide = "com.mothy.letsmod2.proxy.ServerProxy")
  var proxy: IProxy = null

  @Mod.EventHandler
  def preInit(event: FMLPreInitializationEvent){


  }

  @Mod.EventHandler
  def init(event: FMLInitializationEvent) {


  }

  @Mod.EventHandler
  def postInit(event: FMLPostInitializationEvent){


  }
}



