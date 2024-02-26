//Question 1 : Write a Java program to get a number from the user and print whether it is positive or negative.

import java.util.*;

public class sol1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you number ");
        int a = sc.nextInt();
        if (a >= 0) {
            System.out.println("your number is positive");
        } else {
            System.out.println("your number is negetive");
        }

    }
}