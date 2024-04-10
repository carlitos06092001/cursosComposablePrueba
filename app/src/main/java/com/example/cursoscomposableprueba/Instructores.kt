package com.example.cursoscomposableprueba

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cursoscomposableprueba.ui.theme.CursosComposablePruebaTheme


class Instructor : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            CursosComposablePruebaTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    // Greeting("Android")
                    rememberScrollState()
                    Elementos1(rememberScrollState())

                }
            }
        }
    }
}

@Composable
fun Elementos1 (rememberScrollState: ScrollState){
Column (
    modifier = Modifier
        .fillMaxSize()
        .verticalScroll(rememberScrollState()),
    horizontalAlignment = Alignment.CenterHorizontally,
){
    Text(text = "Reloop DJ Academy (INSTRUCTORES)",
        fontSize = 18.sp,
        fontWeight = FontWeight.Bold)
    Spacer(modifier = Modifier.height(15.dp))

    //Angel Matt
    Text(text = "Angel Matt",
        fontSize = 15.sp,
        fontWeight = FontWeight.Bold)
    Image(painter = painterResource(id = R.drawable.angelmatt),
        contentDescription = "CursoDJ",
        modifier = Modifier.size(200.dp))
    Text(text = "Angel Martínez, se inició en el año 1982 en su propia miniteca (Discplay Movil) de nombre PRINCE. En el año 1986 surgió el nombre de ANGEL MATT. " +
            " Desde hace varios años Angel Matt ha tenido el honor de compartir stage con grandes artistas internacionales y nacionales: David Bisbal, Ricardo Arjona, Los Del Rio, Olga Tañon, Carlos Vives, Julio Iglesias, Armando Manzanero, Gipsy King, entre otros. " +
            " Ángel Matt es imagen oficial de la marca alemana Reloop, esta es especialista en el diseño, producción y comercialización de equipos para DJs y Productores Musicales  ")

    Spacer(modifier = Modifier.height(4.dp))

    //Bizon
    Text(text = "Bizon",
        fontSize = 15.sp,
        fontWeight = FontWeight.Bold)
    Image(painter = painterResource(id = R.drawable.bizondj),
        contentDescription = "CursoDJ",
        modifier = Modifier.size(200.dp))
    Text(text = "  Marlon Bissoon, mejor conocido como Bizon, es un dj de 27 años nacido en Caracas, Venezuela especializado en los géneros urbanos y electrónica. Influenciado en la música gracias a su familia, inicio sus estudios de dj en 2011 en Pitch Control (escuela para dj). Puso en pauso su carrera por varios años y en 2021 reanudó sus estudios en el área en Reloop Dj Academy y poco después ingresando como profesor en dicha institución.")





}
}
@Preview(
    showSystemUi = true,
    showBackground = true,
)@Composable
fun InstructorPreview(){
    CursosComposablePruebaTheme {
        Surface(
            Modifier.fillMaxSize()
        ) {
            Elementos1(rememberScrollState = ScrollState(20))
        }
    }
}
