package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {

    EditText user, pass;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user = findViewById(R.id.user);
        pass = findViewById(R.id.pass);
        login = findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (user.getText().toString().equals("admin") && pass.getText().toString().equals("admin")) {
                    startActivity(new Intent(MainActivity.this, activity_wellcome.class));
                    Toast.makeText(getApplicationContext(), "Username dan Password benar Anda berhasil Login", Toast.LENGTH_SHORT).show();

                    //finish();
                } else {
                    Toast.makeText(getApplicationContext(), "Username dan Pssword tidak sesuai Anda gagal Login", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}