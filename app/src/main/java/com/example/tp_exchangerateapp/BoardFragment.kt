package com.example.tp_exchangerateapp

import androidx.recyclerview.widget.RecyclerView
import com.example.tp_exchangerateapp.MyExchangeAdapter
import android.view.LayoutInflater
import android.view.ViewGroup
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.tp_exchangerateapp.R
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tp_exchangerateapp.databinding.FragmentBoardBinding
import java.util.ArrayList

class BoardFragment : Fragment() {

    lateinit var binding:FragmentBoardBinding
    var items:MutableList<Item> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        items.add(Item(R.drawable.ic_launcher_foreground, "미국", "usd", "1200"))
        items.add(Item(R.drawable.ic_launcher_foreground, "일본", "jpy", "1200"))
        items.add(Item(R.drawable.ic_launcher_foreground, "미국", "usd", "1200"))
        items.add(Item(R.drawable.ic_launcher_foreground, "일본", "jpy", "1200"))
        items.add(Item(R.drawable.ic_launcher_foreground, "미국", "usd", "1200"))
        items.add(Item(R.drawable.ic_launcher_foreground, "일본", "jpy", "1200"))

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

}