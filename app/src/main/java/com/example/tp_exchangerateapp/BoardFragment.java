package com.example.tp_exchangerateapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class BoardFragment extends Fragment {

    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager;
    private MyExchangeAdapter mAdapter;
    private ArrayList<ExchangeItem> list = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_board, container, false)

        // Replace 'android.R.id.list' with the 'id' of your RecyclerView
        mRecyclerView = (RecyclerView) view.findViewById(android.R.id.list);
        mLayoutManager = new LinearLayoutManager(this.getActivity());
        mRecyclerView.setLayoutManager(mLayoutManager);

        list.add("안녕녕")

       mAdapter = new MyExchangeAdapter();
        mRecyclerView.setAdapter(mAdapter);
        return view;
    }
}
