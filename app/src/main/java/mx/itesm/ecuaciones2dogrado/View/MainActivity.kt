package mx.itesm.ecuaciones2dogrado.View

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import mx.itesm.ecuaciones2dogrado.R
import mx.itesm.ecuaciones2dogrado.Viewmodel.VM
import mx.itesm.ecuaciones2dogrado.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val calcularVM: VM by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        configurarEventos()
        registrarObservadores()
    }

    private fun registrarObservadores() {
        calcularVM.x1.observe(this){resultado ->
            binding.Raiz1.setText(resultado.toString())
        }
        calcularVM.x2.observe(this){resultado ->
            binding.Raiz2.setText(resultado.toString())
        }
    }

    private fun configurarEventos() {
        binding.btnResolver.setOnClickListener {
            val a = binding.CofA.text.toString().toDouble()
            val b = binding.CofB.text.toString().toDouble()
            val c = binding.CofC.text.toString().toDouble()

            calcularVM.resolver(a, b, c)
        }
    }
}