package day6.bookstore;

import day6.bookstore.DAO.BookDAO;
import day6.bookstore.DAO.BookDAOMem;
import day6.bookstore.model.Author;
import day6.bookstore.model.Book;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Pan Tadeusz", new Author("Adam", "Mickiewicz"));
        book1.setPrice(29.99);
        book1.setBookId(5878254);
        Book book2 = new Book("Ogniem i mieczem", new Author("Henryk", "Sienkiewicz"));
        book2.setPrice(40.90);
        book2.setBookId(8654225);
        Book book3 = new Book("Dziady w miesiac", new Author("Adam", "Mickiewicz"));
        book3.setPrice(25.60);
        book3.setBookId(4879999);

        BookDAO bookDAO = new BookDAOMem();
        bookDAO.addBook(book1);
        bookDAO.addBook(book2);
        bookDAO.addBook(book3);
        bookDAO.getAllBooks().forEach(System.out::println);

        System.out.println("************");

        bookDAO.getBooksByAuthor(new Author("Adam", "Mickiewicz")).forEach(System.out::println);
        Book booky = bookDAO.getBookById(4879999);
        System.out.println(booky);


        System.out.println(bookDAO.getBooksByTitle("mie"));

        System.out.println("************");

//        bookDAO.removeBookById(4879999);
//
//        bookDAO.getAllBooks().forEach(System.out::println);
//
        try {
            bookDAO.modifyBook(2, new Book(4879999, "Dziady w tydzien", 35.50, new Author("Adam", "Kowalski")));
        }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        bookDAO.removeBookById(2);
        bookDAO.getAllBooks().forEach(System.out::println);
        bookDAO.addBook(new Book("Harry Potter",null));
        bookDAO.getBookById(2).setPrice(3.55);
        bookDAO.getAllBooks().forEach(System.out::println);

    }
}
