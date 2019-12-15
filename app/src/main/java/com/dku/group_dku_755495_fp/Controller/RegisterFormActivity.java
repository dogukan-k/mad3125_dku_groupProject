package com.dku.group_dku_755495_fp.Controller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import com.dku.group_dku_755495_fp.R;

public class RegisterFormActivity extends AppCompatActivity {

    Spinner spinner;
    EditText gainFactorNumber;
    TextView gainFactorInfoText;
    RadioButton motorBikeRadioButton;
    RadioButton carRadioButton;
    RadioGroup sideCarRadioGroup;
    RadioGroup vehicleRadioGroup;
    RadioButton sideCarYes;
    RadioButton sideCarNo;
    TextView carTypeText;
    EditText carType;
    TextView txtSideCar;
    TextView textCarType;
    EditText vehicleModel;

    String[] employmentTypes = {"Manager","Tester","Programmer"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_form);

        spinner = findViewById(R.id.spinner_employee_type);
        gainFactorInfoText = findViewById(R.id.txt_gain_factor_choosen);
        gainFactorNumber = findViewById(R.id.number_gain_factors);

        motorBikeRadioButton = findViewById(R.id.motorbike_radio_button);
        carRadioButton = findViewById(R.id.car_radio_button);

        sideCarRadioGroup = findViewById(R.id.radio_group_side_car);
        vehicleRadioGroup = findViewById(R.id.radio_group_vehicle);

        sideCarYes = findViewById(R.id.side_car_yes_radio_button);
        sideCarNo = findViewById(R.id.side_car_no_radio_button);
        txtSideCar = findViewById(R.id.txt_side_car);

        carTypeText= findViewById(R.id.textcartype);
        carType = findViewById(R.id.car_type);

        textCarType = findViewById(R.id.txt_car_type);
        vehicleModel = findViewById(R.id.vehicle_model);


        //Car Type / car type
        carTypeText.setVisibility(View.GONE);
        carType.setVisibility(View.GONE);



        //Side Car / yes / no
        sideCarNo.setVisibility(View.GONE);
        sideCarYes.setVisibility(View.GONE);
        txtSideCar.setVisibility(View.GONE);

        //Employee type gain factor hide
        gainFactorInfoText.setVisibility(View.GONE);
        gainFactorNumber.setVisibility(View.GONE);



        motorBikeRadioButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                Log.d("ggg", "onCheckedChangedmotor: "+motorBikeRadioButton.isChecked());



                if( motorBikeRadioButton.isChecked() == true){

                    Log.d("ggg", "onCheckedChanged:motoricerde "+motorBikeRadioButton.isChecked());

                    sideCarYes.setVisibility(View.VISIBLE);
                    sideCarNo.setVisibility(View.VISIBLE);
                    txtSideCar.setVisibility(View.VISIBLE);

                    carType.setVisibility(View.GONE);
                    carTypeText.setVisibility(View.GONE);
                    //sideCarRadioGroup.setVisibility(View.VISIBLE);


                }





            }
        });


        carRadioButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                Log.d("ggg", "onCheckedChangedcar "+carRadioButton.isChecked());

                if(carRadioButton.isChecked()==true){
                    Log.d("ggg", "onCheckedChanged:caricerde "+carRadioButton.isChecked());
                    //sideCarRadioGroup.setVisibility(View.GONE);
                    //txtSideCar.setVisibility(View.GONE);
                    carType.setVisibility(View.VISIBLE);
                    carTypeText.setVisibility(View.VISIBLE);
                    sideCarYes.setVisibility(View.GONE);
                    sideCarNo.setVisibility(View.GONE);
                    txtSideCar.setVisibility(View.GONE);

            }




            }
        });




        spinner.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //Employee type gain factor hide
                gainFactorInfoText.setVisibility(View.VISIBLE);
                gainFactorNumber.setVisibility(View.VISIBLE);

            }
        });


    }
}
