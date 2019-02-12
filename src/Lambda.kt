fun main(args: Array<String>) {

    val printMessage = { message: String -> println(message) }
    printMessage("Hello")

    val sumA = { x: Int, y: Int -> x + y }
    println(sumA(5, 3))

    val sumB: (Int, Int) -> Int = { x, y -> x + y }

    fun downloadData(url: String, completion: () -> Unit) {
        //sent a download request
        //we got back data
        //there were no network errors
        completion()
    }


    //cal downloadDataFunction
    downloadData("fakeUrl.com", {
        println("The code int this block, will only run" +
                    "after the completion()")
    })

    fun downloadCarData(url: String, completion: (Car) -> Unit) {
        //send a download request
        //we got back car data
        val car = Car("Tesla", "ModelX", "Blue")
        completion(car)
    }

    downloadCarData("fakeUrl.com"){ car ->
        println(car.color)
        println(car.make)
    }

    downloadCarData("fakeUrl.com"){
        println(it.color)
        println(it.make)
    }

    fun downloadTruckData(url: String, completion: (Truck?, Boolean) -> Unit) {
        //make the web request
        //we get result back
        val webrequestSuccess = true
        if (webrequestSuccess) {
            //recieved truck data
            val truck = Truck("Ford", "F-150", 10000)
            completion(truck, true)
        } else {
            completion(null, false)
        }
    }

    downloadTruckData("fakeUrl") { truck, success ->
        if (success == true) {
            //do something with our truck
            truck?.tow()
        } else {
            //handle the web request failure
            println("Something went wrong")
        }
    }
}



    //val printMessage = { message: String -> println(message)} ==== fun printMessage(message: String) { println(message) }
