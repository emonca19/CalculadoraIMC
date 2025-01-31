package monge.eliana.asignacion4_calculadora_imc

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val estatura: EditText = findViewById(R.id.txtEstatura)
        val peso: EditText = findViewById(R.id.txtPeso)
        val resultado: TextView = findViewById(R.id.txtSalida)
        val btnCalcular: Button = findViewById(R.id.btnCalcular)
        val categoria: TextView = findViewById(R.id.txtCategoria)

        btnCalcular.setOnClickListener {
            val estaturaTexto = estatura.text.toString()
            val pesoTexto = peso.text.toString()

            val estaturaValor = estaturaTexto.toFloat() / 100
            val pesoValor = pesoTexto.toFloat()

            // Calcular el IMC (Índice de Masa Corporal)
            val imc = pesoValor / (estaturaValor * estaturaValor)

            // Mostrar el resultado en el txtSalida
            resultado.text = "Tu IMC es: %.2f".format(imc)


            // Determinar la categoría y color
            when {
                imc < 18.5 -> {
                    categoria.text = "Bajo peso"
                    categoria.setTextColor(Color.BLUE)
                }

                imc in 18.5..24.9 -> {
                    categoria.text = "Normal"
                    categoria.setTextColor(Color.GREEN)
                }

                imc in 25.0..29.9 -> {
                    categoria.text = "Sobrepeso"
                    categoria.setTextColor(Color.YELLOW)
                }

                imc in 30.0..34.9 -> {
                    categoria.text = "Obesidad grado 1"
                    categoria.setTextColor(Color.rgb(255, 165, 0)) // Naranja
                }

                imc in 35.0..39.9 -> {
                    categoria.text = "Obesidad grado 2"
                    categoria.setTextColor(Color.RED)
                }

                else -> {
                    categoria.text = "Obesidad grado 3"
                    categoria.setTextColor(Color.rgb(139, 0, 0)) // Rojo oscuro
                }
            }
        }
    }

        }




