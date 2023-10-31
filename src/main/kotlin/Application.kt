import app.Facade
import app.VeryComplexServiceManager
import app.header
import app.line

fun main() {
    val serviceManager = VeryComplexServiceManager()

    header("Perform service actions")
    serviceManager.let {
        it.startService()
        it.startBaseProcess()
        it.startDataCalculation()
        it.prepareListOfActions()
        it.performActions()
    }

    header("Perform service actions in reverse order")
    serviceManager.let {
        it.startService()
        it.startBaseProcess()
        it.startDataCalculation()
        it.prepareListOfActions()
        it.performActionsInReverseOrder()
    }

    line()
    println("Using Facade")
    val facade = Facade(serviceManager)

    facade.performActions()

    facade.performActionsInReverseOrder()
}