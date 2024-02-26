//income tax calculatoer
import java.util.*;
public class theory5{
public static void main(String args[]){   
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter your income");
          int income=sc.nextInt();
          if(income<500000){  System.out.println("your tax is 0");}
          else if (income>=500000 && income <1000000){
            System.out.println("you tax is "+income*0.2);
          }
          else {
            System.out.println("you tax is "+income*0.3);
          }
}
}