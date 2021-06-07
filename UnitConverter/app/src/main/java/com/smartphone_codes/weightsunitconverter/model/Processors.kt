package com.smartphone_codes.weightsunitconverter.model

import java.text.DecimalFormat

class processors {

    var decimalFormatter = DecimalFormat("##.#########")


    fun p_m(txt: Float): List<String> {
        val answers = mutableListOf<String>()


        val hm: Float = txt / 100
        val dm: Float = txt / 10
        val km: Float = txt / 1000
        val ft: Double = txt * 3.28084
        val cm: Float = txt * 100
        val mm: Float = txt * 1000

        answers.addAll(mutableListOf<String>(decimalFormatter.format(km).toString() + "\nKilometers", decimalFormatter.format(hm).toString() + "\nHectometers",
                decimalFormatter.format(dm).toString() + "\nDecameters", decimalFormatter.format(ft).toString() + "\nFoots", decimalFormatter.format(cm).toString() + "\nCentimeters", decimalFormatter.format(mm).toString() + "\nMillimeters"))

        return answers
    }

    fun p_km(txt: Float): List<String> {
        val answers = mutableListOf<String>()


        val hm: Float = txt * 10
        val dm: Float = txt * 100
        val m: Float = txt * 1000
        val ft: Double = txt * 3280.84
        val cm: Float = txt * 100000
        val mm: Float = txt * 1000000

        answers.addAll(mutableListOf<String>(decimalFormatter.format(hm).toString() + "\nHectometers", decimalFormatter.format(dm).toString() + "\nDecameters", decimalFormatter.format(m).toString() + "\nMeters", decimalFormatter.format(ft).toString() + "\nFoots",
                decimalFormatter.format(cm).toString() + "\nCentimeters", decimalFormatter.format(mm).toString() + "\nMillimeters"))

        return answers
    }

    fun p_hm(txt: Float): List<String> {
        val answers = mutableListOf<String>()


        val km: Float = txt / 10
        val dm: Float = txt * 10
        val m: Float = txt * 100
        val ft: Double = txt * 328.084
        val cm: Float = txt * 10000
        val mm: Float = txt * 100000

        answers.addAll(mutableListOf<String>(decimalFormatter.format(km).toString() + "\nKilometers", decimalFormatter.format(dm).toString() + "\nDecameters", decimalFormatter.format(m).toString() + "\nMeters",
                decimalFormatter.format(ft).toString() + "\nFoots", decimalFormatter.format(cm).toString() + "\nCentimeters", decimalFormatter.format(mm).toString() + "\nMillimeters"))

        return answers
    }

    fun p_dm(txt: Float): List<String> {
        val answers = mutableListOf<String>()


        val hm: Float = txt / 10
        val km: Float = txt / 100
        val m: Float = txt * 10
        val ft: Double = txt * 32.808
        val cm: Float = txt * 1000
        val mm: Float = txt * 10000

        answers.addAll(mutableListOf<String>(decimalFormatter.format(km).toString() + "\nKilometers", decimalFormatter.format(hm).toString() + "\nHectometers", decimalFormatter.format(m).toString() + "\nMeters",
                decimalFormatter.format(ft).toString() + "\nFoots", decimalFormatter.format(cm).toString() + "\nCentimeters", decimalFormatter.format(mm).toString() + "\nMillimeters"))

        return answers
    }

    fun p_ft(txt: Float): List<String> {
        val answers = mutableListOf<String>()


        val hm: Double = txt / 328.084
        val dm: Double = txt / 32.808
        val m: Double = txt / 3.281
        val km: Float = txt / 3281
        val cm: Double = txt * 30.48
        val mm: Double = txt * 304.8

        answers.addAll(mutableListOf<String>(decimalFormatter.format(km).toString() + "\nKilometers", decimalFormatter.format(hm).toString() + "\nHectometers", decimalFormatter.format(dm).toString() + "\nDecameters",
                decimalFormatter.format(m).toString() + "\nMeters", decimalFormatter.format(cm).toString() + "\nCentimeters", decimalFormatter.format(mm).toString() + "\nMillimeters"))

        return answers
    }

