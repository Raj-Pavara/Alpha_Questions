// Question 1 : Write a Java method to compute the average of three numbers..


import java.util.*;
public class sol1{
  
public static void main(String args[]){   
          Scanner sc=new Scanner(System.in);
          System.out.println("enter all three num");
          int a=sc.nextInt();
          int b=sc.nextInt();
          int c=sc.nextInt();
          System.out.println("avg is "+ average(a,b,c));
}
public static double average(int a,int b,int c){
    return (a+b+c)/3.0;          
}
}