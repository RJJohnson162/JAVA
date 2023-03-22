package Assignment_2;

import javax.swing.JOptionPane;

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
            JOptionPane.showMessageDialog(null, "Book added successfully");
        } else {
            JOptionPane.showMessageDialog(null, "Cannot add book: Library is full");
        }
    }

    public void displayBooks() {
        if (numBooks == 0) {
            JOptionPane.showMessageDialog(null, "No books in the library");
        } else {
            String message = "Book codes and names in the library:\n";
            for (int i = 0; i < numBooks; i++) {
                message += books[i].getCode() + " - " + books[i].getName() + "\n";
            }
            JOptionPane.showMessageDialog(null, message);
        }
    }

    public static void main(String[] args) {
        Library library = new Library();

        while (true) {
            String input = JOptionPane.showInputDialog("Enter 1 to add a book\nEnter 2 to display all books\nEnter 3 to exit");
            int choice = Integer.parseInt(input);

            switch (choice) {
                case 1:
                    String code = JOptionPane.showInputDialog("Enter book code:");
                    String name = JOptionPane.showInputDialog("Enter book name:");
                    Book book = new Book(code, name);
                    library.addBook(book);
                    break;

                case 2:
                    library.displayBooks();
                    break;

                case 3:
                    JOptionPane.showMessageDialog(null, "Exiting program...");
                    System.exit(0);

                default:
                    JOptionPane.showMessageDialog(null, "Invalid selection");
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

