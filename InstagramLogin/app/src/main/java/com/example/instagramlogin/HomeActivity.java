package com.example.instagramlogin;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    TextView nameText;
    Button closeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);  // Create this layout

        nameText = findViewById(R.id.nameText);
        closeButton = findViewById(R.id.closeButton);

        // Get name from intent
        String name = getIntent().getStringExtra("name");
        nameText.setText("Welcome, " + name + "!");

        closeButton.setOnClickListener(v -> finishAffinity()); // Finish all activities
    }
}
