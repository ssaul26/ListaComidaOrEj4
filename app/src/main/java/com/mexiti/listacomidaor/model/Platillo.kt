package com.mexiti.listacomidaor.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Platillo(
    @StringRes val stringResourceId: Int,   // Nombre del platillo como string resource
    @DrawableRes val drawableResourceId: Int,  // Imagen del platillo como drawable resource
    val precio: Double,                     // Precio del platillo
    val oferta: String                      // Texto de la oferta
)
