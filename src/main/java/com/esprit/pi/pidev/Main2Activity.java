/*package com.esprit.pi.pidev;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {


    TextView txtEmail;
    TextView txtfirstname;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

    txtEmail=(TextView) findViewById(R.id.txtEmail);
        txtfirstname= (TextView) findViewById(R.id.txtfirstname);
        Bundle extras = getIntent().getExtras();
        String email;
        if(extras != null) {
            email = extras.getString("email");
            txtEmail.setText(email);
            String firstname = extras.getString("firstname");
            txtfirstname.setText(firstname);
        }
    }
}
*/