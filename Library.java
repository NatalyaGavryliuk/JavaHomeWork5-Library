package com.pb.gavryliuk.hw5;

public class Library {
    public static void main(String[] args) {
        Reader reader1 = new Reader("Иванова Ольга Сергеевна", 625478, "механико-математический", "21.01.1991", "0661231231");
        Reader reader2 = new Reader("Петрова Мария Степановна", 635147, "исторический", "12.05.1987", "0673256984");
        Reader reader3 = new Reader("Сидорова Надежда Ивановна", 825987, "биологический", "08.12.1990", "0635556489");


        Book book1 = new Book("«Версаль»", "Элизабет Месси",2016);
        Book book2 = new Book("«Посылка для Анны»", "Миранда Дикинсон", 2016);
        Book book3 = new Book("«Вторая первая любовь всей моей жизни»", "Виктория Уолтерс", 2016);
        Book book4 = new Book("«Завтрак в постель»", "Сандра Браун", 2017);
        Book book5 = new Book("«Сніданок на снігу»", "Анатолій Дністровський", 2014);


        //Список книг
        System.out.println("\nКниги:");
        book1.printInfo();
        book2.printInfo();
        book3.printInfo();
        book4.printInfo();
        book5.printInfo();

        //Список читательниц
        System.out.println("\nЧитательницы:");
        reader1.printInfo();
        reader2.printInfo();
        reader3.printInfo();

        //Метод takeBook()
        System.out.println();
        reader1.takeBook(2); // взятие книг (в кол-ве)
        reader2.takeBook(book2.getName(), book4.getName(), book5.getName()); // взятие книг (их название)
        reader3.takeBook(book1, book3); // взятие книг (полная информация о книгах)

        //Метод returnBook()
        System.out.println();
        reader1.returnBook(2); // возврат книг (в кол-ве)
        reader2.returnBook(book2.getName(), book5.getName()); // возврат книг (их перечисление)
        reader3.returnBook(book1); // возврат книг (полная информация о книгах)

    }
}