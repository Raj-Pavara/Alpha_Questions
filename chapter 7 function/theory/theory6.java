//convert n's base number system to decimal1
import java.util.*;

public class theory6 {
    public static int othertodecimal(int base, int num) {
        int decimal=0;
            int power=0;
         while(num!=0){
           decimal+=((num%10)*(int)Math.pow(base,power));
           power++;
           num/=10;
         }
        return decimal;
    }

    public static void main(String args[]) {
        System.out.println("enter your number's base and number");
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int num = sc.nextInt();
        int decimal = othertodecimal(base, num);
        System.out.println(decimal);
    }
}