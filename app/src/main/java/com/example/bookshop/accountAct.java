package com.example.bookshop;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class accountAct extends AppCompatActivity {

    EditText editTextName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);

        editTextName = findViewById(R.id.editTextRename);
    }

    public void startMain(View view) {
        Intent intent = new Intent(this, homeAct.class);
        String name = editTextName.getText().toString();

        if (name.isEmpty()) {
            showAlert("Enter a Name to proceed!");
        }else {
            intent.putExtra("name", name);
            startActivity(intent);
        }
    }

    private void showAlert(String msg) {
        AlertDialog.Builder builder = new AlertDialog.Builder(accountAct.this);
        builder.setMessage(msg)
                .setNeutralButton("Ok",null);
        AlertDialog alert = builder.create();
        alert.show();
    }

    public void showCart(View view) {
        showAlert(cart.myCart.toString());
    }
}