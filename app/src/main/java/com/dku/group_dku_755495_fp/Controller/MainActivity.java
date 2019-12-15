package com.dku.group_dku_755495_fp.Controller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.dku.group_dku_755495_fp.Model.Employee;
import com.dku.group_dku_755495_fp.R;

public class MainActivity extends AppCompatActivity {

    EditText searchBar;
    ListView listView;
    Button addButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        searchBar = findViewById(R.id.searchText);
        listView = findViewById(R.id.listView);
        addButton = findViewById(R.id.add_button);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this , RegisterFormActivity.class);
                startActivity(intent);
            }
        });

    }

    @Override
    protected void onResume() {
        super.onResume();
        

    }
}
