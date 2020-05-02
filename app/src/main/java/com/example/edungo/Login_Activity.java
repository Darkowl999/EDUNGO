package com.example.edungo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Login_Activity extends AppCompatActivity {
    private TextView btnRegistrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_);

        btnRegistrar=(TextView)findViewById(R.id.btnRegistrate);

        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Login_Activity.this,Formulario.class);
                startActivity(intent);
            }
        });
    }
}
