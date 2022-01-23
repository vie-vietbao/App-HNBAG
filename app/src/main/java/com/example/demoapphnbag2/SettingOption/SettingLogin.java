package com.example.demoapphnbag2.SettingOption;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.demoapphnbag2.Login.Login;
import com.example.demoapphnbag2.Login.SignUp;
import com.example.demoapphnbag2.MainActivity;
import com.example.demoapphnbag2.R;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.SignInButton;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.GoogleAuthProvider;

public class SettingLogin extends AppCompatActivity {

    public static final int GOOGLE_SIGN_IN_CODE = 1000;
    LinearLayout lnlEmail, lnlFacebook, lnlGuest, lnlGoogle;
    GoogleSignInOptions gso;
    GoogleSignInClient signInClient;
    FirebaseAuth auth;

    ImageView imgBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting_login);

        imgBack = findViewById(R.id.imgBack);

        imgBack.setOnClickListener(v -> onBackPressed());

        findViewById(R.id.lnlSignup).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SettingLogin.this, SignUp.class);
                startActivity(intent);
            }
        });

        lnlEmail = findViewById(R.id.lnlEmail);
        lnlGuest = findViewById(R.id.lnlGuest);
        lnlFacebook = findViewById(R.id.lnlFacebook);

        lnlEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SettingLogin.this, "Xin lỗi! Phiên bản hiện tại chưa hỗ trợ tính năng này", Toast.LENGTH_SHORT).show();
            }
        });

        lnlGuest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SettingLogin.this, Login.class);
                startActivity(intent);
            }
        });

        lnlFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SettingLogin.this, "Xin lỗi! Phiên bản hiện tại chưa hỗ trợ tính năng này", Toast.LENGTH_SHORT).show();
            }
        });

        lnlGoogle = findViewById(R.id.lnlGoogle);

//        auth = FirebaseAuth.getInstance();

        gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
//                .requestIdToken("135311622379-4krtv0hkonruv4cl38jb7ja075h939c0.apps.googleusercontent.com")
                .requestEmail()
                .build();

        signInClient = GoogleSignIn.getClient(this, gso);

//        GoogleSignInAccount signInAccount = GoogleSignIn.getLastSignedInAccount(this);
//        if (signInAccount != null ){
//            Toast.makeText(this, "Bạn đã đăng nhập thành công", Toast.LENGTH_SHORT).show();
////            startActivity(new Intent(this, MainActivity.class));
//        }

        lnlGoogle.setOnClickListener(v -> {
            Intent sign = signInClient.getSignInIntent();
            startActivityForResult(sign, 1000);
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 1000){
            Task<GoogleSignInAccount> signInTask = GoogleSignIn.getSignedInAccountFromIntent(data);

            try {
                signInTask.getResult(ApiException.class);
                Toast.makeText(this, "Okla", Toast.LENGTH_SHORT).show();

//                AuthCredential authCredential = GoogleAuthProvider.getCredential(signInAcc.getIdToken(), null);
//
//                auth.signInWithCredential(authCredential).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
//                    @Override
//                    public void onComplete(@NonNull Task<AuthResult> task) {
//                        Toast.makeText(getApplicationContext(), "Okla", Toast.LENGTH_SHORT).show();
//                        startActivity(new Intent(getApplicationContext(), MainActivity.class));
//                    }
//                }).addOnFailureListener(new OnFailureListener() {
//                    @Override
//                    public void onFailure(@NonNull Exception e) {
//                    }
//                });

            } catch (ApiException e) {
                Toast.makeText(getApplicationContext(),"Error" , Toast.LENGTH_SHORT).show();
            }
        }

    }

}