package com.mothy.letsmod2.client.gui

import cpw.mods.fml.client.IModGuiFactory
import cpw.mods.fml.client.IModGuiFactory.{RuntimeOptionGuiHandler, RuntimeOptionCategoryElement}
import net.minecraft.client.Minecraft
import net.minecraft.client.gui.GuiScreen


class GuiFactory extends IModGuiFactory{

  def initialize(minecraftInstance: Minecraft): Unit = {
  }


  def mainConfigGuiClass: Class[_ <: GuiScreen] = {
    classOf[ModGuiConfig]
  }


  def runtimeGuiCategories = {
    null
  }

  def getHandlerFor(element: RuntimeOptionCategoryElement) = {
    null
  }
}
