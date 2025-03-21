public class Book {
    private String title;
    private String author;
    private Category category;
    private boolean isAvailable;

    public Book(String title, String author, Category category) {
        this.title = title;
        this.author = author;
        this.category = category;
        this.isAvailable = true;
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println(title + " ödünç alındı.");
        } else {
            System.out.println(title + " şu anda mevcut değil.");
        }
    }

    public void returnBook() {
        isAvailable = true;
        System.out.println(title + " iade edildi.");
    }
}
