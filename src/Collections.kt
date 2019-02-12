fun main(args: Array<String>) {

    //listOf - неизменяемый
    val imperials = listOf("Emperor", "Darth Vader", "Boba Fett", "Taarkin")
    println(imperials.sorted())
    println(imperials[2])
    println(imperials.last())
    println(imperials.contains("Luke"))  // we can't add or modify this list
    println(imperials)



    //arrayListOf - изменяемый
    val rebels = arrayListOf("Leiah", "Luke", "Han Solo", "Mon Mothma")
    println(rebels.size)
    rebels.add("Chewbacca")
    println(rebels)
    rebels.add(0, "Lando")
    println(rebels)
    println(rebels.indexOf("Luke"))
    rebels.remove("Han Solo")
    println(rebels)


    //mapOf - неизменяемый
    val rebelVehiclesMap = mapOf("Solo" to "Millenium Falcon", "Luke" to "Landspeeder")
    println(rebelVehiclesMap["Solo"])
    println(rebelVehiclesMap.get("Solo"))
    println(rebelVehiclesMap.getOrDefault("Leiah", "This ship doesn't exist"))
    println(rebelVehiclesMap.values)


    //hashMapOf - изменяемый
    val rebelVehicles = hashMapOf("Solo" to "Millenium Falcon", "Luke" to "Landspeeder", "Boba Fett" to "Roket Pack")
    rebelVehicles["Luke"] = "XWing"
    rebelVehicles.put("Leiah", "Tantive IV")
    println(rebelVehicles)
    rebelVehicles.remove("Boba Fett")
    println(rebelVehicles)
    rebelVehicles.isEmpty()

}