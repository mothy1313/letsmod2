package com.mothy.letsmod2.item

import com.mothy.letsmod2.creativeTab.CreativeTabLM2
import com.mothy.letsmod2.reference.Reference
import com.mothy.letsmod2.utility.LogHelper
import cpw.mods.fml.relauncher.{Side, SideOnly}
import net.minecraft.client.renderer.texture.IIconRegister
import net.minecraft.creativetab.CreativeTabs
import net.minecraft.item.{ItemStack, Item}


class ItemLM2 extends Item() {

  LogHelper.info("Initilising Item in ItemLM2")

  this.setCreativeTab(CreativeTabLM2.LM2Tab)



  override def getUnlocalizedName: String = {
    String.format("item.%s%s", Reference.ModId.toLowerCase + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName))
  }



  override def getUnlocalizedName(itemStack: ItemStack): String = {
    String.format("item.%s%s", Reference.ModId.toLowerCase + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName));
  }


  @SideOnly(Side.CLIENT)
  override def registerIcons(iconRegister: IIconRegister): Unit = {
    itemIcon = iconRegister.registerIcon(this.getUnlocalizedName.substring(this.getUnlocalizedName.indexOf(".") + 1));
  }





  def getUnwrappedUnlocalizedName(unlocalizedName: String): String = {
    unlocalizedName.substring(unlocalizedName.indexOf(".") + 1)
  }


}
