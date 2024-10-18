package bg.tu_varna.sit.a2.f23621649;

public class Bookstore {
    Book[] books;

    Bookstore(){}

    Bookstore(Book[] books){
        this.books = books;
    }

    int getCountBooksByAuthor(String author){
        int count = 0;

        for (int i = 0; i < this.books.length ; i++) {
            if(books[i].author.equalsIgnoreCase(author)){
                count+= books[i].quantity;
            }
        }

        return count;
    }

    double getAverageBookPrice(){
        double price = 0;

        for (int i = 0; i < this.books.length; i++) {
            price += books[i].price;
        }

        return price / this.books.length;
    }
}
