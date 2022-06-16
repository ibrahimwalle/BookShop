package com.example.bookshop;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class homeAct extends AppCompatActivity {

    TextView welcomeTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        welcomeTextView = findViewById(R.id.welcomeTextView);
        Intent intent = getIntent();
        String name = intent.getExtras().get("name").toString();
        String welcome = "Welcome " + name;
        welcomeTextView.setText(welcome);
    }

    public void startShop(View view) {
        Intent shopInt = new Intent(this, shop.class);
        startActivity(shopInt);
    }

    public void startCate(View view) {
        Intent cateInt = new Intent(this, categories.class);
        startActivity(cateInt);
    }

    public void startAcc(View view) {
        Intent accInt = new Intent(this, accountAct.class);
        startActivity(accInt);
    }
}