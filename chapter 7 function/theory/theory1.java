//find product of  a and b
import java.util.*;
public class theory1{
     public static double product(double a, double b){
           return a*b;
     }
public static void main(String args[]){   
          Scanner sc=new Scanner(System.in);
          System.out.println("enter your both num");
          double a=sc.nextDouble();
          double b=sc.nextDouble();
          System.out.println(product(a, b));
}
}