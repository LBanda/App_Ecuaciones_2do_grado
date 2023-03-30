package mx.itesm.ecuaciones2dogrado.Modelo

import kotlin.math.sqrt

class Modelo {

    var x1: String? = null
    var x2: String? = null

    fun solveEquation(a: Double, b: Double, c: Double):Double {
        val discriminant = b * b - 4 * a * c

        if (discriminant < 0) {
            val x1 = "Complejo"
            val x2 = "Complejo"

            return x1!!.toDouble()
            return x2!!.toDouble()
        } else {
            val x1 = ((-b + sqrt(discriminant)) / (2 * a)).toString()
            val x2 = ((-b - sqrt(discriminant)) / (2 * a)).toString()

            return x1!!.toDouble()
            return x2!!.toDouble()
        }
    }
}