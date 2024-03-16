import classes.Library;
import classes.Book;
import classes.SearchByType;
import classes.Student;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {

    @Test
    public void testLendBookToNonRegisteredStudent() {
        Library library = new Library();
        Book book = new Book("Book-1", "Author-1", 1);
        Student student = new Student("Student-1", 1);

        library.addBook(book);

        boolean result = library.lendBook(book, student);
        assertFalse(result, "Should not lend book to non-registered student");
    }

    @Test
    public void testReturnBookRemovesBookFromStudent() {
        Library library = new Library();
        Student student = new Student("Ali", 10);
        Book book = new Book("Book-1", "Author-1", 1);
        library.addStudent(student);
        library.addBook(book);
        library.lendBook(book, student);

        assertTrue(student.hasBook(book));

        library.returnBook(book, student);

        assertFalse(student.hasBook(book));
    }

    @Test
    public void testSearchBooksById() {
        // Create some sample books
        ArrayList<Book> books = new ArrayList<>(Arrays.asList(
                new Book("The Lord of the Rings", "J.R.R. Tolkien" , 1),
                new Book("Pride and Prejudice", "Jane Austen", 2),
                new Book("The Hitchhiker's Guide to the Galaxy", "Douglas Adams", 3)));

        // Search by ID
        ArrayList<Object> keys = new ArrayList<>(Arrays.asList(2)); // Search for book with ID 2
        ArrayList<Book> expectedBooks = new ArrayList<>(Arrays.asList(
                new Book("Pride and Prejudice", "Jane Austen", 2)
        ));

        ArrayList<Book> actualBooks = new Library().searchBooks(SearchByType.ID, keys);

        assertEquals(expectedBooks, actualBooks);
    }
}

