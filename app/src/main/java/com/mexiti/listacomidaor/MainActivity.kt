package com.mexiti.listacomidaor.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.mexiti.listacomidaor.data.DataSource
import com.mexiti.listacomidaor.model.Platillo
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Surface
import com.mexiti.listacomidaor.ui.theme.ListaComidaOrTheme
import androidx.compose.ui.graphics.Color  // Importa Color para usar el valor directo

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ListaComidaOrTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MenuApp()
                }
            }
        }
    }
}

@Composable
fun MenuApp() {
    MenuCardList(platilloList = DataSource().LoadPlatillos())
}

@Composable
fun MenuCardList(platilloList: List<Platillo>, modifier: Modifier = Modifier) {
    LazyColumn(modifier = modifier) {
        items(platilloList) { platillo ->
            MenuCard(platillo = platillo, modifier = modifier.padding(10.dp))
        }
    }
}

@Composable
fun MenuCard(platillo: Platillo, modifier: Modifier = Modifier) {
    Card(
        modifier = modifier.padding(8.dp)
    ) {
        Column {
            // Imagen circular
            Image(
                painter = painterResource(id = platillo.drawableResourceId),
                contentDescription = LocalContext.current.getString(platillo.stringResourceId),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .clip(CircleShape)
                    .padding(16.dp),
                contentScale = ContentScale.Crop
            )

            // Nombre del platillo como título
            Text(
                text = LocalContext.current.getString(platillo.stringResourceId),
                style = MaterialTheme.typography.headlineMedium,
                modifier = Modifier.padding(start = 16.dp, top = 8.dp)
            )

            // Precio del platillo en estilo normal
            Text(
                text = "$${platillo.precio}",
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.padding(start = 16.dp)
            )

            // Oferta del platillo resaltada con color personalizado (Naranja)
            Text(
                text = platillo.oferta,
                style = MaterialTheme.typography.bodyLarge.copy(color = Color(0xFFFFA726)),  // Naranja personalizado
                modifier = Modifier.padding(start = 16.dp, bottom = 8.dp)
            )
        }
    }
}