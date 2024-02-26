
//print character pattern
import java.util.*;

public class theory4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your character");
        char c = sc.next().charAt(0);
        char a = 'A';
        for (int i = 1; 3 < 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(a);
                a = (char) (a + 1);      //type pramotion
                if(a==c+1){
                    a='A';
                    break;
                }
               
            }
            if(a=='A'){
                break;
            }
            System.out.print("\n");
        }
    }
}
