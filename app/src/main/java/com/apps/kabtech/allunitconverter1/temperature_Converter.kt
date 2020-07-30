package com.apps.kabtech.allunitconverter1

object temperature_Converter {
    @JvmStatic
    fun celsius_tofah(value: Double): Double {
        return value * 9 / 5 + 32
    }

    @JvmStatic
    fun celsius_tokel(value: Double): Double {
        return value + 273.15
    }

    @JvmStatic
    fun fah_tocelsius(value: Double): Double {
        return (value - 32) * 5 / 9
    }

    @JvmStatic
    fun fah_tokel(value: Double): Double {
        return (value - 32) * 5 / 9 + 273.15
    }

    @JvmStatic
    fun kel_tocelsius(value: Double): Double {
        return value - 273.15
    }

    @JvmStatic
    fun kel_tofah(value: Double): Double {
        return (value - 273.15) * 9 / 5 + 32
    }
}