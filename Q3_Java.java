/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.javaassgno2;

/**
// *
// * @author 810
 */
import java.util.Scanner;
public class Q3_Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner myInput= new Scanner(System.in);
        Scanner credit= new Scanner(System.in);
        Scanner myInput2= new Scanner(System.in);
        Scanner myInput3= new Scanner(System.in);
        Scanner myInput4= new Scanner(System.in);
        System.out.println("Enter the desired number of customers: ");
        int Customers= myInput.nextInt();
        
        for(int i=1;i<=Customers;i++){
            System.out.print("Customer "+i+": ");
            System.out.println("Enter your credit limit: ");
            float creditLimit= credit.nextFloat();
            
            
            System.out.println("Enter the price of the item you want to buy: ");
            float price= myInput2.nextFloat();
            
            System.out.println("Enter the number of items you want to purchase: ");
            int quantity= myInput2.nextInt();
            
            float total=price*quantity;
            
            while(total > creditLimit){
                System.out.println("Sorry you cannot purchase the items with such a credit");
                System.out.println("Please re-enter the number of items:");
                quantity= myInput2.nextInt();
                
                total=quantity*price;
            }
        }
    }
    
}
