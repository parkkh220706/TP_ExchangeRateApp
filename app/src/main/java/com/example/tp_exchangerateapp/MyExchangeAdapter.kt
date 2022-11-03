package com.example.tp_exchangerateapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyExchangeAdapter(private val mList: List<ExchangeItem>) : RecyclerView.Adapter<MyExchangeAdapter.VH>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.board_item, parent, false)
        return VH(view)
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        val ExchangeItem = mList[position]

        holder.imageView.setImageResource(ExchangeItem.image)
        holder.textView1.text = ExchangeItem.title
        holder.textView2.text = ExchangeItem.code
        holder.textView3.text = ExchangeItem.price
    }

    override fun getItemCount(): Int {
        return mList.size
    }

    class VH(ItemView: View) : RecyclerView.ViewHolder(ItemView){
        val imageView: ImageView = itemView.findViewById(R.id.iv_flags)
        val textView1: TextView = itemView.findViewById(R.id.tv_title)
        val textView2: TextView = itemView.findViewById(R.id.tv_code)
        val textView3: TextView = itemView.findViewById(R.id.tv_price)

    }
}
