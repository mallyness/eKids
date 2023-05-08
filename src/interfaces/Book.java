package interfaces;

public class Book implements Printable {
    private final String title;
    private final String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void print() {
        System.out.println("Book: " + title + " by " + author);
    }
}

