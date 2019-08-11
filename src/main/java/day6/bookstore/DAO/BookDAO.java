package day6.bookstore.DAO;

import day6.bookstore.model.Author;
import day6.bookstore.model.Book;

import java.util.List;

public interface BookDAO {

    List<Book> getAllBooks();

    Book getBookById(int bookId);

    List<Book> getBooksByAuthor(Author author);

    List<Book> getBooksByTitle(String title);

    void addBook(Book book);
    void removeBook(Book book);
    void removeBookById(int bookId);

    void modifyBook(int bookId, Book book);

}


