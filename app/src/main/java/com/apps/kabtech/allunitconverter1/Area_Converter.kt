package com.apps.kabtech.allunitconverter1

object Area_Converter {
    private const val sqMilli_tosqCent_value = 100.0
    @JvmStatic
    fun sqMilli_tosqCent(value: Double): Double {
        return value / sqMilli_tosqCent_value
    }

    private const val sqMilli_tosqMeter_value = 1000000.0
    @JvmStatic
    fun sqMilli_tosqMeter(value: Double): Double {
        return value / sqMilli_tosqMeter_value
    }

    private const val sqMilli_tosqKilometer_value = 0.000000000001
    @JvmStatic
    fun sqMilli_tosqKilometer(value: Double): Double {
        return value * sqMilli_tosqKilometer_value
    }

    private const val sqMilli_tosqMile_value = 0.0000000000003861
    @JvmStatic
    fun sqMilli_tosqMile(value: Double): Double {
        return value * sqMilli_tosqMile_value
    }

    private const val sqMilli_tosqInch_value = 645.16
    @JvmStatic
    fun sqMilli_tosqInch(value: Double): Double {
        return value / sqMilli_tosqInch_value
    }

    private const val sqMilli_tosqFoot_value = 92903.04
    @JvmStatic
    fun sqMilli_tosqFoot(value: Double): Double {
        return value / sqMilli_tosqFoot_value
    }

    private const val sqMilli_tosqYard_value = 836127.36
    @JvmStatic
    fun sqMilli_tosqYard(value: Double): Double {
        return value / sqMilli_tosqYard_value
    }

    private const val sqMilli_toHectare_value = 0.0000000001
    @JvmStatic
    fun sqMilli_toHectare(value: Double): Double {
        return value * sqMilli_toHectare_value
    }

    private const val sqMilli_toAcre_value = 0.00000000024711
    @JvmStatic
    fun sqMilli_toAcre(value: Double): Double {
        return value * sqMilli_toAcre_value
    }

    @JvmStatic
    fun sqCent_tosqMill(value: Double): Double {
        return value * 100
    }

    @JvmStatic
    fun sqCent_tosqMeter(value: Double): Double {
        return value / 10000
    }

    @JvmStatic
    fun sqCent_tosqKilometer(value: Double): Double {
        return value * 0.0000000001
    }

    @JvmStatic
    fun sqCent_tosqMile(value: Double): Double {
        return value / 0.00000000003861
    }

    @JvmStatic
    fun sqCent_tosqInch(value: Double): Double {
        return value / 6.452
    }

    @JvmStatic
    fun sqCent_tosqFoot(value: Double): Double {
        return value / 929.03
    }

    @JvmStatic
    fun sqCent_tosqYard(value: Double): Double {
        return value / 8361.24
    }

    @JvmStatic
    fun sqCent_toHactare(value: Double): Double {
        return value * 0.00000001
    }

    @JvmStatic
    fun sqCent_toAcre(value: Double): Double {
        return value * 0.000000024711
    }

    @JvmStatic
    fun sqMeter_tosqMill(value: Double): Double {
        return value * 1000000
    }

    @JvmStatic
    fun sqMeter_tosqCent(value: Double): Double {
        return value * 10000
    }

    @JvmStatic
    fun sqMeter_tosqKilometer(value: Double): Double {
        return value / 1000000
    }

    @JvmStatic
    fun sqMeter_tosqMile(value: Double): Double {
        return value * 0.0000003861
    }

    @JvmStatic
    fun sqMeter_tosqInch(value: Double): Double {
        return value * 1550.003
    }

    @JvmStatic
    fun sqMeter_tosqFoot(value: Double): Double {
        return value * 10.7639
    }

    @JvmStatic
    fun sqMeter_tosqYard(value: Double): Double {
        return value * 1.19599
    }

    @JvmStatic
    fun sqMeter_toHactare(value: Double): Double {
        return value / 10000
    }

    @JvmStatic
    fun sqMeter_toAcre(value: Double): Double {
        return value / 4046.856
    }

    @JvmStatic
    fun sqKilometer_tosqMill(value: Double): Double {
        return value * 1000000 * 1000000
    }

    @JvmStatic
    fun sqKilometer_tosqCent(value: Double): Double {
        return value * 100000 * 100000
    }

    @JvmStatic
    fun sqKilometer_tosqMeter(value: Double): Double {
        return value * 1000000
    }

    @JvmStatic
    fun sqKilometer_tosqMile(value: Double): Double {
        return value / 2.59
    }

    @JvmStatic
    fun sqKilometer_tosqInch(value: Double): Double {
        return value * 1550000000
    }

    @JvmStatic
    fun sqKilometer_tosqFoot(value: Double): Double {
        return value * 10760000
    }

    @JvmStatic
    fun sqKilometer_tosqYard(value: Double): Double {
        return value * 1196000
    }

    @JvmStatic
    fun sqKilometer_toHactare(value: Double): Double {
        return value * 100
    }

    @JvmStatic
    fun sqKilometer_toAcre(value: Double): Double {
        return value * 247.105
    }

    @JvmStatic
    fun sqMile_tosqMill(value: Double): Double {
        return value * 259000000 * 10000
    }

    @JvmStatic
    fun sqMile_tosqCent(value: Double): Double {
        return value * 259000000 * 100
    }

    @JvmStatic
    fun sqMile_tosqMeter(value: Double): Double {
        return value * 2590000
    }

    @JvmStatic
    fun sqMile_tosqKilometer(value: Double): Double {
        return value * 2.59
    }

