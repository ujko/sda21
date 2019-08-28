package day8.bookstore;

import java.util.*;
import java.util.stream.Collectors;

public class BookDAO {
    private Map<Integer, Book> bookMap;

    public BookDAO() {
        bookMap = new HashMap<>();
        addBook(new Book("Pan Tadeusz")
                .setAmount(1)
                .setAuthor(new Author("Adam Mickiewicz"))
                .setPrice(12.50));
        addBook(new Book("Potop")
                .setAmount(1)
                .setAuthor(new Author("Henryk Sienkiewicz"))
                .setPrice(12.40));
        addBook(new Book("Java dla potop opornych")
                .setAmount(4)
                .setAuthor(new Author("Jan Nowak"))
                .setPrice(8.23));
        addBook(new Book("Python")
                .setAmount(12)
                .setAuthor(new Author("Krystian Kowalski"))
                .setPrice(55.60));
        addBook(new Book("Web development")
                .setAmount(77)
                .setAuthor(new Author("Krystian Kapiszon"))
                .setPrice(55.66));
    }

    public void buyBooks(Book book, int amountToBuy) {
        Book b = bookMap.get(book.getBookId());
        b.setAmount(b.getAmount() + amountToBuy);
    }

    public void buyBooks(String title, int amountToBuy) {
        Book book = bookMap.values()
                .stream()
                .filter((b)->b.getTitle().toLowerCase().contains(title.toLowerCase()))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
        book.setAmount(book.getAmount() + amountToBuy);
    }

    public Book sellBooks(String title, int amountToSell) {
        Optional<Book> optionalBook = bookMap.values()
                .stream()
                .filter((b) -> b.getTitle().toLowerCase().contains(title.toLowerCase()))
                .filter((b) -> b.getAmount() >= amountToSell)
                .findFirst();
        Book book;
        if (optionalBook.isPresent()) {
            book = optionalBook.get();
            book.setAmount(book.getAmount() - amountToSell);
        } else {
            throw new IllegalArgumentException("Nie mozna sprzedac tylu ksiazek lub ksiazka nieznaleziona");
        }
        return book;
    }

    public void addBook(Book book) {
        book.setBookId(generateId());
        bookMap.put(book.getBookId(), book);
    }

    public void removeBook(int id) {
        bookMap.remove(id);
    }

    public void removeBook(Book book) {
        removeBook(book.getBookId());
    }

    public Book getBookById(int id) {
        return bookMap.get(id);
    }

    public List<Book> getBooksByTitle(String title) {
        return bookMap
                .values()
                .stream()
                .filter((b) -> b.getTitle().toLowerCase().contains(title.toLowerCase()))
                .collect(Collectors.toList());
    }

    public List<Book> getBooksBetweenPrice(double minPrice, double maxPrice) {
        return bookMap
                .values()
                .stream()
                .filter((b) -> b.getPrice() > minPrice)
                .filter((b) -> b.getPrice() < maxPrice)
                .collect(Collectors.toList());
    }

    public List<Book> getAllBooks() {
        return new ArrayList<>(bookMap.values());
    }

    private int generateId() {
        return bookMap
                .keySet()
                .stream()
                .mapToInt(x -> x)
                .max()
                .orElse(0) + 1;
    }
}
