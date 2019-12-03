package com.example.asm_sale.Screen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.asm_sale.R;
import com.github.nkzawa.emitter.Emitter;
import com.github.nkzawa.socketio.client.IO;
import com.github.nkzawa.socketio.client.Socket;

import java.net.URISyntaxException;

public class LoginActivity extends AppCompatActivity {
  private    Button bt_login;
  private    EditText ed_email,ed_password;
  private    TextView tv_create,tv_forgot;
    String str_username ,str_password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed_email= findViewById(R.id.ed_email);
        ed_password = findViewById(R.id.ed_password);
        bt_login = findViewById(R.id.bt_login);
        tv_create = findViewById(R.id.tv_create);
        tv_forgot = findViewById(R.id.tv_forgot);

        bt_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });

        tv_create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3 = new Intent(LoginActivity.this,RegisterActivity.class);
                startActivity(i3);

            }
        });

        tv_forgot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i4 = new Intent(LoginActivity.this,ProductsActivity.class);
                startActivity(i4);
            }
        });
    }
}

