package com.luiscorp.financialcat_01;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

public class ListFragment extends Fragment {

    public ListFragment() { }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        FrameLayout frame = (FrameLayout) inflater.inflate(R.layout.fragment_list, container, false);

        RecyclerView recycler = (RecyclerView) frame.findViewById(R.id.recycler);

        recycler.setLayoutManager(new LinearLayoutManager(frame.getContext()));
        recycler.setAdapter(new MyAdapter());

        return frame;
    }

}
