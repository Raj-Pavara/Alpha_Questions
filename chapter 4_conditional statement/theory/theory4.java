//program to you are adult or child or teenager
import java.util.*;
public class theory4{
public static void main(String args[]){   
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter your age");
          int age=sc.nextInt();
          if(age>=18){  System.out.println("you are adult");}
          else if(age<18&&age>=13){
            System.out.println("you are teenager");
          }
          else{
            System.out.println("you are child");
          }
}
}