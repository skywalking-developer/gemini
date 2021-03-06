package com.a.eye.gemini.analysis

import com.a.eye.gemini.analysis.executer.GeminiRegistry
import com.a.eye.gemini.analysis.executer.indicator.PvIndicatorExecuter
import com.a.eye.gemini.analysis.recevier.GeminiRecevier
import com.a.eye.gemini.analysis.util.GeminiZkClient

object AnalysisStartUp {

  def main(args: Array[String]): Unit = {
    GeminiZkClient.initialize()

    GeminiRegistry.register(new PvIndicatorExecuter)
    //    GeminiRegistry.register(new UvIndicatorExecuter)
    //    GeminiRegistry.register(new IpIndicatorExecuter)
    //    GeminiRegistry.register(new CostIndicatorExecuter)

    val recevier = new GeminiRecevier()
    recevier.startRecevie()
  }
}