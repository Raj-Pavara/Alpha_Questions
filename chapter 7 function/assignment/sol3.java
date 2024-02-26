// Question 3 : Write a Java program to check if a number is a palindrome in Java? ( 121 is a palindrome, 321 is not) A number is called a palindrome if the number is equal to the reverse of a number e.g., 121 is a palindrome because the reverse of 121 is 121 itself. On the other hand, 321 is not a palindrome because the reverse of 321 is 123, which is not equal to 321.

import java.util.*;

public class sol3 {
    public static int reverse(int num) {
        int reverse = 0;
        while (num != 0) {
            reverse += num % 10;
            reverse *= 10;
            num /= 10;
        }
        reverse /= 10;
        return reverse;
    }

    public static boolean isPalindrome(int num) {
        int reverse = reverse(num);
        if(num==reverse){
            return true;
        }
        return false;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your num");
        int a = sc.nextInt();
        if (isPalindrome(a)) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }
}
