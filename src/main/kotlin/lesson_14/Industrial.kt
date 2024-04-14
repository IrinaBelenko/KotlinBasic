package lesson_14

class Industrial(
    name: String,
    speed: Int,
    val numberOfMines: Int,
) : Spaceship(name, speed, true){

    fun launchScanningDrones(){
        println("$name: сканирующие дроны запущены")
    }

    override fun runSystemDiagnostic(){
        super.runSystemDiagnostic()
        println("$name: Запущена диагностика дронов и майнеров")
    }
}