    fun p_cm(txt: Float): List<String> {
        val answers = mutableListOf<String>()


        val hm: Float = txt / 10000
        val dm: Float = txt / 1000
        val m: Float = txt / 100
        val ft: Double = txt / 30.48
        val km: Float = txt / 100000
        val mm: Float = txt * 10

        answers.addAll(mutableListOf<String>(decimalFormatter.format(km).toString() + "\nKilometers", decimalFormatter.format(hm).toString() + "\nHectometers", decimalFormatter.format(dm).toString() + "\nDecameters",
                decimalFormatter.format(m).toString() + "\nMeters", decimalFormatter.format(ft).toString() + "\nFoots", decimalFormatter.format(mm).toString() + "\nMillimeters"))

        return answers
    }

    fun p_mm(txt: Float): List<String> {
        val answers = mutableListOf<String>()


        val hm: Float = txt / 100000
        val dm: Float = txt / 10000
        val m: Float = txt / 1000
        val ft: Float = txt / 305
        val cm: Float = txt / 10
        val km: Float = txt / 1000000

        answers.addAll(mutableListOf<String>(decimalFormatter.format(km).toString() + "\nKilometers", decimalFormatter.format(hm).toString() + "\nHectometers", decimalFormatter.format(dm).toString() + "\nDecameters",
                decimalFormatter.format(m).toString() + "\nMeters", decimalFormatter.format(ft).toString() + "\nFoots", decimalFormatter.format(cm).toString() + "\nCentimeters"))

        return answers
    }

    //------- Areas Downside----------

    fun p_msq(txt: Float): List<String> {
        val answers = mutableListOf<String>()


        val kmsq: Float = txt / 1000000
        val hectare: Float = txt / 10000
        val acre: Float = txt / 4047
        val sqft: Double = txt * 10.764
        val cmsq: Float = txt * 10000
        val sqmm: Float = txt * 1000000

        answers.addAll(mutableListOf<String>(decimalFormatter.format(kmsq).toString() + "\nKilometer Squares", decimalFormatter.format(hectare).toString() + "\nHectares", decimalFormatter.format(acre).toString() + "\nAcres",
                decimalFormatter.format(sqft).toString() + "\nSquare Feets", decimalFormatter.format(cmsq).toString() + "\nSquare Cm", decimalFormatter.format(sqmm).toString() + "\nSquare Mm"))

        return answers
    }

    fun p_kmsq(txt: Float): List<String> {
        val answers = mutableListOf<String>()


        val acre: Float = txt * 247
        val cmsq: Float = txt * 10000000000
        val msq: Float = txt * 1000000
        val sqft: Float = txt * 10763900
        val hectare: Float = txt * 100
        val sqmm: Float = txt * 1000000000000

        answers.addAll(mutableListOf<String>(decimalFormatter.format(hectare).toString() + "\nHectares", decimalFormatter.format(acre).toString() + "\nAcres", decimalFormatter.format(sqft).toString() + "\nSquare Feets",
                decimalFormatter.format(msq).toString() + "\nMeter Squares", decimalFormatter.format(cmsq).toString() + "\nSquare Cm", decimalFormatter.format(sqmm).toString() + "\nSquare Mm"))

        return answers
    }

    fun p_sqft(txt: Float): List<String> {
        val answers = mutableListOf<String>()


        var acre: Float = txt / 43560
        var cmsq: Double = txt * 929.03
        val msq: Double = txt * 0.092903
        val kmsq: Float = txt / 10760000
        val hectare: Float = txt / 107639
        val sqmm: Float = txt * 92903

        answers.addAll(mutableListOf<String>(decimalFormatter.format(hectare).toString() + "\nHectares", decimalFormatter.format(acre).toString() + "\nAcres", decimalFormatter.format(kmsq).toString() + "\nSquare km",
                decimalFormatter.format(msq).toString() + "\nMeter Squares", decimalFormatter.format(cmsq).toString() + "\nSquare Cm", decimalFormatter.format(sqmm).toString() + "\nSquare Mm"))

        return answers
    }

