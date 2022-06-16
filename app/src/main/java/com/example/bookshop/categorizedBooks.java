package com.example.bookshop;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class categorizedBooks extends ListActivity {

    static ArrayList<Book> newBooks = new ArrayList<Book>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = getIntent();
        int index = (int)intent.getExtras().get("index");

        for (int i = 0; i< Book.books.length;i++){
            Book b = Book.books[i];
            if(b.getCategory() == "Fantasy" && index == 0) newBooks.add(b);
            else if (b.getCategory() == "Education" && index == 1) newBooks.add(b);
            else if (b.getCategory() == "Other" && index ==2) newBooks.add(b);
        }

        ListView listBooks = getListView();
        ArrayAdapter<Book> listAdapter = new ArrayAdapter<Book>(this, android.R.layout.simple_list_item_1, newBooks);
        listBooks.setAdapter(listAdapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        String toastMsg = newBooks.get(position).toString();
        Toast.makeText(this, toastMsg,Toast.LENGTH_LONG);
    }
}