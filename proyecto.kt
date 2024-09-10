class examen{
    val respuestasdelexamen : CharArray = charArrayOf('a', 'c','b','a','d','b','b','c','a','a','b','d')
    val nombres: Array<String> = Array(4){""}
    val notas : FloatArray = FloatArray(4)
    val respuestas : Array<CharArray> = Array(4) {CharArray(12)}
    var contador: Int = 0

    fun meterexamen(nombre: String, respuestasdelexamen: CharArray, nota:Float) {
        if (contador < 4 && respuestasdelexamen.size == 12)
            nombres[contador] = nombre
        respuestas[contador] = respuestasdelexamen
        notas[contador] = nota
        contador++

        }

fun mostrarexamenes(){
    for (i in 0 until contador){
        println("estudiante: ${nombres[i]}")
        println("respuestas: ${respuestas[i]}")
        println("nota: ${notas[i]}")


    }
}
}

fun main() {
    
}
