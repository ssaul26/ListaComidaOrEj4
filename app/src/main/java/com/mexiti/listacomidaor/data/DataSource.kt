package com.mexiti.listacomidaor.data

import com.mexiti.listacomidaor.R
import com.mexiti.listacomidaor.model.Platillo

class DataSource {
    fun LoadPlatillos(): List<Platillo> {
        return listOf(
            Platillo(R.string.desayuno, R.drawable.desayuno, 70.0, "Descuento del 10%"),
            Platillo(R.string.hamburger, R.drawable.hamburger, 80.0, "2x1 en miércoles"),
            Platillo(R.string.pizza, R.drawable.pizza, 120.0, "20% descuento"),
            Platillo(R.string.postre, R.drawable.postre, 50.0, "Compra uno y lleva otro a mitad de precio"),
            Platillo(R.string.pozole, R.drawable.pozole, 100.0, "Sin oferta"),
            Platillo(R.string.tacos, R.drawable.tacos, 40.0, "3x2 en martes")
        )
    }
}
