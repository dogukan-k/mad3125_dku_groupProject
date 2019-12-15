package com.dku.group_dku_755495_fp.Controller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.dku.group_dku_755495_fp.R;

public class EmployeeDetailActivity extends AppCompatActivity {


    TextView detail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_detail);

        detail = findViewById(R.id.txt_detail);
    }
}
