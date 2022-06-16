package com.example.bookshop;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class categories extends ListActivity {

    public static final String[] category = {"Fantasy","Education","Other"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ListView listCategories = getListView();
        ArrayAdapter listAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, category);
        listCategories.setAdapter(listAdapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        Intent intent = new Intent(this, categorizedBooks.class);
        intent.putExtra("index", position);
        startActivity(intent);
    }
}