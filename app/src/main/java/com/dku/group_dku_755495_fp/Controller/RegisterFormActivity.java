package com.dku.group_dku_755495_fp.Controller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.dku.group_dku_755495_fp.Model.Car;
import com.dku.group_dku_755495_fp.Model.Employee;
import com.dku.group_dku_755495_fp.Model.Manager;
import com.dku.group_dku_755495_fp.Model.Motorcycle;
import com.dku.group_dku_755495_fp.Model.Programmer;
import com.dku.group_dku_755495_fp.Model.Tester;
import com.dku.group_dku_755495_fp.Model.Vehicle;
import com.dku.group_dku_755495_fp.R;

import java.util.ArrayList;
import java.util.List;

public class RegisterFormActivity extends AppCompatActivity {

    EditText firstName;
    EditText lastName;
    EditText birthYear;
    EditText monthlySalary;
    EditText occupationRate;
    EditText employeeId;
    EditText gainFactorNumber;
    EditText carType;
    EditText vehicleModel;
    EditText plateNumber;



    Spinner spinner;
    Spinner vehicleColor;

    TextView gainFactorInfoText;
    TextView carTypeText;
    TextView txtSideCar;
    TextView textCarType;


    RadioGroup sideCarRadioGroup;
    RadioGroup vehicleRadioGroup;
    RadioButton sideCarYes;
    RadioButton sideCarNo;

    RadioButton motorBikeRadioButton;
    RadioButton carRadioButton;

    Button button;

    Employee employee ;
    Vehicle vehicle;
    String selectedEmployeeType;



    List<String> employmentTypes = new ArrayList<>();
    List<String> colors = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_form);

        firstName = findViewById(R.id.first_name);
        lastName = findViewById(R.id.last_name);
        birthYear = findViewById(R.id.birth_year);
        monthlySalary = findViewById(R.id.monthly_salary);
        occupationRate = findViewById(R.id.occupation_rate);
        employeeId = findViewById(R.id.employee_id);
        plateNumber = findViewById(R.id.plate_number);

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

        vehicleColor = findViewById(R.id.spinner_vehicle_color);

        button = findViewById(R.id.register_button);

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


                    vehicle =  new Motorcycle();


                }





            }
        });


        carRadioButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                Log.d("ggg", "onCheckedChangedcar "+carRadioButton.isChecked());

                if(carRadioButton.isChecked()==true){

                    //sideCarRadioGroup.setVisibility(View.GONE);
                    //txtSideCar.setVisibility(View.GONE);
                    carType.setVisibility(View.VISIBLE);
                    carTypeText.setVisibility(View.VISIBLE);
                    sideCarYes.setVisibility(View.GONE);
                    sideCarNo.setVisibility(View.GONE);
                    txtSideCar.setVisibility(View.GONE);


                    vehicle =  new Car();

            }




            }
        });
        employmentTypes.add("Choose a type");
        employmentTypes.add("Manager");
        employmentTypes.add("Tester");
        employmentTypes.add("Programmer");

        ArrayAdapter adapter = new ArrayAdapter<>(this,R.layout.support_simple_spinner_dropdown_item, employmentTypes);
        spinner.setAdapter(adapter);



        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {


                if(!spinner.getSelectedItem().equals("Choose a type")){



                    //Employee type gain factor hide
                    gainFactorInfoText.setVisibility(View.VISIBLE);
                    gainFactorNumber.setVisibility(View.VISIBLE);




                        switch(spinner.getSelectedItem().toString()) {
                            case "Manager":
                                gainFactorInfoText.setText("# clients");
                                selectedEmployeeType = "Manager";
                                break;
                            case "Tester":
                                gainFactorInfoText.setText("# bugs");
                                selectedEmployeeType = "Tester";
                                break;
                            case "Programmer":
                                gainFactorInfoText.setText("# projects");
                                selectedEmployeeType = "Programmer";
                                break;
                            default:
                                gainFactorInfoText.setText("# ");
                        }

                    }
                }




            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        colors.add("Choose a color");
        colors.add("Red");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Green");
        colors.add("Orange");
        colors.add("Purple");
        colors.add("Pink");
        colors.add("Brown");
        colors.add("White");
        colors.add("Black");
        colors.add("Beige");

        ArrayAdapter colorAdapter = new ArrayAdapter<>(this,R.layout.support_simple_spinner_dropdown_item, colors);
        vehicleColor.setAdapter(colorAdapter);


        vehicleColor.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                if(carRadioButton.isChecked()){
//                    Log.d("ggg", "onItemSelected: car"+((Car)vehicle).getType());
//                }
//                if(motorBikeRadioButton.isChecked()){
//                    Log.d("ggg", "onItemSelected: moto"+((Motorcycle)vehicle).isHasSidecar());
//                }

                double rateOfOccupation = 100;


                //Field Check...
             if(!firstName.getText().toString().equals("") && !lastName.getText().toString().equals("") && !birthYear.getText().toString().equals("") && !monthlySalary.getText().toString().equals("")  && !employeeId.getText().toString().equals("") && !spinner.getSelectedItem().toString().equals("Choose a type") && (carRadioButton.isChecked() || motorBikeRadioButton.isChecked()) && !vehicleModel.getText().toString().equals("") && !plateNumber.getText().toString().equals("") && !vehicleColor.getSelectedItem().toString().equals("Choose a color") && !gainFactorNumber.getText().toString().equals("")){

                        if( (carRadioButton.isChecked() && !carType.getText().toString().equals(""))   || (motorBikeRadioButton.isChecked() &&  (sideCarNo.isChecked() || sideCarYes.isChecked()))){

                            if(!occupationRate.getText().toString().equals("")){
                                double temp = Integer.parseInt(occupationRate.getText().toString());

                                if(temp <= 10){
                                    rateOfOccupation = 10;
                                }

                                if(temp >10 || temp <=100){
                                    rateOfOccupation = temp ;
                                }

                                if(temp > 100){
                                    rateOfOccupation = 100;
                                }
                            }



                            switch(selectedEmployeeType) {
                                case "Manager":
                                    employee = new Manager(firstName.getText()+" "+lastName.getText() , Integer.parseInt(birthYear.getText().toString()), Double.parseDouble(monthlySalary.getText().toString()),rateOfOccupation , vehicle , Double.parseDouble(gainFactorNumber.getText().toString()) , employeeId.getText().toString());
                                    break;
                                case "Tester":
                                    employee = new Tester(firstName.getText()+" "+lastName.getText() , Integer.parseInt(birthYear.getText().toString()), Double.parseDouble(monthlySalary.getText().toString()),rateOfOccupation , vehicle , Double.parseDouble(gainFactorNumber.getText().toString()) , employeeId.getText().toString());
                                    break;
                                case "Programmer":
                                    employee = new Programmer(firstName.getText()+" "+lastName.getText() , Integer.parseInt(birthYear.getText().toString()), Double.parseDouble(monthlySalary.getText().toString()),rateOfOccupation , vehicle , Double.parseDouble(gainFactorNumber.getText().toString()) , employeeId.getText().toString());
                                    break;
                                default:

                            }

                            Employee.employeeList.add(employee);

                        }

                }


             else {
                 Toast.makeText(RegisterFormActivity.this , "Please check the fields" , Toast.LENGTH_SHORT).show();
             }



            }
        });


    }
}
