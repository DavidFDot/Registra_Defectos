package com.app.registra_defectos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.time.LocalDate;
import java.util.UUID;

public class MainActivity extends AppCompatActivity {

    UUID mIdDefecto;
    TextView mText1, mText2, mText3, mText4, mText5;
    Button mButton, mButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mIdDefecto = UUID.randomUUID();

        mText1 = findViewById(R.id.text1);
        mText2 = findViewById(R.id.text2);
        mText3 = findViewById(R.id.text3);
        mText4 = findViewById(R.id.text4);
        mText5 = findViewById(R.id.text5);

        mButton2 = findViewById(R.id.button2);
        java.util.Date date = new java.util.Date();
        mButton2.setText(date.toString());

        mButton = findViewById(R.id.button);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String query = "INSERT INTO defectos (IdDefecto, Modulo, TriggerDefecto, Impacto," +
                        " TipoDefecto, Cualificador, Fecha)" +
                        "VALUES ('" + mIdDefecto + "', '" + mText1 + "', '" + mText2 + "', '" + mText3 + "', '" +
                        mText4 + "', '" + mText5 + "', '" + date + "');";

                Toast toast = Toast.makeText(getApplicationContext(),
                        "Registro Enviado", Toast.LENGTH_LONG);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();
            }
        });
    }
}