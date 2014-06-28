package com.mothy.letsmod2


import cpw.mods.fml.common.Mod
import cpw.mods.fml.common.event.{FMLPostInitializationEvent, FMLPreInitializationEvent, FMLInitializationEvent}

@Mod(name = "Lets Mod 2", modid = "letsmod2", version = "1.7.2-1.0", modLanguage = "scala")
object Letsmod2 {

  @Mod.Instance("letsmod2")
  val instance = Letsmod2

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



