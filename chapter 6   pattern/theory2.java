
//print inverted star pattern
import java.util.*;

public class theory2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number");
        int a = sc.nextInt();
        for (int i = a; i != 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
