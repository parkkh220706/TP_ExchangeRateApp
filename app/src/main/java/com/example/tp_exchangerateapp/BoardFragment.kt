package com.example.tp_exchangerateapp

import android.content.Context
import android.content.Context.INPUT_METHOD_SERVICE
import androidx.recyclerview.widget.RecyclerView
import com.example.tp_exchangerateapp.MyExchangeAdapter
import android.view.LayoutInflater
import android.view.ViewGroup
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.core.content.ContextCompat.getSystemService
import androidx.fragment.app.Fragment
import com.example.tp_exchangerateapp.R
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tp_exchangerateapp.databinding.FragmentBoardBinding
import retrofit2.Callback
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.scalars.ScalarsConverterFactory
import retrofit2.create
import java.util.ArrayList

class BoardFragment : Fragment() {

    lateinit var binding:FragmentBoardBinding
    var items:MutableList<Item> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        items.add(Item("미국", "usd", "1200"))
        items.add(Item("일본", "jpy", "1200"))
        items.add(Item("미국", "usd", "1200"))

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_board, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding= FragmentBoardBinding.bind(view)

        binding.recyclerBoard.adapter= MyExchangeAdapter(requireContext(), items)
    }

    private fun getData() {

        val retrofit:Retrofit = Retrofit.Builder().baseUrl("https://www.koreaexim.go.kr")
            .addConverterFactory(ScalarsConverterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val retrofitService: RetrofitService= retrofit.create(RetrofitService::class.java)

        retrofitService.searchExchange().enqueue(object : Callback<>)




    }

}