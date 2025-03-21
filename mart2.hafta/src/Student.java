public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public void borrowBook(Book book) {
        book.borrowBook();
    }

    public void returnBook(Book book) {
        book.returnBook();
    }
}
