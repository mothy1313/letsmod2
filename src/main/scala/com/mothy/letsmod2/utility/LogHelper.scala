package com.mothy.letsmod2.utility

import com.mothy.letsmod2.reference.Reference
import cpw.mods.fml.common.FMLLog
import org.apache.logging.log4j.Level


object LogHelper {

  def log(logLevel: Level, obj: Object): Unit = {
    FMLLog.log(Reference.MODID, logLevel, "[" + Reference.MODID + "] " + obj.toString)
  }

  def all(obj: Object) = {log(Level.ALL, obj)}

  def debug(obj: Object) = {log(Level.DEBUG, obj)}

  def error(obj: Object) = {log(Level.ERROR, obj)}

  def fatal(obj: Object) = {log(Level.FATAL, obj)}

  def info(obj: Object) = {log(Level.INFO, obj)}

  def off(obj: Object) = {log(Level.OFF, obj)}

  def trace(obj: Object) = {log(Level.TRACE, obj)}

  def warn(obj: Object) = {log(Level.WARN, obj)}



}
