//print prime in given range.

import java.util.*;

public class theory5 {
    public static void isPrime(int n) {
        if(n==2){
            System.out.println(n);
        }
        else{
            int i;
            for( i=2;i<n;i++){
                if(n%i==0){
                
                    break;
                }
            }
            if(n==i){
                System.out.println(n);
            }
        }

    }

   

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your start and last num");
        int start = sc.nextInt();
        int last = sc.nextInt();
        for(int i=start;i<=last;i++){
            isPrime(i);
        }
    }
}