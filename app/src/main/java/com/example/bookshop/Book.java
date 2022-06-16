package com.example.bookshop;

public class Book {
    private final String title;
    private final String author;
    private final String category;
    private final double price;
    private final int imageResourceId;


    public static  final Book[] books ={
            new Book("The Lord of The Rings", "J.R.R Tolkien","Fantasy", 20, R.drawable.lotr),
            new Book("The Hobbit", "J.R.R Tolkien","Fantasy", 20, R.drawable.hobbit),
            new Book("Atomic Habits", "James Clear","Education", 30, R.drawable.atomic_habits),
            new Book("Oxford Dictionary","Angus Stevenson","Education", 40, R.drawable.oxford_dictionary),
            new Book("How to Draw 101 Animals", "Dan Green", "Education", 30, R.drawable.how_to_draw),
            new Book("Will", "Will Smith", "Other",40, R.drawable.will),
    };

    public Book(String title, String author, String category, double price, int imageResourceId) {
        this.title = title;
        this.author = author;
        this.category = category;
        this.price = price;
        this.imageResourceId = imageResourceId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    @Override
    public String toString() {
        return title + " by " + author;
    }
}
