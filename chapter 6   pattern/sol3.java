import java.rmi.server.SocketSecurityException;
import java.util.*;

public class sol3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}