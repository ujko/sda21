package day8.bookstore;

public class Book implements Comparable<Book> {
    private int bookId;
    private String title;
    private Author author;
    private double price;
    private int amount;

    public Book(String title) {
        this.title = title;
    }

    public Book setBookId(int bookId) {
        this.bookId = bookId;
        return this;
    }

    public Book setAuthor(Author author) {
        this.author = author;
        return this;
    }

    public Book setPrice(double price) {
        this.price = price;
        return this;
    }

    public Book setAmount(int amount) {
        this.amount = amount;
        return this;
    }

    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", title='" + title + '\'' +
                ", author=" + author +
                ", price=" + price +
                ", amount=" + amount +
                '}';
    }

    @Override
    public int compareTo(Book o) {
        return this.title.compareToIgnoreCase(o.getTitle());
    }
}