    @JvmStatic
    fun sqMile_tosqInch(value: Double): Double {
        return value * 401400000 * 10
    }

    @JvmStatic
    fun sqMile_tosqFoot(value: Double): Double {
        return value * 27880000
    }

    @JvmStatic
    fun sqMile_tosqYard(value: Double): Double {
        return value * 3098000
    }

    @JvmStatic
    fun sqMile_toHactare(value: Double): Double {
        return value * 258.999
    }

    @JvmStatic
    fun sqMile_toAcre(value: Double): Double {
        return value * 640
    }

    @JvmStatic
    fun sqInch_tosqMill(value: Double): Double {
        return value * 645.16
    }

    @JvmStatic
    fun sqInch_tosqCent(value: Double): Double {
        return value * 6.452
    }

    @JvmStatic
    fun sqInch_tosqMeter(value: Double): Double {
        return value * 1550.003
    }

    @JvmStatic
    fun sqInch_tosqKilometer(value: Double): Double {
        return value * 0.00000000064516
    }

    @JvmStatic
    fun sqInch_tosqMile(value: Double): Double {
        return value * 0.0000000002491
    }

    @JvmStatic
    fun sqInch_tosqFoot(value: Double): Double {
        return value / 144
    }

    @JvmStatic
    fun sqInch_tosqYard(value: Double): Double {
        return value / 1296
    }

    @JvmStatic
    fun sqInch_toHactare(value: Double): Double {
        return value / 15500000
    }

    @JvmStatic
    fun sqInch_toAcre(value: Double): Double {
        return value / 6273000
    }

    @JvmStatic
    fun sqFoot_tosqMilli(value: Double): Double {
        return value * 92903.04
    }

    @JvmStatic
    fun sqFoot_tosqCent(value: Double): Double {
        return value * 929.03
    }

    @JvmStatic
    fun sqFoot_tosqMeter(value: Double): Double {
        return value / 10.764
    }

    @JvmStatic
    fun sqFoot_tosqKilometer(value: Double): Double {
        return value / 10760000
    }

    @JvmStatic
    fun sqFoot_tosqMile(value: Double): Double {
        return value / 27880000
    }

    @JvmStatic
    fun sqFoot_tosqInch(value: Double): Double {
        return value * 144
    }

    @JvmStatic
    fun sqFoot_tosqYard(value: Double): Double {
        return value / 9
    }

    @JvmStatic
    fun sqFoot_toHectare(value: Double): Double {
        return value / 107639.104
    }

    @JvmStatic
    fun sqFoot_toAcre(value: Double): Double {
        return value / 43560
    }

    @JvmStatic
    fun sqYard_tosqMilli(value: Double): Double {
        return value * 836127.36
    }

    @JvmStatic
    fun sqYard_tosqCent(value: Double): Double {
        return value * 8361.274
    }

    @JvmStatic
    fun sqYard_tosqMeter(value: Double): Double {
        return value / 1.196
    }

    @JvmStatic
    fun sqYard_tosqKilmeter(value: Double): Double {
        return value / 1196000
    }

    fun sqYard_tosqMile(value: Double): Double {
        return value / 3098000
    }

    @JvmStatic
    fun sqYard_tosqInch(value: Double): Double {
        return value * 1296
    }

    @JvmStatic
    fun sqYard_tosqFoot(value: Double): Double {
        return value * 9
    }

    @JvmStatic
    fun sqYard_toHectare(value: Double): Double {
        return value / 11959.9
    }

    @JvmStatic
    fun sqYard_toAcre(value: Double): Double {
        return value / 4840
    }

    @JvmStatic
    fun Hect_tosqMilli(value: Double): Double {
        return value * 100000 * 100000
    }

    @JvmStatic
    fun Hect_tosqCent(value: Double): Double {
        return value * 100000000
    }

    @JvmStatic
    fun Hect_tosqMeter(value: Double): Double {
        return value * 10000
    }

    @JvmStatic
    fun Hect_tosqKilometer(value: Double): Double {
        return value / 100
    }

    @JvmStatic
    fun Hect_tosqMile(value: Double): Double {
        return value / 258.999
    }

    @JvmStatic
    fun Hect_tosqInch(value: Double): Double {
        return value * 15500000
    }

    @JvmStatic
    fun Hect_tosqFoot(value: Double): Double {
        return value * 107639.104
    }

    @JvmStatic
    fun Hect_tosqYard(value: Double): Double {
        return value * 11959.9
    }

    @JvmStatic
    fun Hect_toAcre(value: Double): Double {
        return value * 2.471
    }

    @JvmStatic
    fun Acre_tosqMilli(value: Double): Double {
        return value * 404700000 * 10
    }

    @JvmStatic
    fun Acre_tosqCent(value: Double): Double {
        return value * 40470000
    }

    @JvmStatic
    fun Acre_tosqMeter(value: Double): Double {
        return value * 4046.856
    }

    @JvmStatic
    fun Acre_tosqKilometer(value: Double): Double {
        return value / 247.105
    }

    @JvmStatic
    fun Acre_tosqMile(value: Double): Double {
        return value / 640
    }

    @JvmStatic
    fun Acre_tosqInch(value: Double): Double {
        return value * 6273000
    }

    @JvmStatic
    fun Acre_tosqFoot(value: Double): Double {
        return value * 43560
    }

    @JvmStatic
    fun Acre_tosqyard(value: Double): Double {
        return value * 4840
    }

    @JvmStatic
    fun Acre_toHectare(value: Double): Double {
        return value / 2.471
    }
}