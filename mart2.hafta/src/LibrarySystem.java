import java.util.List;
import java.util.ArrayList;

public class LibrarySystem {
    public static void main(String[] args) {
        Library library = new Library();

        Category fiction = new Category("Roman");
        Category science = new Category("Bilim");

        Book book1 = new Book("1984", "George Orwell", fiction);
        Book book2 = new Book("Sapiens", "Yuval Noah Harari", science);

        library.addBook(book1);
        library.addBook(book2);

        Student student1 = new Student("Ahmet");

        library.listBooks();
        student1.borrowBook(book1);
        library.listBooks();
        student1.returnBook(book1);
        library.listBooks();
    }
}