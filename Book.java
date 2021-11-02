package com.pb.gavryliuk.hw5;

@SuppressWarnings("ALL")
public class Book {

    private String title;
    private String autor;
    private int year;

    public Book(String title, String autor, int year) {
        this.title = title;
        this.autor = autor;
        this.year = year;
    }

    public Book(String title, String autor){
        this.title = title;
        this.autor = autor;
    }

    public Book(){
    }

    public void setName(String title){
        this.title = title;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public void setYear(int year){
        this.year = year;
    }

    public String getName(){
        return title;
    }

    public String getAutor(){
        return autor;
    }

    public int getYear(){
        return year;
    }

    public String getInfo(){
        return title + ". " + autor + ", " + year + " г.";
    }

    public void printInfo() {
        System.out.println(title + ". " + autor + ", " + year + " г.");
    }
}