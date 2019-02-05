package com.example.hanythermonitor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class wifi_list extends AppCompatActivity {
    ListView Wifi_Networks;
    ArrayAdapter<String> adapter;
    String[] android_version = {"Hyatt-wifi", "Mohamed Hany", "Shooting Club", "Android AP", "JW Mariot", "Hilton", "Ahmed's Iphone", "ps4", "jessy10"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Wifi_Networks = (ListView) findViewById(R.id.list_view);
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android_version);
        Wifi_Networks.setAdapter(adapter);
        Wifi_Networks.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), parent.getItemAtPosition(position) + "Selected item", Toast.LENGTH_LONG).show();
                Intent i= new Intent(wifi_list.this,blank.class);
                startActivity(i);
            }
        });

    }
}
