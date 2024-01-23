import java.util.Scanner;

public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.println('Enter the FirstNumber: ');
    int firstNumber = scanner.nextInt();
    System.out.println('Enter the SecondNumber: ');
    int secondNumber = scanner.nextInt();
    System.out.println('Enter the ThirdNumber: ');
    int thirdNumber = scanner.nextInt();

    int sum = firstNumber + secondNumber + thirdNumber;
    int product = firstNumber * secondNumber * thirdNumber;
    int average = sum / 3;

    System.out.println("The sum is " + sum + ", the average is " + average + " and the product is " + product);
}