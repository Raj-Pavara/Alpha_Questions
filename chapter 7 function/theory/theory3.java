//binomical coefficient   nCr= n!/(r!*(n-r)!)

import java.util.*;

public class theory3 {
    public static int factorial(int a) {
        int fac = 1;
        for (int i = a; i > 1; i--) {
            fac *= i;
        }
        return fac;
    }

    // here factorial function is known as helper function.
    public static double binomicalco(int n,int r) {
           double binomicalcof=factorial(n)/(factorial(r)*factorial(n-r));
           return binomicalcof;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your n and r");
        int n = sc.nextInt();
        int r = sc.nextInt();

        System.out.println(n+"C" +r+ " = " + binomicalco(n,r));
    }
}