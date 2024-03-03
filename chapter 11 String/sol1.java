//Question 1 : Count how many times lowercase vowels occurred in a String entered by the user.

import java.util.*;

public class sol1 {
    public static void main(String args[]) {
        System.out.println("Enter your string ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("occurance of lowercase voweles is " + voweles(str));
    }

    public static int voweles(String str) {
        int occurance = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u') {
                occurance++;
            }
        }
        return occurance;
    }
}

//tc O(n) sc O(1)