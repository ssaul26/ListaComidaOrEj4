package com.mexiti.listacomidaor.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.mexiti.listacomidaor.R

// Crear una familia de fuentes que use RocketCrunch
val RocketCrunchFontFamily = FontFamily(
    Font(R.font.rocketcrunch, FontWeight.Normal)  // Usa el archivo rocketcrunch.otf
)

val Typography = Typography(
    headlineMedium = TextStyle(
        fontFamily = RocketCrunchFontFamily,  // Usa RocketCrunch en el estilo headlineMedium
        fontWeight = FontWeight.Normal,
        fontSize = 24.sp
    ),
    bodyLarge = TextStyle(
        fontFamily = RocketCrunchFontFamily,  // También usa RocketCrunch en bodyLarge
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    )
)
