package com.example.edungo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Main_Activity extends AppCompatActivity {
    private CardView btnIngresoauxiliar,btnIngresoDocente,btnIngresoEstudiante;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        btnIngresoauxiliar=(CardView)findViewById(R.id.IngresoAux);
        btnIngresoEstudiante=(CardView)findViewById(R.id.IngresoEstudiante);
        btnIngresoDocente=(CardView)findViewById(R.id.IngresoDocente);

        //Metodos Onclick que nos mandara a la ventana de login//

        btnIngresoauxiliar.setOnClickListener(new View.OnClickListener() {//ESTE BUTTON NOS MANDA AL LOGIN SI SOS AUXILIAR
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main_Activity.this,Login_Activity.class));


            }
        });


        btnIngresoEstudiante.setOnClickListener(new View.OnClickListener() {//ESTE BUTTON NOS MANDA AL LOGIN SI SOS ESTUDIANTE
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main_Activity.this,Login_Activity.class));
            }
        });

        btnIngresoDocente.setOnClickListener(new View.OnClickListener() {//ESTE BUTTON NOS MANDA AL LOGIN SI SOS UN DOCENTE
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main_Activity.this,Login_Activity.class));

            }
        });

    }

}
