package app

class VeryComplexServiceManager : VeryComplexInterface {
    override fun startService() = println("service started")

    override fun startBaseProcess() = println("base process started")

    override fun startDataCalculation() = println("data calculation started")

    override fun prepareListOfActions() = println("list of actions prepared")

    override fun performActions() = println("actions performed")

    override fun performActionsInReverseOrder() = println("actions performed in reverse order")
}