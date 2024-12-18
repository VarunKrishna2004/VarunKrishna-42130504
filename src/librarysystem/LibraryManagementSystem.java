package librarysystem;

import java.util.Scanner;

public class LibraryManagementSystem {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Library library = new Library();

	        while (true) {
	            System.out.println("\nLibrary Management System");
	            System.out.println("1. Add Book");
	            System.out.println("2. Remove Book");
	            System.out.println("3. Add Student");
	            System.out.println("4. Issue Book");
	            System.out.println("5. Return Book");
	            System.out.println("6. Display Available Books");
	            System.out.println("7. Exit");
	            System.out.print("Enter your choice: ");

	            int choice = scanner.nextInt();
	            scanner.nextLine(); // Consume newline

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter Book ID: ");
	                    String bookId = scanner.nextLine();
	                    System.out.print("Enter Title: ");
	                    String title = scanner.nextLine();
	                    System.out.print("Enter Author: ");
	                    String author = scanner.nextLine();
	                    library.addBook(new Book(bookId, title, author));
	                    break;
	                case 2:
	                    System.out.print("Enter Book ID to remove: ");
	                    String bookIdToRemove = scanner.nextLine();
	                    library.removeBook(bookIdToRemove);
	                    break;
	                case 3:
	                    System.out.print("Enter Student ID: ");
	                    String studentId = scanner.nextLine();
	                    System.out.print("Enter Student Name: ");
	                    String studentName = scanner.nextLine();
	                    library.addStudent(new Student(studentId, studentName));
	                    break;
	                case 4:
	                    System.out.print("Enter Student ID: ");
	                    String issueStudentId = scanner.nextLine();
	                    System.out.print("Enter Book ID: ");
	                    String issueBookId = scanner.nextLine();
	                    library.issueBook(issueStudentId, issueBookId);
	                    break;
	                case 5:
	                    System.out.print("Enter Student ID: ");
	                    String returnStudentId = scanner.nextLine();
	                    library.returnBook(returnStudentId);
	                    break;
	                case 6:
	                    library.displayAvailableBooks();
	                    break;
	                case 7:
	                    System.out.println("Thank you have a nice day,..Exiting...");
	                    //System.exit();
	                default:
	                    System.out.println("Invalid choice.");
	            }
	        }
	    }
}
