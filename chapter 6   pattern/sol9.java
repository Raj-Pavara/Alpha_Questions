import java.util.*;

public class sol9 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number");
        int n = sc.nextInt();
        int a=1,space=n-1;
        for(int i=1;i<=n*2;i++){
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=a;j++){
            System.out.print("*");
            }
            if(i<n){
                a+=2;
                space--;
            }
            else if(i==n){

            }
            else {
                a-=2;
                space++;
            }
            System.out.println();

    }
}
}