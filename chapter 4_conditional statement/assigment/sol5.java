// Question 5 : Write a Java program that takes a year from the user and print whether that year is a leap year or not.

// leap year = diviseable by 4 and not divisable by 100 and if divisable by 100 then also divisable by 400.

import java.util.*;

public class sol5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you year ");
        int year =sc.nextInt();
        if(year%4!=0){
            System.out.println("your year is not leap year");
        }
        else {
            if(year%100!=0){
                System.out.println("your year is leap year");
            }
            else{
                if(year%400==0){
                    System.out.println("your year is leap year");
                }  
                else{
                    System.out.println("your year is not leap year");

                }
            }
        }
    }
}