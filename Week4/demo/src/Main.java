import com.luv2code.demo.Book;
import com.luv2code.demo.DVD;
import com.luv2code.demo.Library;
import com.luv2code.demo.Magazine;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Library library1 = new Library();

        Book book1 = new Book("C++", "Joe", LocalDate.of(2003, 3, 1), 200, "978-3-16-148410-0");
        DVD dvd1 = new DVD("The Matrix", "John", LocalDate.of(2003, 3, 1), 108000, "Spanish");
        Magazine magazine1 = new Magazine("National Geographic", "Various Editors", LocalDate.of(2003, 4, 2), 5);

        // addItems
        library1.addItem(book1);
        library1.addItem(dvd1);
        library1.addItem(magazine1);

        // Display All Items
        library1.displayAllItems();

        // updateItems
        Book book2 = new Book("C++", "Joe", LocalDate.of(2003, 3, 1), 200, "978-3-17-158420-1");
        Magazine magazine2 = new Magazine("National Geographic", "Various Editors", LocalDate.of(2003, 4, 2), 15);
        library1.updateItem(magazine2);
        library1.updateItem(book2);

        // Display All Items
        library1.displayAllItems();

    }
}