package com.example.cursoscomposableprueba

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.ScrollView
import android.widget.Scroller
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.widget.ScrollerCompat
import com.example.cursoscomposableprueba.ui.theme.CursosComposablePruebaTheme
import java.net.URL
import java.net.URLStreamHandler

class MainActivity : ComponentActivity() {
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
                    Elementos(rememberScrollState())

                }
            }
        }
    }
}

@Composable
 fun Elementos (rememberScrollState: ScrollState){
    val djpensum = "https://linktr.ee/carlosdelgadodj"
    val context = LocalContext.current
    val yintent = remember { Intent(Intent.ACTION_VIEW, Uri.parse(djpensum))}
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(androidx.compose.foundation.rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {

        Text(text = "Reloop DJ Academy (CURSOS)",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(15.dp))

        //Curso de DJ - Informacion
        Text(text = "CURSO DE DJ",
            fontSize = 15.sp,
            fontWeight = FontWeight.Bold)

        Image(painter = painterResource(id = R.drawable.cursodj),
            contentDescription = "CursoDJ",
            modifier = Modifier.size(200.dp))
        Text(text = "Este curso va dirigido a todos aquellos interesados en aprender todo lo relacionado con el increíble mundo de la mezcla y las direfentes técnicas que podemos manejar.")

        Spacer(modifier = Modifier.height(4.dp))

        //Curso de Produccion Musical - Informacion
        Text(text = "CURSO DE PRODUCCION MUSICAL",
            fontSize = 15.sp,
            fontWeight = FontWeight.Bold)

        Image(painter = painterResource(id = R.drawable.prodmusical),
            contentDescription = "CursoProduccion",
            modifier = Modifier.size(200.dp))
        Text(text = "     Este curso va dirigido a todos aquellos interesados en\n" +
                "aprender todo lo relacionado con la producción musical, adentrando\n" +
                "desde el entorno de trabajo hasta la mezcla y masterización.\n")
        Spacer(modifier = Modifier.height(4.dp))

        //Diplomado DJ Producer - Informacion
        Text(text = "DIPLOMADO DJ PRODUCER",
            fontSize = 15.sp,
            fontWeight = FontWeight.Bold)

        Image(painter = painterResource(id = R.drawable.djproducer),
            contentDescription = "DJProducer",
            modifier = Modifier.size(200.dp))
        Text(text = "     Este diplomado va dirigido a todos aquellos interesados en una \n" +
                "formación más extensa. Este diplomado lo conforman 3 asignaturas:\n" +
                "Música, DJ y Producción Musical y tiene como duración un año.\n")
        Spacer(modifier = Modifier.height(4.dp))

        Text(text = "Para conocer el contenido del pénsum estudiantil\n" +
                "para cada curso presiona VER PENSUM ESTUDIANTIL \n" +
                "en el",
                fontSize = 10.sp,
                fontWeight = FontWeight.Bold)
        Button(onClick = {context.startActivity(yintent)}) {
            Text(text = "VER PENSUM ESTUDIANTIL")



            }

}
}

