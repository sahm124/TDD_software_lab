import classes.Library;
import classes.Book;
import classes.Student;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
}

