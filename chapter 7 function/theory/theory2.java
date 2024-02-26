//factorial of num

import java.util.*;
public class theory2{
     public static int  factorial(int a){
             if(a==1||a==0){
                return 1;
             }
            
             else{
                int fac=1;
                for(int i=a;i!=1;i--){
                    fac*=i;
                }
                return fac;
             }
     }
public static void main(String args[]){   
          Scanner sc=new Scanner(System.in);
          System.out.println("enter your num");
         int a=sc.nextInt();
          
          System.out.println(a+"! = "+factorial(a));
}
}