
// Question 3 : Write a program to find the factorial of any number entered by the user.
import java.util.*;

public class sol3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number");
        int num = sc.nextInt();
        int factorial = 1;
        while (num != 0) {
            factorial *= num;
            num--;
        }
        System.out.println("you factorial is " + factorial);
    }
}