/* 
 * 2)A library requires a program to capture and store details
 * about books in the library. For each book, the following is captured:
    	ISBN
    	Author
    	Title
    	Number of pages
    	Price (in kshs.)
    	Year of publication
    Write a C# program that uses a class named Book and that reads the
    details about all books in the library. The program should then output
    details for all books whose price is greater than kshs. 3500 and whose
    number of pages are more than 400.      (20 mks)
 */
package Classes_102;
import java.util.Scanner;

public class Book {
    private String ISBN;
    private String Author;
    private String Title;
    private int Num_of_Pages;
    private double Price;
    private int Publication_year;

    // Default constructor
    public Book() {
        this("","","",0,0,0);
    }
    public Book(String ISBN, String Author, String Title, int Num_of_Pages, double Price, int Publication_year) {
        this.ISBN = ISBN;
        this.Author = Author;
        this.Title = Title;
        this.Num_of_Pages = Num_of_Pages;
        this.Price = Price;
        this.Publication_year = Publication_year;
    }
    public String InputErrorHandling(Scanner Prompt, String message) {
        String input;
        while (true) {
            try {
                System.out.println(message);
                input = Prompt.nextLine();
                if (input.isEmpty()) {
                    throw new IllegalArgumentException("Input cannot be empty.");
                }
                return input;
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid input: " + e.getMessage());
            }
        }
    }
    public void inputBookDetails(int Book_num) {
        Scanner Prompt = new Scanner(System.in);
        System.out.println("________________ BOOK " + Book_num + "________________");
        ISBN = InputErrorHandling(Prompt, "Please enter the book ISBN: ");
        Author = InputErrorHandling(Prompt, "Please enter the Author of the book:");
        Title = InputErrorHandling(Prompt, "Enter the book Title: ");
        Num_of_Pages = Integer.parseInt(InputErrorHandling(Prompt, "Enter the number of pages: "));
        Price = Double.parseDouble(InputErrorHandling(Prompt, "Enter the price of the book: "));
        Publication_year = Integer.parseInt(InputErrorHandling(Prompt, "Enter the publication year: "));
    }
    public boolean isValid(){
        return Price > 3500 && Num_of_Pages > 400;
    }
    @Override
    public String toString(){
        return "\nISBN: \t\t\t\t" + ISBN +
                "\nAuthor:\t\t\t\t" + Author +
                "\nTitle:\t\t\t\t" + Title +
                "\nNumber of Pages:\t\t" + Num_of_Pages +
                "\nPrice:\t\t\t\t$" + Price +
                "\nYear Published:\t\t\t" + Publication_year;
    }
}