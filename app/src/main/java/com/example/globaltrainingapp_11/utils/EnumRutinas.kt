package com.example.globaltrainingapp_11.utils

class EnumRutinas {

    enum class SelectionCategoryRutinas {
        FULL_BODY, CUERPO_SUPERIOR, PIERNAS, KETTLEBELLS, ANILLAS ;

        companion object {
            fun fromPosition(pos: Int) = SelectionCategoryRutinas.values().firstOrNull {
                it.ordinal == pos
            }.toString()
        }

    }
}


