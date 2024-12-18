package librarysystem;

	import java.util.*;

	class Book {
	    private String bookId;
	    private String title;
	    private String author;
	    private boolean isAvailable;

	    public Book(String bookId, String title, String author) {
	        this.bookId = bookId;
	        this.title = title;
	        this.author = author;
	        this.isAvailable = true;
	    }

	    public String getBookId() {
	        return bookId;
	    }

	    public String getTitle() {
	        return title;
	    }

	    public String getAuthor() {
	        return author;
	    }

	    public boolean isAvailable() {
	        return isAvailable;
	    }

	    public void setAvailability(boolean isAvailable) {
	        this.isAvailable = isAvailable;
	    }
	}

	class Student {
	    private String studentId;
	    private String name;

	    public Student(String studentId, String name) {
	        this.studentId = studentId;
	        this.name = name;
	    }

	    public String getStudentId() {
	        return studentId;
	    }

	    public String getName() {
	        return name;
	    }
	}

	class Library {
	    private List<Book> books;
	    private List<Student> students;
	    private Map<String, String> issuedBooks; // Map to store issued books (studentId, bookId)

	    public Library() {
	        books = new ArrayList<>();
	        students = new ArrayList<>();
	        issuedBooks = new HashMap<>();
	    }

	    public void addBook(Book book) {
	        books.add(book);
	    }

	    public void removeBook(String bookId) {
	        books.removeIf(book -> book.getBookId().equals(bookId));
	    }

	    public void addStudent(Student student) {
	        students.add(student);
	    }

	    public void issueBook(String studentId, String bookId) {
	        Book book = findBookById(bookId);
	        if (book != null && book.isAvailable() && findStudentById(studentId) != null) {
	            book.setAvailability(false);
	            issuedBooks.put(studentId, bookId);
	            System.out.println("Book issued successfully to " + studentId);
	        } else {
	            System.out.println("Book issuance failed. Please check book availability or student details.");
	        }
	    }

	    public void returnBook(String studentId) {
	        String bookId = issuedBooks.get(studentId);
	        if (bookId != null) {
	            Book book = findBookById(bookId);
	            if (book != null) {
	                book.setAvailability(true);
	                issuedBooks.remove(studentId);
	                System.out.println("Book returned successfully.");
	            } else {
	                System.out.println("Book not found.");
	            }
	        } else {
	            System.out.println("No book issued to this student.");
	        }
	    }

	    public void displayAvailableBooks() {
	        System.out.println("Available Books:");
	        for (Book book : books) {
	            if (book.isAvailable()) {
	                System.out.println("Book ID: " + book.getBookId() + ", Title: " + book.getTitle() + ", Author: " + book.getAuthor());
	            }
	        }
	    }

	    private Book findBookById(String bookId) {
	        for (Book book : books) {
	            if (book.getBookId().equals(bookId)) {
	                return book;
	            }
	        }
	        return null;
	    }

	    private Student findStudentById(String studentId) {
	        for (Student student : students) {
	            if (student.getStudentId().equals(studentId)) {
	                return student;
	            }
	        }
	        return null;
	    }
	}

	