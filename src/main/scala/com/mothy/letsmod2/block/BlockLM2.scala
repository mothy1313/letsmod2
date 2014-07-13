package com.mothy.letsmod2.block

import com.mothy.letsmod2.reference.Reference
import cpw.mods.fml.relauncher.{SideOnly, Side}
import net.minecraft.block.Block
import net.minecraft.block.material.Material
import net.minecraft.client.renderer.texture.IIconRegister
import net.minecraft.creativetab.CreativeTabs


class BlockLM2(material: Material) extends Block(material){

  this.setCreativeTab(CreativeTabs.tabBlock)


  def this()
  {
    this(Material.rock)
  }


  override def getUnlocalizedName: String = {
    String.format("item.%s%s", Reference.ModId.toLowerCase + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName))
  }


  @SideOnly(Side.CLIENT)
  override def registerBlockIcons(iconRegister: IIconRegister): Unit = {
    blockIcon = iconRegister.registerIcon(this.getUnlocalizedName.substring(this.getUnlocalizedName.indexOf(".") + 1))
  }

  def getUnwrappedUnlocalizedName(unlocalizedName: String): String = {
    unlocalizedName.substring(unlocalizedName.indexOf(".") + 1)
  }


}
