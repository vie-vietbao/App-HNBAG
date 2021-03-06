package com.example.demoapphnbag2.Login;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.demoapphnbag2.BeginApp.Begin;
import com.example.demoapphnbag2.ListAdapterSettingAccount;
import com.example.demoapphnbag2.MainActivity;
import com.example.demoapphnbag2.R;
import com.example.demoapphnbag2.SettingOption.SettingActivity;
import com.example.demoapphnbag2.SettingOption.SettingLogin;
import com.example.demoapphnbag2.SettingOption.SettingRegister;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class SignUp extends AppCompatActivity {

    private EditText edtGmail, edtName, edtPassword, edtRePass;
    private Button btnSignUp, btnLogin;
    private ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        progressDialog = new ProgressDialog(this);

        edtGmail = findViewById(R.id.edtGmail);
        edtName = findViewById(R.id.edtName);
        edtPassword = findViewById(R.id.edtPassword);
        edtRePass = findViewById(R.id.edtRePass);
        btnSignUp = findViewById(R.id.btnSignUp);
        btnLogin = findViewById(R.id.btnLogin);


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignUp.this, Login.class);
                startActivity(intent);
            }
        });

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickSignUp();
            }
        });
    }
    private void onClickSignUp(){
        String strEmail = edtGmail.getText().toString().trim();
        String strPassword = edtPassword.getText().toString().trim();
        String strRePass = edtRePass.getText().toString();
        FirebaseAuth auth = FirebaseAuth.getInstance();


        if (TextUtils.isEmpty(strEmail)){
            edtGmail.setError("Email l?? b???t bu???c");
            return;
        }
        if (TextUtils.isEmpty(strPassword)){
            edtPassword.setError("M???t kh???u l?? b???t bu???c");
            return;
        }

        if (strPassword.length() < 6){
            edtPassword.setError("M???t kh???u ph???i c?? ??t nh???t 6 k?? t???");
            return;
        }

        if (TextUtils.isEmpty(strRePass)){
            edtRePass.setError("M???t kh???u l?? b???t bu???c");
            return;
        }

        if (!strPassword.equals(strRePass)){
            edtRePass.setError("M???t kh???u kh??ng tr??ng kh???p");
            return;
        }

        progressDialog.show();

        auth.createUserWithEmailAndPassword(strEmail, strPassword)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        progressDialog.dismiss();
                        if (task.isSuccessful()) {
                            Toast.makeText(SignUp.this, "????ng k?? t??i kho???n th??nh c??ng",  Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(SignUp.this, Login.class);
                            startActivity(intent);

                        } else {
                            Toast.makeText(SignUp.this, "????ng k?? t??i kho???n kh??ng th??nh c??ng. Vui l??ng th??? l???i" , Toast.LENGTH_SHORT).show();
                        }
                    }
                });
    }
}