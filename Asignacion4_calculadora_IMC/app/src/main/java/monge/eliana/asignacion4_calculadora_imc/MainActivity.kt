package monge.eliana.asignacion4_calculadora_imc

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val estatura: EditText = findViewById(R.id.txtEstatura)
        val peso: EditText = findViewById(R.id.txtPeso)
        val resultado:  TextView  = findViewById(R.id.txtSalida)
        val btnCalcular: Button = findViewById(R.id.btnCalcular)

        btnCalcular.setOnClickListener {
            val estaturaTexto = estatura.text.toString()
            val pesoTexto = peso.text.toString()

            val estaturaValor = estaturaTexto.toFloat()
            val pesoValor = pesoTexto.toFloat()

            val imc = pesoValor/((estaturaValor*estaturaValor))

            resultado.text = "Tu IMC es: %.2f".format(imc)
        }

        }


    }

