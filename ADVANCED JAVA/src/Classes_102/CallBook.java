package Classes_102;
import java.util.*;
public class CallBook {
    public static void main(String[] args){
        int Num_of_Books;

        while(true){
            Scanner input = new Scanner (System.in);
            try{
                System.out.println("Enter the number of books in your library:");
                Num_of_Books=input.nextInt();
                if(Num_of_Books > 0) break;  //Exit loop if user enters a positive integer
                else System.out.println("Invalid entry, please enter a positive integer.");
            } catch (InputMismatchException e){
                System.out.println("Invalid entry, please enter an integer.");
            }
            input.close();
        }
        Book[] Books = new Book[Num_of_Books];

        for (int i = 0; i < Books.length; i++){
            Books[i] = new Book();   //Create object for each book in array
            Books[i].inputBookDetails(1 + i);
        }
        System.out.println("Display for Filter books (Price > 3500 and Page_Numbers > 400):");
        for(Book book : Books) {
            if (book.isValid()){
                System.out.println(book);
            }
        }
    }
}