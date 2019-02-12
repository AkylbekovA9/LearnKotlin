fun main(args: Array<String>) {
//  IF
    val a = 2
    val b = 3

    if (a == b) {
        println("A does in fact B")
    }

    if (a != b) {
        println("A doesn't equal B")
    }


    val accountBalance = 100
    val price = 150
    if (accountBalance >= price) {
        println("You can buy this!")
    } else {
        println("Sorry, tou can't byu this")
    }


    val degrees = 60
    // ==  !=  >  <  >=  <=
    if (degrees >= 70) {
        println("this is some nice weather")
    } else if (degrees < 70 && degrees >= 50) {
        println("Grab a sweater")
    } else {
        println("Holy crap its cold!")
    }


    val isHungry = false
    val isBored = true

    if (isHungry || isBored) {
        println("Let's get pizza!")
    }



//WHEN

    val x = 3
    when (x) {
        1 -> println("x == 1")
        2 -> println("x == 2")
        else -> println("x does not equal 1 or 2")

    }

    fun vaderIsFeeling(mood: String = "angry") {
        if (mood == "angry") {
            println("run for the hills, Vader is $mood")
        } else {
            println("whatever you do, don't make him angry")
        }
    }

    vaderIsFeeling(mood = "happy")

}