package mx.itesm.ecuaciones2dogrado.Viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import mx.itesm.ecuaciones2dogrado.Modelo.Modelo

class VM : ViewModel(){

    private val modelo = Modelo()

    val x1 = MutableLiveData<Double>(0.0)
    val x2 = MutableLiveData<Double>(0.0)

    fun resolver(a: Double, b:Double, c:Double){
        x1.value = modelo.solveEquation(a, b, c)
        x2.value = modelo.solveEquation(a, b, c)
    }
}