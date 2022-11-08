package com.example.tp_exchangerateapp

import android.content.ClipData
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text

class MyExchangeAdapter constructor(val context: Context, var items:MutableList<Item>): RecyclerView.Adapter<MyExchangeAdapter.VH>(){

    inner class VH constructor(itemView: View) : RecyclerView.ViewHolder(itemView){
        val tvTitle: TextView by lazy {itemView.findViewById(R.id.tv_title)}
        val tvCode: TextView by lazy {itemView.findViewById(R.id.tv_code)}
        val tvPrice: TextView by lazy {itemView.findViewById(R.id.tv_price)}


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        val layoutInflater: LayoutInflater = LayoutInflater.from(context)
        val itemView:View = layoutInflater.inflate(R.layout.board_item, parent, false)
        return VH(itemView)
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        val item:Item = items.get(position)

        holder.tvTitle.text = item.cur_nm
        holder.tvCode.text = item.cur_unit
        holder.tvPrice.text = item.deal_bas_r


    }

    override fun getItemCount(): Int = items.size

}
