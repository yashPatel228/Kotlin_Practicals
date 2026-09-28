class Car(
    val type: String,
    val model: Int,
    val price: Double,
    val owner: String,
    val miles: Int
) {

    init {
        println("Object of class is created and Init is called.")
    }

    fun getCarInfo() {
        println("Car Information: $type, $model")
        println("Car Owner: $owner")
        println("Miles Drive: $miles")
    }

    fun getOriginalPrice() {
        println("Original Car Price: $price")
    }

    fun getCurrentPrice() {
        val currentPrice = price - (miles * 10)
        println("Current Car Price: $currentPrice")
    }

    fun displayCarInfo() {
        println("------------")
        getCarInfo()
        getOriginalPrice()
        getCurrentPrice()
        println("------------")
    }
}

fun main() {

    println("Creating Car Class Object car1 in next line")
    val car1 = Car("BMW", 2018, 100000.0, "Aman", 105)
    car1.displayCarInfo()

    println()
    println("Creating Car Class Object car2 in next line")
    val car2 = Car("BMW", 2019, 400000.0, "Karan", 20)
    car2.displayCarInfo()

    println()
    println("******** ArrayList of Car ********")

    val carList = ArrayList<Car>()

    carList.add(Car("Toyota", 2017, 1080000.0, "KJS", 100))
    carList.add(Car("Maruti", 2020, 4000000.0, "NPP", 200))

    println("------------")

    for (car in carList) {
        car.displayCarInfo()
        println()
    }
}