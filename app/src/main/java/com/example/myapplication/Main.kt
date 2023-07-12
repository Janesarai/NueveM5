package com.example.myapplication

fun main(){
    println("Hola mundo")

    println("Ingrese el valor")
    val input= readLine()!!.toDouble()
    val fahrenheit= (input *9/5)+ 32

    println(" de celsius a fahrentheit: $fahrenheit" )

    val kelvin = input+ 273.15

    println("de celsius a kelvin: $kelvin")

    val fahrentheitToKelvin = 5.0/9.0 * ( fahrenheit -32)+ 273.15

    println("de farhentehit a kelvin: $fahrentheitToKelvin")


}
fun isLetters(string: String): Boolean {
    return string.none { it !in 'A'..'Z' && it !in 'a'..'z' }
}