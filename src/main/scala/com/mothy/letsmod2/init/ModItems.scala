package com.mothy.letsmod2.init

import com.mothy.letsmod2.item.{ItemMapleLeaf, ItemLM2}
import com.mothy.letsmod2.reference.Reference
import com.mothy.letsmod2.utility.LogHelper
import cpw.mods.fml.common.registry.GameRegistry


@GameRegistry.ObjectHolder(Reference.ModId)
object ModItems {

  val mapleLeaf: ItemLM2 = new ItemMapleLeaf()

  def init(): Unit = {
    LogHelper.info("Initialising items")
    GameRegistry.registerItem(mapleLeaf, "mapleLeaf")

    LogHelper.info("Registered: " + mapleLeaf.getUnlocalizedName())
  }

}
