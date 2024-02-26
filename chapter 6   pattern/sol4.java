import java.util.*;

public class sol4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number");
        int num = sc.nextInt();
        int a = 1;
        for (int i = 1; 3 < 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(a + " ");
                a++;
                if (a == num + 1) {
                    break;
                }
            }
            if (a == num + 1) {
                break;
            }
            System.out.println();
        }
    }
}