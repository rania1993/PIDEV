/*package com.esprit.pi.pidev;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.esprit.pi.pidev.model.ResObj;
import com.esprit.pi.pidev.remote.ApiUtils;
import com.esprit.pi.pidev.remote.ServiceUser;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

EditText edEmail;
EditText edPassword;
Button btnLogin;
ServiceUser serviceUser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edEmail = (EditText) findViewById(R.id.edEmail);
        edPassword = (EditText) findViewById(R.id.edPassword);
        btnLogin = (Button) findViewById(R.id.btnLogin);
        serviceUser = ApiUtils.getServiceUser();

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = edEmail.getText().toString();
                String password = edPassword.getText().toString();
                //validate form
                if(validateLogin(email,password)){
                    //do login
                    DoLogin(email,password);
                }
            }
        });
    }
    private Boolean validateLogin(final String email,final String password){
        if(email==null || email.trim().length()==0){
            Toast.makeText(this, "email is required",Toast.LENGTH_SHORT).show();
            return false;
        }
        if(password==null || password.trim().length()==0){
            Toast.makeText(this, "password is required",Toast.LENGTH_SHORT).show();
            return false;
        }
        return  true;
    }
    private void DoLogin(final String email, String password){
        Call<ResObj> call=serviceUser.login(email,password);
        call.enqueue(new Callback<ResObj>() {
            @Override
            public void onResponse(Call<ResObj> call, Response<ResObj> response) {
                if (response.isSuccessful()) {
                    ResObj resObj = response.body();
                    if (resObj != null) {
                        //login start main activvity
                        Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                        intent.putExtra("email",email);

                        startActivity(intent);

                    }
                } else {
                    Toast.makeText(MainActivity.this, "the email or password is incorrect", Toast.LENGTH_SHORT).show();
                }
                Toast.makeText(MainActivity.this, "Error please try again", Toast.LENGTH_SHORT).show();

        }

            @Override
            public void onFailure(Call<ResObj> call, Throwable t) {
                Toast.makeText(MainActivity.this, t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}
*/