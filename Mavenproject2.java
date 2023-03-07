/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;

/**
 *
 * @author 810
 */
import java.util.Scanner;
import java.util.Random;
public class Mavenproject2 {
   
    public static void main(String[] args) {
       Scanner myInput= new Scanner(System.in);//scanner input for number of rounds
        Scanner LuckyNumber=new Scanner(System.in);//scanner input for lucky number
        
        int rounds,score=0;
        float result;
        
   
        System.out.println("Enter desired number of rounds: ");
        rounds=myInput.nextInt();//set variable 'rounds' to store the input for number of rounds 
        //keys in rounds
        
        for(int i=1;i<=rounds;i++){//Enter for loop
            System.out.print("Round "+i+": ");
            System.out.println("Enter the lucky number: ");
            int luckyNumber=LuckyNumber.nextInt();
            //keys in lucky number
            
            Random rand=new Random();
            int upperbound=100;
            int randomNumber=rand.nextInt(upperbound);
            //generate random number(secret number)
            
            result=luckyNumber%randomNumber;
            //result of lucky number % secret Number
             
            if(result%2==0){
                System.out.println("The round ended in a draw");
                score+=1;
            }
            else if(result%2==0&result!=0){
                System.out.println("You have won this round");
                score+=3;
            }
            else if(result%2 != 0){
                System.out.println("You have lost this round");
                score-=3;
            }
        }
        if(score>0){
            System.out.println("Congratulations!!!!!!YOU WON THE GAME!!");
        }
        else
            System.out.println("SORRY.....YOU LOST");
    }
}
