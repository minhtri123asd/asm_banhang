package com.example.asm_sale.Screen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.asm_sale.R;
import com.github.nkzawa.emitter.Emitter;
import com.github.nkzawa.socketio.client.IO;
import com.github.nkzawa.socketio.client.Socket;

import java.net.URISyntaxException;

public class RegisterActivity extends AppCompatActivity {
    private Button btn_create_account;
    private EditText ed_name, ed_mail, ed_pass,ed_cofirmpass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ed_name = findViewById(R.id.ed_username_02);
        ed_mail = findViewById(R.id.ed_Email_01);
        ed_pass = findViewById(R.id.ed_password_02);
        ed_cofirmpass =findViewById(R.id.ed_confim_password);

        btn_create_account =findViewById(R.id.bt_create_account);

        btn_create_account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}