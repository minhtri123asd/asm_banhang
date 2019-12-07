package com.example.asm_sale.Screen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.asm_sale.R;
import com.github.nkzawa.emitter.Emitter;
import com.github.nkzawa.socketio.client.IO;
import com.github.nkzawa.socketio.client.Socket;

import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

public class RegisterActivity extends AppCompatActivity {
    private Button btn_create_account;
    private EditText ed_name, ed_pass,ed_cofirmpass,ed_mail;
    String urlAdd ="http://192.168.1.6/assignmentasn/insert.php";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ed_name = findViewById(R.id.ed_username_02);
        ed_mail = findViewById(R.id.ed_Email_01);
        ed_pass = findViewById(R.id.ed_password_02);
        ed_cofirmpass =findViewById(R.id.ed_confim_password);

        btn_create_account =findViewById(R.id.btn_creat);

        btn_create_account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            AddUser(urlAdd);
            }
        });
    }
    private void AddUser(String url){
        RequestQueue referenceQueue= Volley.newRequestQueue(RegisterActivity.this);
        StringRequest stringRequest = new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                if(response.trim().equals("success")){
                    Toast.makeText(RegisterActivity.this, "Add Success", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(RegisterActivity.this, LoginActivity.class));
                }else{
                    Toast.makeText(RegisterActivity.this, "Error", Toast.LENGTH_SHORT).show();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(RegisterActivity.this, "Xay ra loi", Toast.LENGTH_SHORT).show();
                Log.d( "onErrorResponse: ","loi" +error.toString());
            }
        }){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String ,String > params=    new HashMap<>();
                params.put("nameUSER",ed_name.getText().toString().trim());
                params.put("emailUSER",ed_mail.getText().toString().trim());
                params.put("passwordUSER",ed_pass.getText().toString().trim());

                return params;
            }
        };
        referenceQueue.add(stringRequest);


    }
}