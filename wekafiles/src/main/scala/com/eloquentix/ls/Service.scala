package com.eloquentix.ls

import edu.cmu.side.recipe.converters.ConverterControl

/**
 * Created by gabriel on 4/1/15.
 */
object Service {
  def main (args: Array[String]) {
    ConverterControl.loadRecipe("/home/gabriel/workspace/lightside/saved/dorel.model.xml")
  }
}
