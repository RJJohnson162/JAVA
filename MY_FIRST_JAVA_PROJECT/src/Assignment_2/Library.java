package Assignment_2;

import java.util.Scanner;

public class Library {
    private static final int MAX_BOOKS = 100;
    private Book[] books;
    private int numBooks;

    public Library() {
        this.books = new Book[MAX_BOOKS];
        this.numBooks = 0;
    }

    public void addBook(Book book) {
        if (numBooks < MAX_BOOKS) {
            books[numBooks] = book;
            numBooks++;
            System.out.println("Book added successfully");
        } else {
            System.out.println("Cannot add book: Library is full");
        }
    }

    public void displayBooks() {
        if (numBooks == 0) {
            System.out.println("No books in the library");
        } else {
            System.out.println("Book codes and names in the library:");
            for (int i = 0; i < numBooks; i++) {
                System.out.println(books[i].getCode() + " - " + books[i].getName());
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Library library = new Library();

        while (true) {
            System.out.println("\nEnter 1 to add a book");
            System.out.println("Enter 2 to display all books");
            System.out.println("Enter 3 to exit");
            System.out.print("Selection: ");

            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter book code: ");
                    String code = input.nextLine();
                    System.out.print("Enter book name: ");
                    String name = input.nextLine();
                    Book book = new Book(code, name);
                    library.addBook(book);
                    break;

                case 2:
                    library.displayBooks();
                    break;

                case 3:
                    System.out.println("Exiting program...");
                    input.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid selection");
            }
        }
    }
}

class Book {
    private String code;
    private String name;

    public Book(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}

