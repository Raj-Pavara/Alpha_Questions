// Question 3 : Write a Java program to input week number(1-7) and print day of week name using switch case.

import java.util.*;

public class sol3{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you number ");
        int a = sc.nextInt();
       switch(a){
        case 1:
          System.out.println("sunday");
          break;
          case 2:
          System.out.println("monday");
          break;
          case 3:
          System.out.println("tuesday");
          break;
          case 4:
          System.out.println("wendesday");
          break;
          case 5:
          System.out.println("thuersday");
          break;
          case 6:
          System.out.println("friday");
          break;
          case 7:
          System.out.println("satuerday");
          break;
          default :
          System.out.println("you enter wrong input");
         
       }

    }
}