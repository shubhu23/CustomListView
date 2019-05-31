package com.example.customlistview;

import android.content.Context;
import android.database.DataSetObserver;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

class MyAdapter extends ArrayAdapter<Item> {
    ArrayList<Item> bookList;

    public MyAdapter(Context context, int item, ArrayList<Item> objects) {
        super(context, item, objects);
        bookList = objects;
    }

    @Override
    public int getCount() {
        return super.getCount();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v ;
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        //LayoutInflater is used to compress file in list view
        v = inflater.inflate(R.layout.item, null);
        TextView textView =  v.findViewById(R.id.textViewcustom);
        ImageView imageView =  v.findViewById(R.id.imageViewcustom);
        textView.setText(bookList.get(position).getBookName());
        imageView.setImageResource(bookList.get(position).getBookImage());
        return v;
    }
}
