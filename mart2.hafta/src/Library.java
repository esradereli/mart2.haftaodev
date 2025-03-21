import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void listBooks() {
        System.out.println("Kütüphanedeki Kitaplar:");
        for (Book book : books) {
            System.out.println("- " + book.getTitle() + (book.isAvailable() ? " (Mevcut)" : " (Ödünç Alındı)"));
        }
    }
}