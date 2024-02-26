import java.util.*;

public class sol7 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number");
        int num = sc.nextInt();
        int space = num - 1;
        for (int i = 1; i <= num; i++) {
            for (int k = 1; k <= space; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            space--;
            System.out.println();
        }
    }
}