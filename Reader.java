package com.pb.gavryliuk.hw5;

@SuppressWarnings("ALL")
public class Reader {
    private String fullName;
    private int bilet;
    private String faculty;
    private String DOB;
    private String telephone;

    // Конструкторы
    public Reader(String fullName, int bilet, String faculty, String DOB, String telephone) {
        this.fullName = fullName;
        this.bilet = bilet;
        this.faculty = faculty;
        this.DOB = DOB;
        this.telephone = telephone;
    }

    public Reader() {

    }

    // Информация о читательницах
    public void printInfo() {
        System.out.println("ФИО: " + fullName + "; номер читательского билета: " + bilet +
                "; факультет: " + faculty + "; дата рождения: " + DOB + "; телефон: " + telephone);
    }

    //Метод takeBook()
    public void takeBook(int q) {
        if (q < 1) {
            System.out.println(this.fullName + " не взяла книг.");
        } else {
            System.out.println(this.fullName + " взяла " + q + " книг.");
        }
    }

    public void takeBook(String... books) {
        StringBuilder strBuilder = new StringBuilder(this.fullName + " взяла книги: ");

        for (int i = 0; i < books.length; i++) {
            strBuilder.append(books[i]);
            if (i < books.length - 1) {
                strBuilder.append(", ");
            } else {
                strBuilder.append(".");
            }
        }
        System.out.println(strBuilder);
    }

    public void takeBook(Book... books) {
        StringBuilder strBuilder = new StringBuilder(this.fullName + " взяла книги: ");

        for (int i = 0; i < books.length; i++) {
            strBuilder.append(books[i].getInfo());
            if (i < books.length - 1) {
                strBuilder.append(", ");
            } else {
                strBuilder.append(".");
            }
        }
        System.out.println(strBuilder);
    }

    //Метод returnBook()
    public void returnBook(int q) {
        System.out.println(this.fullName + " вернула " + q + " книг.");
    }

    public void returnBook(String... books) {
        StringBuilder strBuilder = new StringBuilder(this.fullName + " вернула книги: ");

        for (int i = 0; i < books.length; i++) {
            strBuilder.append(books[i]);
            if (i < books.length - 1) {
                strBuilder.append(", ");
            } else {
                strBuilder.append(".");
            }
        }
        System.out.println(strBuilder);
    }

    public void returnBook(Book... books) {
        StringBuilder strBuilder = new StringBuilder(this.fullName + " вернула книги: ");

        for (int i = 0; i < books.length; i++) {
            strBuilder.append(books[i].getInfo());
            if (i < books.length - 1) {
                strBuilder.append(", ");
            } else {
                strBuilder.append(".");
            }
        }
        System.out.println(strBuilder);
    }
}