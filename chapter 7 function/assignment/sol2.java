//Question 2 : Write a method named isEven that accepts an int argument. The method should return true if the argument is even, or false otherwise. Also write a program to test your method.
 import java.util.*;
public class sol2 {
    public static boolean isEven(int a){
        if(a%2==0){
            return true;
        }
        else{
            return false;
        }
    }
public static void main(String args[]){   
    Scanner sc=new Scanner(System.in);
    System.out.println("enter your num");
    int a=sc.nextInt();
    System.out.println(isEven(a));
}
}