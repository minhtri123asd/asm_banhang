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
  private    EditText ed_hoten,ed_password;
  private    TextView tv_signup;
  String str_username ,str_password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed_hoten= findViewById(R.id.ed_hoten);
        ed_password = findViewById(R.id.ed_password);
        bt_login = findViewById(R.id.btn_login);
        tv_signup = findViewById(R.id.tv_signup);


        bt_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });

        tv_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3 = new Intent(LoginActivity.this,RegisterActivity.class);
                startActivity(i3);

            }
        });


    }

}

