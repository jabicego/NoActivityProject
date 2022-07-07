package com.example.noactivityproject

fun main() {
    newTopic("SENTENCES CONDIC")
    newSubTopic("IF SENTENCE")
    if (true){
        println("sentencia IF")
    }

    newSubTopic("Equality")
    if (1 == 1){
        println("1 es igual a 1")
    }

    newSubTopic("Equals")
    val al = "Alain"
    if (al.equals("Alain")){
        println("Es lo mismo")
    }

    //operadores lógicos
    newSubTopic("Logical operators")
    if (1 != 2) { //not
        println("1 es diferente de 2")
    }
    if (1 == 1 || 1 < 2){ //or
        println("1 es igual o menor a 2")
    }
    if (1 != 2 && 1 < 2){ //and
        println("1 es diferente y menor que 2")
    }

    //nested if
    if (1 == 1){
        if (1 < 2){
            println("if anidado")
        }
    }

    //if else
    newSubTopic("If else")
    val a = 15
    val b = 15

    if (a > b){
        println("a es mayor a b")
    } else {
        println("a no es mayor a b")
    }

    if (a < b){
        println("a es menor a b")
    } else if (a == b){
        println("a es igual a b")
    } else{
        println("a es mayor a b")
    }

    //when
    newSubTopic("When")
    val name = "Cursos Android ANT"


    when(name){
        "Karina" -> println("Hola Kari")
        "Pablo" -> println("Hola Pablin")
        "Alain",
        "Cursos Android ANT" -> println("Hola Al")
        "Pamela" -> println("Hola Pam")
        else -> println("Hola desconocido :)")
    }

    //Estructura de datos
    newTopic("Collections")
    //vararg
    newSubTopic("Vararg")

    multiArguments("Karina", "Pamela", "Pablo", "Juan")

    //array simple       0    1    2    3    4    5
    val array = arrayOf('p', 'a', 'm', 'e', 'l', 'a')
    println(array[0])
    println(array.get(1))
    println(array[4])
    val arraycadena = "pamela"
    println(arraycadena[4])

    //listOf
    newSubTopic("listOf")
    //val readOnlyList = listOf("Alain", "Mary", "Chris", "Laura")
    val readOnlyList: List<String>
    readOnlyList = listOf("Alain", "Mary", "Chris", "Laura")
    println("Read-Only: $readOnlyList")
    println("Name at 1 = ${readOnlyList.get(1)}")

    //mutableListOf
    newSubTopic("mutableListOf")
    val mutableList = mutableListOf("Alain", "Mary", "Chris", "Laura")
    println("Mutable: $mutableList")
    mutableList.add("Juan")
    println("Add: $mutableList")
    mutableList.removeAt(1)
    println("RemoveAt: $mutableList")
    mutableList.remove("Juan")
    println("Remove: $mutableList")
    mutableList.set(1, "Angel")
    println("Set: $mutableList")

    //map
    newSubTopic("map")
    val mutableMap = mutableMapOf<String, String>()
    mutableMap.put("Al", "Alain")
    mutableMap.put("Pam", "Pamela")
    mutableMap.put("Chris", "Christian")
    println("Map: $mutableMap")
    println("Get by Key: ${mutableMap.get("Al")}")
    mutableMap.remove("Pam")
    mutableMap.set("Al", "Alejandro")
    println("remove & set: $mutableMap")
    println(mutableMap.keys)
    println(mutableMap.values)

    //arrayOfNull
    newSubTopic("Array of null")
    val nullArray = arrayOfNulls<String>(3)
    nullArray[1] = "Karina"
    println(nullArray[1])
    println(nullArray[0])

    //methods collections
    newSubTopic("Métodos en colecciones")
    println(readOnlyList)
    println("sort: ${readOnlyList.sorted()}")
    println("reverse: ${readOnlyList.reversed()}")
    println("sort & reverse: ${readOnlyList.sorted().reversed()}")
    println("indexOf Laura: ${readOnlyList.indexOf("Laura")}")

    //loops
    newTopic("Bucles")
    loops("Karina", "Pamela", "Pablo", "Juan", "Albert")

}

fun loops(vararg names:String) {
    newSubTopic("for")
    for (i in 1..10 step 2) {
        println(i)
    }
    for (i in 0..names.size - 1) {
        println("$i = ${names.get(i)}")
    }
    for (name in names) {
        println(name)
    }

    //foreach
    newSubTopic("foreach")
    names.forEach { name ->
        println(name)
    }
    (1..5).forEach {
        println(it)
    }

    //while
    newSubTopic("while")
    var index = 0
    println(names.size)
    while (index < names.size){
        println("index: $index")
        println("name at index: ${names.get(index)}")
        //index = index + 1
        index++
    }

    //do while
    newSubTopic("do while")
    do {
        index--
        println("index : $index")
        println("name at index: ${names.get(index)}")
    } while (index > 0)

    //return
    newSubTopic("return")
    (1..5).forEach {
        if (it == 3){
            return@forEach
        }
        println(it)
    }
    //break
    newSubTopic("break")
    for (i in 1..5){
        if (i == 3){
            break
        }
        println(i)
    }
    index = names.size
    do {
        index--
        if (index < 0){
            break
        }
        println("index : $index")
        println("name at index: ${names.get(index)}")
    } while (index >= 0)

}

fun multiArguments(vararg name:String){
    println("vararg en la posición 0: ${name[0]}")
}