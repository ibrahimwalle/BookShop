package com.example.bookshop;

import java.util.ArrayList;

public class cart {
    public static ArrayList<String> myCart = new ArrayList<String>();

    @Override
    public String toString() {
        String description="";
        if (myCart.isEmpty())
            return "Cart is Empty!";
        else{
            for (int i=0;i<myCart.size();i++){
                description = description + myCart.get(i);
            }
            return description;
        }
    }
}
