
//  convert decimal to any n base number system
import java.util.*;

public class theory7 {
    public static int decimaltoother(int base, int num) {
            int other=1;
                  while(num!=0){
                     other*=10;
                     other+=(num%base);
                     num/=base;
                  }
                  int otherinvert=0;
                  while(other!=1){
                    otherinvert*=10;
                    otherinvert+=other%10;
                    other/=10;
                  }
                  return otherinvert;
    }

    public static void main(String args[]) {
        System.out.println("enter your number's base and decimal number");
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int num = sc.nextInt();
        int other = decimaltoother(base, num);
        System.out.println(other);
    }
}