    fun p_hectare(txt: Float): List<String> {
        val answers = mutableListOf<String>()


        val acre: Double = txt * 2.471
        val cmsq: Float = txt * 100000000
        val msq: Float = txt * 10000
        val sqft: Float = txt * 107639
        val kmsq: Double = txt * 0.01
        val sqmm: Float = txt * 10000000000

        answers.addAll(mutableListOf<String>(decimalFormatter.format(acre).toString() + "\nAcres", decimalFormatter.format(kmsq).toString() + "\nSquare Km",
                decimalFormatter.format(msq).toString() + "\nMeter Squares", decimalFormatter.format(sqft).toString() + "\nSquare Feets", decimalFormatter.format(cmsq).toString() + "\nCm Square", decimalFormatter.format(sqmm).toString() + "\nMm Square"))

        return answers
    }

    fun p_acre(txt: Float): List<String> {
        val answers = mutableListOf<String>()


        val kmsq: Float = txt / 247
        val cmsq: Float = txt * 40468600
        val msq: Double = txt * 4046.86
        val sqft: Float = txt * 43560
        val hectare: Double = txt / 2.471
        val sqmm: Float = txt * 4047000000

        answers.addAll(mutableListOf<String>(decimalFormatter.format(kmsq).toString() + "\nSquare km", decimalFormatter.format(hectare).toString() + "\nHectares", decimalFormatter.format(msq).toString() + "\nMeter Squares",
                decimalFormatter.format(sqft).toString() + "\nSquare Feets", decimalFormatter.format(cmsq).toString() + "\nSquare Cm", decimalFormatter.format(sqmm).toString() + "\nSquare Mm"))

        return answers
    }

    fun p_cmsq(txt: Float): List<String> {
        val answers = mutableListOf<String>()


        val acre: Float = txt / 40470000
        val kmsq: Float = txt / 10000000000
        val msq: Float = txt / 10000
        val sqft: Float = txt / 929
        val hectare: Float = txt * 100000000
        val sqmm: Float = txt * 100

        answers.addAll(mutableListOf<String>(decimalFormatter.format(hectare).toString() + "\nHectares", decimalFormatter.format(acre).toString() + "\nAcres", decimalFormatter.format(kmsq).toString() + "\nSquare km",
                decimalFormatter.format(msq).toString() + "\nMeter Squares", decimalFormatter.format(sqft).toString() + "\nSquare Feets", decimalFormatter.format(sqmm).toString() + "\nSquare Mm"))

        return answers
    }


    fun p_mmsq(txt: Float): List<String> {
        val answers = mutableListOf<String>()


        val acre: Float = txt / 4047000000
        val cmsq: Float = txt / 100
        val msq: Float = txt / 1000000
        val sqft: Float = txt / 92903
        val hectare: Float = txt / 10000000000
        val kmsq: Float = txt / 1000000000000

        answers.addAll(mutableListOf<String>(decimalFormatter.format(acre).toString() + "\nAcres", decimalFormatter.format(kmsq).toString() + "\nSquare Km", decimalFormatter.format(hectare).toString() + "\nHectares",
                decimalFormatter.format(msq).toString() + "\nMeter Squares", decimalFormatter.format(sqft).toString() + "\nSquare Feets", decimalFormatter.format(cmsq).toString() + "\nSquare Cm"))

        return answers
    }

//----------------Weights DOWNSIDE----------------------------

    fun p_kg(txt: Float): List<String> {
        val answers = mutableListOf<String>()


        val hg: Float = txt * 10
        val dg: Float = txt * 100
        val gm: Float = txt * 1000
        val dcg: Float = txt * 10000
        val cg: Float = txt * 100000
        val mg: Float = txt * 1000000

        answers.addAll(mutableListOf<String>(decimalFormatter.format(hg).toString() + "\nHectograms", decimalFormatter.format(dg).toString() + "\nDecagrams", decimalFormatter.format(gm).toString() + "\nGrams",
                decimalFormatter.format(dcg).toString() + "\nDecigrams", decimalFormatter.format(cg).toString() + "\nCentigrams", decimalFormatter.format(mg).toString() + "\nMilligrams"))

        return answers
    }

    fun p_gm(txt: Float): List<String> {
        val answers = mutableListOf<String>()

        val kg: Float = txt / 1000
        val dg: Float = txt / 10
        val hg: Float = txt / 100
        val dcg: Float = txt * 10
        val cg: Float = txt * 100
        val mg: Float = txt * 1000

        answers.addAll(mutableListOf<String>(decimalFormatter.format(kg).toString() + "\nKilograms", decimalFormatter.format(dg).toString() + "\nDecagrams", decimalFormatter.format(hg).toString() + "\nHectograms",
                decimalFormatter.format(dcg).toString() + "\nDecigrams", decimalFormatter.format(cg).toString() + "\nCentigrams", decimalFormatter.format(mg).toString() + "\nMilligrams"))

        return answers
    }

