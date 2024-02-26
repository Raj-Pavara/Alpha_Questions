
//create a calulater 
import java.util.*;

public class theory8 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your process");
        int a = sc.nextInt();
        char c = sc.next().charAt(0);
        int b = sc.nextInt();
        switch (c) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println((float)a/(float)b);
                break;
            case '%':
                System.out.println(a%b);
                break;
        }
    }
}