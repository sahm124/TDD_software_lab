import classes.Library;
import classes.Book;
import classes.SearchByType;
import classes.Student;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

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
    void testSearchStudentsById() {
        Library library = new Library();
        Student student1 = new Student("ali", 1);
        Student student2 = new Student("hasan", 2);
        Student student3 = new Student("javad", 3);
        library.addStudent(student1);
        library.addStudent(student2);
        library.addStudent(student3);

        ArrayList<Object> keys = new ArrayList<>();
        keys.add(1);
        keys.add(3);

        ArrayList<Student> foundStudents = library.searchStudents(SearchByType.ID, keys);

        assertEquals(2, foundStudents.size());
        assertTrue(foundStudents.contains(student1));
        assertTrue(foundStudents.contains(student3));
        assertFalse(foundStudents.contains(student2));
    }

    @Test
    void testSearchStudentsByUnsupportedType() {
        Library library = new Library();
        Student student1 = new Student("ali", 1);
        Student student2 = new Student("hasan", 2);
        Student student3 = new Student("javad", 3);
        library.addStudent(student1);
        library.addStudent(student2);
        library.addStudent(student3);

        ArrayList<Object> keys = new ArrayList<>();
        keys.add("chert");

        ArrayList<Student> foundStudents = library.searchStudents(SearchByType.TITLE, keys);

        assertNull(foundStudents);
    }

    @Test
    void testSearchBooksByTitle() {
        Library library = new Library();
        Book book1 = new Book("Book-1", "Author-1", 1);
        Book book2 = new Book("Book-2", "Author-2", 2);
        library.addBook(book1);
        library.addBook(book2);

        ArrayList<Object> keys = new ArrayList<>();
        keys.add("Book-1");

        ArrayList<Book> foundBooks = library.searchBooks(SearchByType.TITLE, keys);

        assertEquals(1, foundBooks.size());
        assertTrue(foundBooks.contains(book1));
        assertFalse(foundBooks.contains(book2));
    }
}

