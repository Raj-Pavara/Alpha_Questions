
//print largest of 2
import java.util.*;

public class theory2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your both number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a >= b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}