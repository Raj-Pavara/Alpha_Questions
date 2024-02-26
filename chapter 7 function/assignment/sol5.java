// Question 5 : Write a Java method to compute the sum of the digits in an integer.

import java.util.*;

public class sol5 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your num");
        int a = sc.nextInt();
        System.out.println("sum of digit is " + sumofdigit(a));

    }

    public static int sumofdigit(int a) {
        int sum = 0;
        while (a != 0) {
            sum+=(a%10);
            a /= 10;
        }
        return sum;
    }
}
