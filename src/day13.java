import java.util.*;

abstract class Book {
    String title;
    String author;

    Book() {
        this.title = title;
        this.author = author;
    }

    abstract void display();
}

// Declare your class here. Do not use the 'public' access modifier.
// Declare the price instance variable

class MyBook extends Book{
    int price;
    String title;
    String author;

    MyBook(String title, String author, int price){
        super();
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    void display() {
        System.out.println("Title: "+ this.title);
        System.out.println("Author: "+ this.author);
        System.out.println("Price: "+ this.price);
    }
}

/**
 *   Class Constructor
 *
 *   @param title The book's title.
 *   @param author The book's author.
 *   @param price The book's price.
 **/
// Write your constructor here



/**
 *   Method Name: display
 *
 *   Print the title, author, and price in the specified format.
 **/
// Write your method here

// End class

public class day13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int price = scanner.nextInt();
        scanner.close();

        Book book = new MyBook(title, author, price);
        book.display();
    }
}