import java.util.*;

public class sol5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number");
        int num = sc.nextInt();
        int ans = 1;
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                ans = 0;
            } else {
                ans = 1;
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(ans);
                if (ans == 0) {
                    ans = 1;
                } else {
                    ans = 0;
                }
            }

            System.out.println();
        }
    }
}