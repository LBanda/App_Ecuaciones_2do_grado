package mx.itesm.ecuaciones2dogrado.Viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import mx.itesm.ecuaciones2dogrado.Modelo.Modelo

class VM : ViewModel(){

    private val modelo = Modelo()

    val a = MutableLiveData<Double>(0.0)
    val b = MutableLiveData<Double>(0.0)
    val c = MutableLiveData<Double>(0.0)
}