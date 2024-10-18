package bg.tu_varna.sit.a2.f23621649;

public class test {
    public static void main(String[] args) {
        Book book = new Book("New", "author name", 10, 5.5);
        Book book1 = new Book("New1", "author name1", 15, 8.2);
        Book book2 = new Book("New2", "author name1", 7, 9);
        Book book3 = new Book("New3", "author name", 9, 10);
        Book book4 = new Book("New4", "author name2", 12, 6);

        System.out.println(book1.equal(book2));
        Book[] books = new Book[] {book, book1, book2, book3, book4};
        Bookstore bookstore = new Bookstore(books);
        System.out.println(bookstore.getCountBooksByAuthor("author name1"));
        System.out.println(bookstore.getAverageBookPrice());

    }
}
