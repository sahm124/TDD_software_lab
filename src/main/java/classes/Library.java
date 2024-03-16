package classes;


import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private ArrayList<Student> students;

    public Library() {
        books = new ArrayList<>();
        students = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    /**
     * Lends a book to a student. Removes the book from the library and adds it to the student's list.
     * This operation fails if the library doesn't have the student or the book or the student already has the book.
     *
     * @param book    The book to be lent.
     * @param student The student who is going to borrow the book.
     * @return        Returns true if the operation is successful and false otherwise.
     */
    public boolean lendBook(Book book, Student student) {
        if (!this.books.contains(book)) {
            System.out.println("!! Book " + book.getTitle() + " not registered.");
            return false;
        }
        if (student.hasBook(book)) {
            System.out.println("!! Student already has the book.");
            return false;
        }
        if (!this.students.contains(student)) {
            System.out.println("!! Student " + student.getName() + " not registered.");
            return false;
        }

        this.books.remove(book);
        student.addBook(book);
        System.out.println(book.getTitle() + " lent to " + student.getName() + ".");
        return true;
    }

    /**
     * The student returns the book to the library. Removes the book from the student's list and adds it to the library.
     * This operation fails if the library doesn't have the student or the student doesn't have the book.
     *
     * @param book    The book to be returned.
     * @param student The student who is going to return the book.
     * @return Returns true if the operation is successful and false otherwise.
     */
    public boolean returnBook(Book book, Student student) {
        if (!this.students.contains(student)) {
            System.out.println("!! Student " + student.getName() + " not registered.");
            return false;
        }
        if (student.hasBook(book)) {
            this.books.add(book);
            student.removeBook(book);
            System.out.println(student.getName() + " returned " + book.getTitle() + ".");
            return true;
        }

        System.out.println("!! " + student.getName() + " doesn't have the book.");
        return false;
    }

    /**
     * Returns a list of students where the specified field matches any of the keys provided.
     * The specified field is determined by the searchByType argument, which can be id or name (but not title or author).
     *
     * @param searchByType Specifies the field used for searching (id, name).
     * @param keys         The list of keys to search for.
     * @return             The list of students that match the search criteria. Returns null if search type is title or author.
     */
    public ArrayList<Student> searchStudents(SearchByType searchByType, ArrayList<Object> keys) {
        ArrayList<Student> matchingStudents = new ArrayList<>();


        if (searchByType == SearchByType.TITLE || searchByType == SearchByType.AUTHOR) {
            return null; 
        }

        for (Student student : this.students) {
            Object studentFieldValue = getFieldValue(student, searchByType);

            if (keys.contains(studentFieldValue)) {
                matchingStudents.add(student);
            }
        }

        return matchingStudents;
    }

    /**
     * Returns a list of books where the specified field matches any of the keys provided.
     * The specified field is determined by the searchByType argument, which can be id, title, or author (but not name).
     *
     * @param searchByType Specifies the field used for searching (id, title, or author).
     * @param keys         The list of keys to search for.
     * @return             The list of books that match the search criteria. Returns null if search type is name.
     */
    public ArrayList<Book> searchBooks(SearchByType searchByType, ArrayList<Object> keys) {
        ArrayList<Book> matchingBooks = new ArrayList<>();
    
        if (searchByType == SearchByType.NAME) {
            return null; 
        }
    
        for (Book book : this.books) {
            Object bookFieldValue = getFieldValue(book, searchByType);
 
            if (keys.contains(bookFieldValue)) {
                matchingBooks.add(book);
            }
        }
    
        return matchingBooks;
    }

    // Helper method to get the value of the specified field from a student or book
    private Object getFieldValue(Object obj, SearchByType searchByType) {
        if (obj instanceof Student) {
            Student student = (Student) obj;
            switch (searchByType) {
                case ID:
                    return student.getId();
                case NAME:
                    return student.getName();
                default:
                    return null;
            }
        } else if (obj instanceof Book) {
            Book book = (Book) obj;
            switch (searchByType) {
                case ID:
                    return book.getId();
                case TITLE:
                    return book.getTitle();
                case AUTHOR:
                    return book.getAuthor();
                default:
                    return null;
            }
        } else {
            // Handel error
            throw new IllegalArgumentException("Unsupported object type for search");
        }
    }

    /**
     * Displays the books of library.
     */
    public void displayBooks() {
        System.out.println("Available books in library:");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    /**
     * Displays the students registered in the library.
     */
    public void displayStudents() {
        System.out.println("Registered students:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}