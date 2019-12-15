package com.dku.group_dku_755495_fp.Controller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

import com.dku.group_dku_755495_fp.Model.Employee;
import com.dku.group_dku_755495_fp.R;

public class EmployeeDetailActivity extends AppCompatActivity {


    TextView detail;
    String incomingDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_detail);

        detail = findViewById(R.id.txt_detail);

        incomingDetail = getIntent().getExtras().getString("employee");

        Log.d("ggg", "onCreate: "+incomingDetail);


    }
}
