package day6.bookstore.DAO;

import day6.bookstore.model.Author;
import day6.bookstore.model.Book;

import java.util.*;

public class BookDAOMem implements BookDAO{

    private Map<Integer, Book> books;

    public BookDAOMem() {
        this.books = new HashMap<>();
    }

    @Override
    public List<Book> getAllBooks() {
        return new ArrayList<>(books.values());
    }

    @Override
    public Book getBookById(int bookId) {
        return books.get(bookId);
    }

    @Override
    public List<Book> getBooksByAuthor(Author author) {
        List<Book> result = new ArrayList<>();
        for(Book b : getAllBooks()){
            if(b.getAuthor().equals(author)){
                result.add(b);
            }
        }
        return result;
    }

    @Override
    public List<Book> getBooksByTitle(String title) {
        List<Book> result = new ArrayList<>();
        for(Book b : getAllBooks()){
            if(b.getTitle().contains(title)){
                result.add(b);
            }
        }
        return result;
    }

    @Override
    public void addBook(Book book) {
        book.setBookId(generateId());
        books.put(book.getBookId(), book);
    }

    @Override
    public void removeBook(Book book) {
        removeBookById(book.getBookId());
    }

    @Override
    public void removeBookById(int bookId) {
        books.remove(bookId);
    }

    @Override
    public void modifyBook(int bookId, Book book) {
        if (books.containsKey(bookId)){
            book.setBookId(bookId);
            books.put(bookId, book);
        } else {
            throw new IllegalArgumentException("Nieprawidlowe ID");
        }


    }
    private int generateId(){
        Set<Integer> ids = new TreeSet<>(books.keySet());
        if (ids.isEmpty()) {
            return 1;
        }
        int result = 1;
        for (Integer i : ids) {
            if (i != result){
                return result;
            }
            result++;
        }
        return result;
    }
}
