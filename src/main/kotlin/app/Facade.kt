package app

class Facade(private val service: VeryComplexInterface) {
    fun performActions() = service.let {
        header("Perform service actions")
        it.startService()
        it.startBaseProcess()
        it.startDataCalculation()
        it.prepareListOfActions()
        it.performActions()
    }

    fun performActionsInReverseOrder() = service.let {
        header("Perform service actions in reverse order")
        it.startService()
        it.startBaseProcess()
        it.startDataCalculation()
        it.prepareListOfActions()
        it.performActionsInReverseOrder()
    }
}