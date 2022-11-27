package com.example.kotlinesenciallinkedin

fun main() {
    //Tipo Literales//

    val numero = 5 //5 es un literal ya que Kotlin lo interpreta como Int
    val miByte: Byte = 5 //Kotlin interpreta que es de tipo Byte ya que asignamos el tipo
    val miShort: Short = 5 //Kotlin interpreta que es de tipo Short ya que asignamos el tipo
    val miLong: Long = 5 //Kotlin interpreta que es de tipo Long ya que asignamos el tipo

    //Representar valores de tipo Long sin utilizar el : Long
    val miLongConL = 5L

    val numeroDecimal = 5.5 //Kotlint interpreta como Double

    val numeroDecimalFloat: Float = 5.5F //Kotlin no deja asignar el tipo Float y el valor sin el F al final, se debe agregar

    //Hexadecimal
    val miHexadecimal = 0x10 //0x10 Representa 16 en decimal
    println(miHexadecimal)

    //Binario
    val miBinario = 0b00000010 //Representacion del numero binario en 2
    println(miBinario)

    //Kotlin no literales en sistema ocal//

    val velocidadDeDaLuz = 3e8 //3 x 10 a la 8

    val dosMillones = 2_000_000 //Se utiliza guiones bajos para entender de mejor manera los numeros grandes, Kotlin no los toma en cuenta

    //Literales de tipo caracter Char
    val b = 'b' //Se utiliza comillas simples
    val nuevaLiena = '\n'
    val comillaSimple = '\''
    val aConAcento = '\u00E1'
    val mensaje = "Este accesorio cuesta 125\$" //Para utilizar simbolos y no llamar a variables se utiliza el \ antes
    println(mensaje)
    val mensaje2 = """
        Este es un mensaje
        Con varias Lineas
    """
    println(mensaje2)







}