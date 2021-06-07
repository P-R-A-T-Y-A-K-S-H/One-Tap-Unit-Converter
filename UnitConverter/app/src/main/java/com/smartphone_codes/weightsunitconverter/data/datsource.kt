package com.smartphone_codes.weightsunitconverter.data

import android.app.Activity
import android.content.Context
import android.widget.Toast
import com.smartphone_codes.weightsunitconverter.R
import com.smartphone_codes.weightsunitconverter.model.processors

class datsource(context:Context) {

    val ldata = mutableListOf<String>()
    val ctx = context

    fun processor(unit:String,txt:Float):List<String>{

        val i3 = processors()

        when(unit){
            "Kilogram"-> ldata.addAll(i3.p_kg(txt))
            "Decagram"-> ldata.addAll(i3.p_dg(txt))
            "Decigram"-> ldata.addAll(i3.p_dcg(txt))
            "Hectagram"-> ldata.addAll(i3.p_hg(txt))
            "Gram"-> ldata.addAll(i3.p_gm(txt))
            "Milligram"-> ldata.addAll(i3.p_mg(txt))
            "Centigram"-> ldata.addAll(i3.p_cg(txt))
            "Kilometer"->ldata.addAll(i3.p_km(txt))
            "Meter"-> ldata.addAll(i3.p_m(txt))
            "Foot"-> ldata.addAll(i3.p_ft(txt))
            "Hectometer"-> ldata.addAll(i3.p_hm(txt))
            "Decameter"-> ldata.addAll(i3.p_dm(txt))
            "Centimeter"-> ldata.addAll(i3.p_cm(txt))
            "Millimeter"-> ldata.addAll(i3.p_mm(txt))
            "Meter Sq"-> ldata.addAll(i3.p_msq(txt))
            "Kilometer Sq."-> ldata.addAll(i3.p_kmsq(txt))
            "Sq. Foot"-> ldata.addAll(i3.p_sqft(txt))
            "Hectare"-> ldata.addAll(i3.p_hectare(txt))
            "Acre"-> ldata.addAll(i3.p_acre(txt))
            "Centimeter Sq."-> ldata.addAll(i3.p_cmsq(txt))
            "Millimeter Sq."-> ldata.addAll(i3.p_mmsq(txt))
            else->Toast.makeText(ctx,"No Unit Choosed",Toast.LENGTH_SHORT).show()
        }

        return ldata
    }

    fun colorProcessor(i:Int):List<String>{


        val colors = mutableListOf<String>()
        var col1:String = "#000000"
        var col2:String = "#FF6F00"
        for(d in 0..i+1){
            var temp = ""
            colors.add(col2)
            temp=col2
            col2=col1
            col1=temp
        }

        return colors

    }

}