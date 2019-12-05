package com.example.danhba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Add extends AppCompatActivity {
    Button btnAdd;
    EditText edName,edNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        setTitle("Add");
        btnAdd = findViewById(R.id.btnAdd);
        edName = findViewById(R.id.edName);
        edNumber = findViewById(R.id.edNumber);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputName = edName.getText().toString();
                String inputNumber = edNumber.getText().toString();
                Intent intent = new Intent(getBaseContext(),MainActivity.class);
                intent.putExtra("inputName",inputName);
                intent.putExtra("inputNumber",inputNumber);
                intent.putExtra("image",false);
                startActivity(intent);
            }
        });

    }
}
