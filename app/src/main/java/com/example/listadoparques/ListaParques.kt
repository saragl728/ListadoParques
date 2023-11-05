package com.example.listadoparques

class ListaParques {
    companion object {
        val listaDeParques = listOf<Parques>(
            Parques("https://upload.wikimedia.org/wikipedia/commons/thumb/2/2e/G%C3%BCell_BCN.jpg/480px-G%C3%BCell_BCN.jpg", "Parque Güell", "Parque construido en el siglo XX en Barcelona"),
            (Parques("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e2/Jard%C3%AD_del_T%C3%BAria_de_Val%C3%A8ncia%2C_riuet.JPG/480px-Jard%C3%AD_del_T%C3%BAria_de_Val%C3%A8ncia%2C_riuet.JPG", "Jardín del Turia", "Parque de Valencia construido en 1986")),
            (Parques("https://upload.wikimedia.org/wikipedia/commons/thumb/3/36/Segovia_-_Paseo_de_la_Alameda_del_Parral_07.jpg/480px-Segovia_-_Paseo_de_la_Alameda_del_Parral_07.jpg", "Alameda del Parral", "Situado en Segovia")),
            (Parques("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d5/Arque_de_las_Llamas_14.jpg/480px-Arque_de_las_Llamas_14.jpg", "Parque de las llamas", "En Santander")),
            (Parques("https://upload.wikimedia.org/wikipedia/commons/thumb/7/78/Alameda_de_Compostela%2C_Vigo.JPG/450px-Alameda_de_Compostela%2C_Vigo.JPG", "Parque de la Alameda", "Parque cercano al puerto de Vigo")))
    }
}