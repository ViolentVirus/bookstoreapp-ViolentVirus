package models;

import java.util.HashSet;
import java.util.Set;

public class Book {
    public Integer id;
    public String title;
    public Integer price;
    public String author;

    public Book(){

    }

    public Book(Integer id, String title, Integer price, String author){
        this.id = id;
        this.title = title;
        this.price = price;
        this.author = author;
    }

    private static Set<Book> books;
    static {
        books = new HashSet<>();
        books.add(new Book(1, "C++", 20, "ABC"));
        books.add(new Book(1, "Java", 20, "ABC"));
    }

    public static Set<Book> allBooks(){
        return books;
    }

    public static Book findById(Integer id){
        for (Book book : books){
            if(id.equals(book.id)){
                return book;
            }
        }
        return null;
    }

    public static void add(Book book){
        books.add(book);
    }

    public static boolean remove(Book book){
        return books.remove(book);
    }

    public int getId(){
        return this.id;
    }
    public int getPrice(){
        return this.price;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
