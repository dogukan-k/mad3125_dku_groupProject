package com.dku.group_dku_755495_fp.Controller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.dku.group_dku_755495_fp.Model.Employee;
import com.dku.group_dku_755495_fp.R;

public class MainActivity extends AppCompatActivity {

    EditText searchBar;
    ListView listView;
    Button addButton;

    ArrayAdapter<Employee> itemsAdapter;


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


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                //Get id from list view;
                //For searhed objects

                Object obj = adapterView.getAdapter().getItem(position);
                String value = obj.toString();
                String trim = value.substring(value.lastIndexOf(":") + 1);

                Log.d("ggg", "onItemClick: "+trim.replaceAll("\\s",""));
                Employee employee = null;

                for (int i = 0 ; i<Employee.employeeList.size() ; i++){

                    if(Employee.employeeList.get(i).getId().equals(trim.replaceAll("\\s","")));
                    employee = Employee.employeeList.get(i);

                }



                Intent intent = new Intent(MainActivity.this, EmployeeDetailActivity.class);



                intent.putExtra("employee", employee.toDisplay());
                startActivity(intent);





            }
        });

        searchBar.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                MainActivity.this.itemsAdapter.getFilter().filter(charSequence);
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();


        itemsAdapter = new ArrayAdapter<Employee>(this, android.R.layout.simple_list_item_1, Employee.employeeList);
        listView.setAdapter(itemsAdapter);
    }


}
