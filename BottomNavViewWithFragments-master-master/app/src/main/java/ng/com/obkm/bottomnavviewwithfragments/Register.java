package ng.com.obkm.bottomnavviewwithfragments;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.lang.ref.ReferenceQueue;
import java.util.HashMap;
import java.util.Map;

import ng.com.obkm.bottomnavviewwithfragments.home.LoginActivity;

public class Register extends AppCompatActivity {
    Button btnRegister;
    TextView tvBack;
    EditText ed_name,et_email,et_password;
    String urlAdd ="http://10.82.147.233/assignmentasn/insert.php";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        btnRegister=findViewById(R.id.btn_register);
        tvBack=findViewById(R.id.tvback);
        ed_name=findViewById(R.id.et_name);
        et_email=findViewById(R.id.et_email);
        et_password=findViewById(R.id.et_password);


        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name=ed_name.getText().toString().trim();
                String email=et_email.getText().toString().trim();
                String password=et_password.getText().toString().trim();

            if(name.isEmpty() || email.isEmpty() || password.isEmpty()){
                Toast.makeText(Register.this, "Vui long nhap du thong tin", Toast.LENGTH_SHORT).show();
            }
            else AddUser(urlAdd);
            }
        });


    }
    private void AddUser(String url){
    RequestQueue referenceQueue= Volley.newRequestQueue(Register.this);
        StringRequest stringRequest = new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                if(response.trim().equals("success")){
                    Toast.makeText(Register.this, "Add Success", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(Register.this, LoginActivity.class));
                }else{
                    Toast.makeText(Register.this, "Error", Toast.LENGTH_SHORT).show();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(Register.this, "Xay ra loi", Toast.LENGTH_SHORT).show();
                Log.d( "onErrorResponse: ","loi" +error.toString());
            }
        }){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String ,String > params=    new HashMap<>();
                params.put("nameUSER",ed_name.getText().toString().trim());
                params.put("emailUSER",et_email.getText().toString().trim());
                params.put("passwordUSER",et_password.getText().toString().trim());

                return params;
            }
        };
      referenceQueue.add(stringRequest);


    }
}
