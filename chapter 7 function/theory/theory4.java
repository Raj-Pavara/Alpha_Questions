//check num is prime or not

import java.util.*;

public class theory4 {
    public static void isPrime(int n) {
        if(n==2){
            System.out.println("prime");
        }
        else{
            int i;
            for( i=2;i<n;i++){
                if(n%i==0){
                    System.out.println("not prime");
                    break;
                }
            }
            if(n==i){
                System.out.println("prime");
            }
        }

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your num");
        int n = sc.nextInt();
        isPrime(n);
    }
}