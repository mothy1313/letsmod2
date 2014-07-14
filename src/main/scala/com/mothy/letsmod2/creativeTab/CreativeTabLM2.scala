package com.mothy.letsmod2.creativeTab

import com.mothy.letsmod2.init.ModItems
import com.mothy.letsmod2.reference.Reference
import cpw.mods.fml.relauncher.{Side, SideOnly}
import net.minecraft.creativetab.CreativeTabs
import net.minecraft.item.Item


object CreativeTabLM2 {

  class CreativeTabsLM2 extends CreativeTabs(Reference.ModId) {

    override def getTabIconItem(): Item = ModItems.mapleLeaf

    override def getTranslatedTabLabel(): String = "Let's Mod Reboot"

  }

  val LM2Tab: CreativeTabs = new CreativeTabsLM2

}