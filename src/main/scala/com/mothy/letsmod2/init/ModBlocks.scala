package com.mothy.letsmod2.init

import com.mothy.letsmod2.block.{BlockLM2, BlockFlag}
import com.mothy.letsmod2.reference.Reference
import cpw.mods.fml.common.registry.GameRegistry


@GameRegistry.ObjectHolder(Reference.ModId)
object ModBlocks {

  val flag: BlockLM2  = new BlockFlag()

  def init(): Unit = {
    GameRegistry.registerBlock(flag, "flag")
  }


}
