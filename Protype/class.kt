class Car(val brand: String, val model: String, var year: Int) {
    fun startEngine() {
        println("Starting the $brand $model's engine.")
    }

    fun accelerate(speed: Int) {
        println("$brand $model is accelerating at $speed km/h.")
    }

    fun brake() {
        println("$brand $model is braking.")
    }

    fun displayInfo() {
        println("Car: $brand $model")
        println("Year: $year")
    }
}

fun main() {
    val car = Car("Toyota", "Camry", 2022)
    car.startEngine()
    car.accelerate(60)
    car.brake()
    car.displayInfo()
}
