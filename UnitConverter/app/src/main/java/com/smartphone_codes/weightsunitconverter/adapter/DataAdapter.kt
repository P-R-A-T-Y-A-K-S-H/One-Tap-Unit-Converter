package com.smartphone_codes.weightsunitconverter.adapter

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.smartphone_codes.weightsunitconverter.R

class DataAdapter(val dataset:List<String>,val coldata:List<String>,val context:Context):RecyclerView.Adapter<DataAdapter.DataViewHolder>(){

    class DataViewHolder(val view: View):RecyclerView.ViewHolder(view){
        val textview:TextView = view.findViewById(R.id.final_ans)
        val card:CardView=view.findViewById(R.id.card)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolder {

        val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.sol_card,parent,false)
        return DataViewHolder(adapterLayout)

    }

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) {

        val item = dataset[position]
        val item2 = coldata[position]

        holder.textview.text = item
        holder.card.setCardBackgroundColor(Color.parseColor(item2))
    }

    override fun getItemCount(): Int {
       return dataset.size
    }

}