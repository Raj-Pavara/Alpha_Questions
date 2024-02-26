
//enterd number is odd or even
import java.util.*;

public class theory3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int a = sc.nextInt();
       
        if (a%2==0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}