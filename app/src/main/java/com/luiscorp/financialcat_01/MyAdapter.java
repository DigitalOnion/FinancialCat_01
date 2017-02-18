package com.luiscorp.financialcat_01;

import android.graphics.drawable.LayerDrawable;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.LinkedHashMap;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private LinkedHashMap<String, DataRecord> dataMap = null;
    
    public MyAdapter() {
        super();
        dataMap = new LinkedHashMap<>();
        dataMap.put("000", new DataRecord("CERO"));
        dataMap.put("001", new DataRecord("UNO"));
        dataMap.put("002", new DataRecord("DOS"));
        dataMap.put("003", new DataRecord("TRES"));
        dataMap.put("004", new DataRecord("CUATRO"));
        dataMap.put("005", new DataRecord("CINCO"));
        dataMap.put("006", new DataRecord("SEIS"));
        dataMap.put("007", new DataRecord("SIETE"));
        dataMap.put("008", new DataRecord("OCHO"));
        dataMap.put("009", new DataRecord("NUEVE"));
        dataMap.put("010", new DataRecord("DIEZ"));
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.record_layout, parent, false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        String key = String.format("%3d", position).replace(' ', '0');
        DataRecord rec = dataMap.get(key);
        String content = "Unknown: " + key;
        if(rec != null)
            content = rec.getSymbol();
        holder.txtSymbol.setText(content);
    }

    @Override
    public int getItemCount() {
        int n = dataMap.size();
        Log.d("LUIS DEBUGGING", "SIZE:" + n);
        return n;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        public TextView txtSymbol;

        public MyViewHolder(View itemView) {
            super(itemView);
            txtSymbol = (TextView) itemView.findViewById(R.id.txtSymbol);
        }
    }
}
