package com.example.instagramlogin;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    EditText usernameInput, passwordInput;
    Button loginButton;

    String correctUsername = "admin";
    String correctPassword = "123";
    String name = "John Doe";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usernameInput = findViewById(R.id.usernameInput);
        passwordInput = findViewById(R.id.passwordInput);
        loginButton = findViewById(R.id.loginButton);

        loginButton.setOnClickListener(v -> {
            String username = usernameInput.getText().toString();
            String password = passwordInput.getText().toString();

            if (username.equals(correctUsername) && password.equals(correctPassword)) {
                Intent intent = new Intent(this, HomeActivity.class);
                intent.putExtra("name", name);
                startActivity(intent);
                finish(); // Close LoginActivity
            } else {
                Toast.makeText(LoginActivity.this, "Invalid username or password", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        // Clear fields when returning to LoginActivity
        usernameInput.setText("");
        passwordInput.setText("");
    }
}
