import org.junit.Assert;
import org.junit.Test;

public class LibraryTest {
    
    @Test
    public void testLendBookToNonRegisteredStudent() {
        Library library = new Library();
        Book book = new Book("Book-1", "Author-1", 1);
        Student student = new Student("Student-1", 1);
        
        library.addBook(book);
        
        boolean result = library.lendBook(book, student);
        Assert.assertFalse("Should not lend book to non-registered student", result);
    }
}