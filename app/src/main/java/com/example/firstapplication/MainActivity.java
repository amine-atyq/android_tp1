package com.example.firstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bienvenueButton = findViewById(R.id.bienvenueButton);
        EditText nameEditText = findViewById(R.id.nameEditText);
        EditText firstNameEditText = findViewById(R.id.firstNameEditText);
        EditText ageEditText = findViewById(R.id.ageEditText);
        EditText txtBienvenue = findViewById(R.id.txtBienvenue);

        bienvenueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = nameEditText.getText().toString();
                String firstName = firstNameEditText.getText().toString();
                String age = ageEditText.getText().toString();
                String message = "Nom: " + name + ", Prénom: " + firstName + ", Âge: " + age;
                Toast.makeText(MainActivity.this, message, Toast.LENGTH_LONG).show();

                txtBienvenue.setText(message);
            }
        });


        Button filieresButton = findViewById(R.id.filieresButton);
        RadioGroup filiereRadioGroup = findViewById(R.id.filiereRadioGroup);

        filieresButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId = filiereRadioGroup.getCheckedRadioButtonId();
                RadioButton selectedRadioButton = findViewById(selectedId);
                String filiere = selectedRadioButton.getText().toString();
                Toast.makeText(MainActivity.this, "Filière: " + filiere, Toast.LENGTH_LONG).show();
            }
        });

        Button etatFamilialeButton = findViewById(R.id.etatFamilialeButton);
        CheckBox maritalStatusCheckBox = findViewById(R.id.maritalStatusCheckBox);

        etatFamilialeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String maritalStatus = maritalStatusCheckBox.isChecked() ? "Marié" : "Non Marié";
                Toast.makeText(MainActivity.this, "État Familial: " + maritalStatus, Toast.LENGTH_LONG).show();
            }
        });


    }
}
