package com.example.bookshop;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText editTextName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextName = findViewById(R.id.editTextname);
    }

    public void startMain(View view) {
        Intent intent = new Intent(this, homeAct.class);
        String name = editTextName.getText().toString();

        if (name.isEmpty()) {
            showAlert();
        }else {
            intent.putExtra("name", name);
            startActivity(intent);
        }
    }

    private void showAlert() {
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setMessage("Enter a Name to proceed!")
                .setNeutralButton("Ok",null);
        AlertDialog alert = builder.create();
        alert.show();
    }
}