package com.example.customlistview;

import android.content.ClipData;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView simpleList;
    ArrayList<Item> bookList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        simpleList=findViewById(R.id.simplelistviewCustom);
        bookList.add(new Item("imageone",R.raw.imgone));
        bookList.add(new Item("imagetwo",R.raw.imgtwo));
        bookList.add(new Item("imagethree",R.raw.imgthree));
        bookList.add(new Item("imagefour",R.raw.imgfour));
        bookList.add(new Item("imagefive",R.raw.imgfive));

        MyAdapter myAdapter=new MyAdapter(this,R.layout.item,bookList);
        simpleList.setAdapter(myAdapter);
    }
}
