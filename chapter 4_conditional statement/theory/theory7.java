
//enter number is odd or even using ternary
import java.util.*;

public class theory7 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int a = sc.nextInt();
       
       String name=a%2==0?"even":"odd";
       System.out.println(name);

    }
}