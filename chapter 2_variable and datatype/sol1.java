/* 
Question 1 : In a program, input 3 numbers : A, B and C. You have to output the average of
these 3 numbers.
(Hint : Average of N numbers is sum of those numbers divided by N)

*/
import java.util.*;

public class sol1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        System.out.println((a + b + c) / 3);

    }

}