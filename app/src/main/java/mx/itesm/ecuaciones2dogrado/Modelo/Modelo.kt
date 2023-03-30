package mx.itesm.ecuaciones2dogrado.Modelo

import kotlin.math.sqrt

class Modelo {

    var x1: String? = null
    var x2: String? = null

    fun solveEquation(a: Double, b: Double, c: Double) {
        val discriminant = b * b - 4 * a * c

        if (discriminant < 0) {
            x1 = "Complejo"
            x2 = "Complejo"
        } else {
            x1 = ((-b + sqrt(discriminant)) / (2 * a)).toString()
            x2 = ((-b - sqrt(discriminant)) / (2 * a)).toString()
        }
    }
}