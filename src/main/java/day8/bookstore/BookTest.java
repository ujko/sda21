package day8.bookstore;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookTest {

    public static void main(String[] args) {
        BookDAO dao = new BookDAO();
//        print(dao);
//        System.out.println(dao.getBooksByTitle("pan"));
//        System.out.println(dao.getBooksBetweenPrice(1,20));
//        System.out.println(dao.sellBooks("Java",3));
//        print(dao);
        List<Book> books = dao.getAllBooks();
//        books.stream().sorted().forEach(System.out::println);
//        Comparator<Book> c = new Comparator<Book>() {
//            @Override
//            public int compare(Book o1, Book o2) {
//                return o1.getAmount() - o2.getAmount();
//            }
//        };

        books.stream()
                .sorted((c1,c2)->c1.getAmount()-c2.getAmount())
                .forEach(System.out::println);

//        books.stream()
//                .sorted(Comparator.comparingInt(x -> (int) (x.getPrice() * 100)))
//                .forEach(System.out::println);

//       dao.buyBooks("pan", 50);
//       books.forEach(System.out::println);

    }

    private static void print(BookDAO dao) {
        dao.getAllBooks().forEach(System.out::println);
    }
}
