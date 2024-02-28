
//find max and min of array
import java.util.*;

public class max_mininarray {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter your no of element in your array");
        int element = sc.nextInt(); // no of element of our array
        int arr[] = new int[element];
        System.out.println("enter your arry's element one by one");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        max_min(arr);
    }

    public static void max_min(int arr[]) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }

            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("min value is " + min + " and max value is " + max);
    }

}


//  tc O(n)