// Question 2 : Swap two numbers without using any third variable.

public class sol2 {
    public static void main(String args[]) {
        int x=45,y=89;
        System.out.println("before swaping variable x and y's value is "+x+","+y);
         x=x^y;
         y=x^y;
         x=x^y;
         System.out.println("after swaping variable x and y's value is "+x+","+y);
    }
}