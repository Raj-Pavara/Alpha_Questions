import java.util.*;

public class sol10 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number");
        int n = sc.nextInt();
       int space=n-1;
        for(int i=1;i<=n;i++){
            for(int k=1;k<=space;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
            System.out.print(i+" ");
            }
            space--;;
            System.out.println();
            }
            
    }
}