    fun p_dg(txt: Float): List<String> {
        val answers = mutableListOf<String>()

        val kg: Float = txt / 100
        val gm: Float = txt * 10
        val dcg: Float = txt * 100
        val cg: Float = txt * 1000
        val mg: Float = txt * 10000
        val hg: Float = txt / 10

        answers.addAll(mutableListOf<String>(decimalFormatter.format(kg).toString() + "\nKilograms", decimalFormatter.format(gm).toString() + "\nGrams", decimalFormatter.format(hg).toString() + "\nHectograms",
                decimalFormatter.format(dcg).toString() + "\nDecigrams", decimalFormatter.format(cg).toString() + "\nCentigrams", decimalFormatter.format(mg).toString() + "\nMilligrams"))

        return answers
    }

    fun p_dcg(txt: Float): List<String> {
        val answers = mutableListOf<String>()

        val kg: Float = txt / 10000
        val hg: Float = txt / 1000
        val dg: Float = txt / 100
        val gm: Float = txt / 10
        val cg: Float = txt * 10
        val mg: Float = txt * 100

        answers.addAll(mutableListOf<String>(decimalFormatter.format(kg).toString() + "\nKilograms", decimalFormatter.format(hg).toString() + "\nHectograms", decimalFormatter.format(dg).toString() + "\nDecagrams",
                decimalFormatter.format(gm).toString() + "\nGrams", decimalFormatter.format(cg).toString() + "\nCentigrams", decimalFormatter.format(mg).toString() + "\nMilligrams"))

        return answers
    }

    fun p_hg(txt: Float): List<String> {
        val answers = mutableListOf<String>()

        val kg: Float = txt / 10
        val dg: Float = txt * 10
        val dcg: Float = txt * 1000
        val gm: Float = txt * 100
        val cg: Float = txt * 10000
        val mg: Float = txt * 100000

        answers.addAll(mutableListOf<String>(decimalFormatter.format(kg).toString() + "\nKilograms", decimalFormatter.format(dg).toString() + "\nDecagrams", decimalFormatter.format(gm).toString() + "\nGrams",
                decimalFormatter.format(dcg).toString() + "\nDecigrams", decimalFormatter.format(cg).toString() + "\nCentigrams", decimalFormatter.format(mg).toString() + "\nMilligrams"))

        return answers
    }

    fun p_mg(txt: Float): List<String> {
        val answers = mutableListOf<String>()

        val kg: Double = txt * 0.000001
        val hg: Float = txt / 100000
        val dg: Float = txt / 10000
        val dcg: Float = txt / 100
        val cg: Float = txt / 10
        val gm: Float = txt / 1000

        answers.addAll(mutableListOf<String>(decimalFormatter.format(kg).toString() + "\nKilograms", decimalFormatter.format(hg).toString() + "\nHectograms", decimalFormatter.format(dg).toString() + "\nDecagrams",
                decimalFormatter.format(gm).toString() + "\nGrams", decimalFormatter.format(dcg).toString() + "\nDecigrams", decimalFormatter.format(cg).toString() + "\nCentigrams"))

        return answers
    }

    fun p_cg(txt: Float): List<String> {
        val answers = mutableListOf<String>()

        val kg: Float = txt / 100000
        val dg: Float = txt / 1000
        val dcg: Float = txt / 10
        val mg: Float = txt * 10
        val gm: Float = txt / 100
        val hg: Float = txt / 10000

        answers.addAll(mutableListOf<String>(decimalFormatter.format(kg).toString() + "\nKilograms", decimalFormatter.format(hg).toString() + "\nHectograms", decimalFormatter.format(dg).toString() + "\nDecagrams",
                decimalFormatter.format(gm).toString() + "\nGrams", decimalFormatter.format(dcg).toString() + "\nDecigrams", decimalFormatter.format(mg).toString() + "\nMilligrams"))

        return answers
    }

}