package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnSendToServer = findViewById(R.id.btnSendToServer);
    Button btnSortMatNumber = findViewById(R.id.btnSortMatNumber);

    EditText etxtMatNumber = findViewById(R.id.etxtMatNumber);

    TextView txtvSortedMatNumber = findViewById(R.id.txtvSortedMatNumber);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSortMatNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String matNumber = "";
                int[] sortedMatNumber = new int[8];
                matNumber = etxtMatNumber.getText().toString();

                for(int i = 0; i < sortedMatNumber.length; i++){
                        sortedMatNumber[i] = Character.getNumericValue(matNumber.charAt(i));
                }


            }
        });
    }
}
