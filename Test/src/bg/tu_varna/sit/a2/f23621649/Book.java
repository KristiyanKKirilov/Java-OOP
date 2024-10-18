package bg.tu_varna.sit.a2.f23621649;

public class Book {
    String title;
    String author;
    int quantity;
    double price;

    Book(){}

    Book(String title, String author, int quantity, double price){
        this.title = title;
        this.author = author;
        this.quantity = quantity;
        this.price = price;
    }

    String getAuthor(){
        return this.author;
    }

    int getQuantity(){
        return this.quantity;
    }

    double getPrice(){
        return this.price;
    }

    boolean equal(Book object){
        return this.author.equalsIgnoreCase(object.author);
    }
}
