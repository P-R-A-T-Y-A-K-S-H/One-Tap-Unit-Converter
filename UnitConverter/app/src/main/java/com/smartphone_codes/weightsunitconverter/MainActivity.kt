package com.smartphone_codes.weightsunitconverter

import android.app.Activity
import android.content.Context
import android.content.res.Resources
import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.view.inputmethod.InputMethodManager
import android.widget.*
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.smartphone_codes.weightsunitconverter.adapter.DataAdapter
import com.smartphone_codes.weightsunitconverter.data.datsource


class MainActivity : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.Q)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setTheme(R.style.Theme_WeightsUnitConverter)
        setContentView(R.layout.activity_main)

        //make translucent statusBar on kitkat devices
        //make translucent statusBar on kitkat devices
        if (Build.VERSION.SDK_INT >= 19 && Build.VERSION.SDK_INT < 21) {
            setWindowFlag(this, WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS, true)
        }
        if (Build.VERSION.SDK_INT >= 19) {
            window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_STABLE or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
        }
        //make fully Android Transparent Status bar
        //make fully Android Transparent Status bar
        if (Build.VERSION.SDK_INT >= 21) {
            setWindowFlag(this, WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS, false)
            window.statusBarColor = Color.TRANSPARENT
        }

        val rgroup: RadioGroup = findViewById(R.id.main_group)
        val txt: EditText = findViewById(R.id.data)
        val btn: Button = findViewById(R.id.convertbtn)
        val recycle: RecyclerView = findViewById(R.id.Frame_layout)
        val head:TextView = findViewById(R.id.head)
        val card:CardView=findViewById(R.id.rgholder)
        val bckbtn=findViewById<Button>(R.id.backbtn)
        val bcard = findViewById<CardView>(R.id.base_card)
        val bgroup = findViewById<RadioGroup>(R.id.base_group)
        val ctxt=findViewById<TextView>(R.id.cautiontxt)
//        val hd:TextView=findViewById(R.id.headcard)


        bgroup.setOnCheckedChangeListener { radioGroup, i ->
            gamechanger(i)
        }

        btn.setOnClickListener(View.OnClickListener {
            if (TextUtils.isEmpty(txt.text.toString())) {
                Toast.makeText(this,"Please enter a Digit",Toast.LENGTH_SHORT).show()

            }else if(rgroup.checkedRadioButtonId == -1) {
                Toast.makeText(this,"Select a Unit",Toast.LENGTH_SHORT).show()
            }
            else {
                hidekey(txt)
                head.setText("Results")
                card.visibility = View.INVISIBLE
                recycle.visibility = View.VISIBLE
                btn.visibility = View.INVISIBLE
                txt.visibility = View.INVISIBLE
                bckbtn.visibility = View.VISIBLE
                bcard.visibility = View.INVISIBLE
                ctxt.visibility = View.VISIBLE


                val rgname:String = findViewById<RadioButton>(rgroup.checkedRadioButtonId).text.toString()
//                hd.setText("${txt.text.toString()} ${rgname}")
                val mydataset = datsource(this).processor(rgname, txt.text.toString().toFloat())
                val coldata = datsource(this).colorProcessor(mydataset.size)
                recycle.adapter = DataAdapter(mydataset, coldata, this)
            }
        })

        bckbtn.setOnClickListener(View.OnClickListener {
            recycle.visibility = View.INVISIBLE
            card.visibility = View.VISIBLE
            btn.visibility = View.VISIBLE
            txt.visibility = View.VISIBLE
            bckbtn.visibility = View.INVISIBLE
            bcard.visibility = View.VISIBLE
            ctxt.visibility = View.INVISIBLE
            rgroup.clearCheck()
            txt.text=null
            head.text="Convert From :"

        })



    }

    fun setWindowFlag(activity: Activity, bits: Int, on: Boolean) {
        val win: Window = activity.window
        val winParams: WindowManager.LayoutParams = win.getAttributes()
        if (on) {
            winParams.flags = winParams.flags or bits
        } else {
            winParams.flags = winParams.flags and bits.inv()
        }
        win.setAttributes(winParams)
    }

    fun gamechanger(idd:Int){

        val rgroup:RadioGroup=findViewById(R.id.main_group)
        rgroup.clearCheck();

        var rb1 = findViewById<RadioButton>(R.id.u_gm)
        var rb2 = findViewById<RadioButton>(R.id.u_kg)
        var rb3 = findViewById<RadioButton>(R.id.u_hg)
        var rb4 = findViewById<RadioButton>(R.id.u_dg)
        var rb5 = findViewById<RadioButton>(R.id.u_dcg)
        var rb6 = findViewById<RadioButton>(R.id.u_cg)
        var rb7 = findViewById<RadioButton>(R.id.u_mg)

        if(idd==R.id.u_Lengths){
            rb1.setText("Meter")
            rb2.setText("Kilometer")
            rb3.setText("Foot")
            rb4.setText("Hectometer")
            rb5.setText("Decameter")
            rb6.setText("Centimeter")
            rb7.setText("Millimeter")
        }
        else if(idd==R.id.u_weights){
            rb1.setText("Gram")
            rb2.setText("Kilogram")
            rb3.setText("Hectagram")
            rb4.setText("Decagram")
            rb5.setText("Decigram")
            rb6.setText("Centigram")
            rb7.setText("Milligram")

        }
        else if(idd==R.id.u_area){

            rb1.setText("Meter Sq")
            rb2.setText("Kilometer Sq.")
            rb3.setText("Sq. Foot")
            rb4.setText("Hectare")
            rb5.setText("Acre")
            rb6.setText("Centimeter Sq.")
            rb7.setText("Millimeter Sq.")

        }
    }

    fun hidekey(view:View){
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken,0)
    }

    var count:Int =0

    override fun onBackPressed() {
        val recycle=findViewById<RecyclerView>(R.id.Frame_layout)
        val back=findViewById<Button>(R.id.backbtn)
        if(recycle.visibility==View.VISIBLE){
            back.performClick()
        }else {
            count++
            if(count>=2){
                super.onBackPressed()
            }
        }

    }
}