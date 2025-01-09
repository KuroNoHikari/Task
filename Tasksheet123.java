import java.util.*;
import java.lang.*;

class Book{
    private String bookTitle;
    private String bookAuthor;
    private int bookYear;
    private Double bookPrice;
    public Book(String bookTitle, String bookAuthor, int bookYear, Double bookPrice){
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookYear = bookYear;
        this.bookPrice = bookPrice;
    }
    @Override
    public String toString(){
        return "Title: \"" + bookTitle + "\"\n" +
                "Author: \"" + bookAuthor + "\"\n" +
                "Year Published: " + bookYear + "\n" +
                "Price: $" + bookPrice + "\n";
    }
}
public class Tasksheet123 {
    public static void main(String[] args) {
        Book book1 = new Book("Java Programming", "John Smith", 2021, 39.99);
        Book book2 = new Book("Python Basics","Jane Doe",2020,29.99);
        Book book3 = new Book("C++ Essentials", "Michael Johnson", 2019, 49.99);

        System.out.println("Book 1:");
        System.out.println(book1);

        System.out.println("Book 2:");
        System.out.println(book2);


        System.out.println("Book 3:");
        System.out.println(book3);
    }
}

