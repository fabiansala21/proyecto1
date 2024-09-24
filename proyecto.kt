
class examen(nombres:Array<String>){
    val respuestasdelexamen : CharArray = charArrayOf('a', 'c','b','a','d','b','b','c','a','a','b','d')
    val nombres: Array<String> = nombres
    val notas : FloatArray = FloatArray(4)
    val respuestas : Array<CharArray> = Array(4) {CharArray(12)}
    var contador: Int = 0

    fun leerrespuestas (respuestasdelexamen: CharArray) {
        if (contador < 4 && respuestasdelexamen.size == 12) {
            respuestas[contador] = respuestasdelexamen
            contador++
        }else{
            println("no se pueden agregar mas")
        }
    }
fun calcularnota() {
    for (i in 0 until contador){
        var correctas = 0
        for (j in 0 until 12){
            if (respuestas[i][j] == respuestasdelexamen[j]){
                correctas++
            }
        }
        notas[i] = (correctas.toFloat()/ 12.0f) * 100
    }

}
fun promediogrupo(): Float {
    val suma = notas.sum()
    return if (contador > 0) suma / contador else 0f
}
    fun mayornota(): String{
        val resultado = StringBuilder()
        for (i in 0 until contador){
            val estado = when {
                notas[i] >= 70 -> "aprobo"
                notas[i] >= 60 -> "reprobo"
                else -> "reprobo"
            }
            resultado.append("estudiante ${nombres[i]} respuestas: ${respuestas[i]} nota: ${"%.2f".format(notas[i])} $estado\n")
        }
        return resultado.toString()
    }
    fun mostrarexamenes(){
        println(mayornota())
    }
}

fun main() {
    val nombresdeestudiantes = arrayOf("marta","pedro","juan","maria")
    val examen = examen(nombresdeestudiantes)

    examen.leerrespuestas(charArrayOf('a', 'c','b','a','d','b','b','c','a','a','b','d'))
    examen.leerrespuestas(charArrayOf('b', 'c','b','d','d','b','b','a','b','d','b','d'))
    examen.leerrespuestas(charArrayOf('c', 'c','b','a','a','b','c','c','a','a','b','c'))
    examen.leerrespuestas(charArrayOf('c', 'c','b','a','d','b','b','c','a','a','b','c'))

    examen.calcularnota()
    examen.mostrarexamenes()

    val promedio = examen.promediogrupo()
    println("promedio del grupo: ${"%.2f".format(promedio)} ")

}











