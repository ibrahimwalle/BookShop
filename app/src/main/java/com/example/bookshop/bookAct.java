package com.example.bookshop;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class bookAct extends AppCompatActivity {

    ImageView imgView;
    TextView titleView, authorView, cateView, priceView;
    Spinner spin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);

        Intent intent = getIntent();
        int index = (int)intent.getExtras().get("index");
        Book book = Book.books[index];

        imgView = (ImageView) findViewById(R.id.artwork);
        titleView = (TextView) findViewById(R.id.title);
        authorView = (TextView) findViewById(R.id.author);
        cateView = (TextView) findViewById(R.id.category);
        priceView = (TextView) findViewById(R.id.price);

        imgView.setImageResource(book.getImageResourceId());
        titleView.setText(book.getTitle());
        authorView.setText(book.getAuthor());
        cateView.setText(book.getCategory());
        priceView.setText(String.valueOf(book.getPrice()));
    }

    public void addToCart(View view) {

        Intent intent = getIntent();
        int index = (int)intent.getExtras().get("index");
        Book book = Book.books[index];
        spin = findViewById(R.id.spinner);

        String toastMsg =book.getTitle()+" Added to Cart!"+"("+spin.getSelectedItem().toString()+")";
        Toast.makeText(this,toastMsg,Toast.LENGTH_LONG);

        for (int i = 0; i<Integer.parseInt(spin.getSelectedItem().toString());i++){
            cart.myCart.add(book.getTitle());
        }
    }
}