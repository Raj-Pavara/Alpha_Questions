// uestion 2 : Write a program that reads a set of integers, and then prints the sum of the  even and odd integers.
import java.util.*;

public class sol2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("how many int you enter");
        int num = sc.nextInt();
        int n, evensum = 0, oddsum = 0;
        for (int i = 0; i < num; i++) {
            n = sc.nextInt();
            if (n % 2 == 0) {
                evensum += n;
            } else {
                oddsum += n;
            }
        }
        System.out.println("evensum is " + evensum + " and odd sum is " + oddsum);

    }
}