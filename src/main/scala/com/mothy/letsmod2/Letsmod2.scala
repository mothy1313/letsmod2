package com.mothy.letsmod2


import com.mothy.letsmod2.proxy.IProxy
import cpw.mods.fml.common.{SidedProxy, Mod}
import cpw.mods.fml.common.event.{FMLPostInitializationEvent, FMLPreInitializationEvent, FMLInitializationEvent}

@Mod(name = "Lets Mod 2", modid = "letsmod2", version = "1.7.2-1.0", modLanguage = "scala")
class Letsmod2 {

  @Mod.Instance("letsmod2")
  val instance: Letsmod2

  @SidedProxy(clientSide = "com.mothy.letsmod2.proxy.ClientProxy", serverSide = "com.mothy.letsmod2.proxy.ServerProxy")
  val proxy: IProxy

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



