/*    Question 3 : Add 1 to an integer using Bit Manipulation.
(Hint : try using Bitwise NOT Operator)   */

//tc=sc=O(1)

public class sol3 {
    public static void main(String args[]) {
        int a = 45;
        a = -(~a); // ~45=-45-1=-46.
        System.out.println(a);
    }

}