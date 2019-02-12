fun main(args: Array<String>) {
    val str = "May the force be with you."
    println(str)
    println()
    var str1 = "My dad said the funniest \nthing  he said"
    println(str1)
    println()

    str1 = "My dad said the funniest \tthing  he said"
    println(str1)
    println()

    str1 = "My dad said the funniest \bthing  he said"
    println(str1)
    println()

    str1 = "My dad said the funniest \rthing  he said"
    println(str1)
    println()

    str1 = "My dad said the funniest \$thing  he said"
    println(str1)
    println()
    println()
    println()
    println()


//-------------------------------------------------------------------------------------------------------------------



    val rawCrawl = """|A long time ago,
        |in a galaxy
        |far, far, away...
        |BUMM, BUMM
    """.trimMargin()

    println(rawCrawl)
    println()
    println()
//    for (char in str) {
//        println(char)
//    }
//-------------------------------------------------------------------------------------------------------------------

    val contentEquals = str.contentEquals("May the force be with you.")
    println(contentEquals)
    println()
    println()
//-------------------------------------------------------------------------------------------------------------------

    val contains = str.contains("force", true)
    println(contains)
    println()
    println()
//-------------------------------------------------------------------------------------------------------------------

    val uppercase = str.toUpperCase()
    val lower = str.toLowerCase()
    println(uppercase)
    println(lower)
    println()
    println()

//-------------------------------------------------------------------------------------------------------------------
    val subsequence = str.subSequence(4, 13)
    println(subsequence)
    println()
    println()

//-------------------------------------------------------------------------------------------------------------------
    val luke = "Luke Skywalker"
    val lightSaberColor = "green"
    val vehicle = "landspeeder"
    val age = 27

    println("$luke has a $lightSaberColor lightsaber and drives a $vehicle and is $age years old")
    println("Lukes full name $luke has ${luke.toUpperCase()}")
    println("Lukes full name $luke has ${luke.length}")

}

