package org.example.lesson_1_10.lesson_14

import lesson_14.Industrial
import lesson_14.Scout
import lesson_14.Spaceship

fun main() {
    // название, скорость, беспилотник
    // варп режим, диагностика системы
    // разведчик, индустриальный

//    val ship1 = Spaceship("ship1", 399)
//    ship1.runSystemDiagnostic()
//    ship1.switchToWarpMode()

    val scout1 = Scout("scout1", 750, 100, 1000)
    scout1.runSystemDiagnostic()
    scout1.switchToWarpMode()
    scout1.runAfterburner()
    scout1.handleDataFromRadar()
    println(scout1.unmanned)

    val industrial1 = Industrial("industrial1", 250, 8)
    industrial1.runSystemDiagnostic()
    industrial1.switchToWarpMode()
    industrial1.launchScanningDrones()
    println(industrial1.unmanned)
}


