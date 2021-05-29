package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
ListView list;
ArrayAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        list=(ListView)findViewById(R.id.list1);
        adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1);
        //list.setTextAlignment(20);
        adapter.add("SS");
        adapter.add("WTA");
        adapter.add("CGV");
        adapter.add("OE");
        adapter.add("PE");
        list.setAdapter(adapter);
        list.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        String item = (String) adapter.getItem(i);
        switch (item) {
            case "SS":
                Toast.makeText(getBaseContext(), "Taught by SKS", Toast.LENGTH_LONG).show();
                break;
            case "WTA":
                Toast.makeText(getBaseContext(), "Taught by VY", Toast.LENGTH_LONG).show();
                break;
            case "CGV":
                Toast.makeText(getBaseContext(), "Taught by MJ", Toast.LENGTH_LONG).show();
                break;
            case "OE":
                Toast.makeText(getBaseContext(), "Taught by SK", Toast.LENGTH_LONG).show();
                break;
            case "PE":
                Toast.makeText(getBaseContext(), "Taught by MJS", Toast.LENGTH_LONG).show();
                break;

        }
        //Toast.makeText(this, "U clicked "+item, Toast.LENGTH_SHORT).show();
        if(i==0) {
            Intent it1 = new Intent(MainActivity.this, MainActivity2.class);
            startActivity(it1);
        }
        if(i==1) {
            Intent it1 = new Intent(MainActivity.this, MainActivity3.class);
            startActivity(it1);
        }
        if(i==2) {
            Intent it1 = new Intent(MainActivity.this, MainActivity4.class);
            startActivity(it1);
        }
        if(i==3) {
            Intent it1 = new Intent(MainActivity.this, MainActivity5.class);
            startActivity(it1);
        }
        if(i==4) {
            Intent it1 = new Intent(MainActivity.this, MainActivity6.class);
            startActivity(it1);
        }


    }
}
