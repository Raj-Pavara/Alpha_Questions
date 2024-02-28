
//return index of array when key is exit return-1 if key doesnot exist
import java.util.*;

public class linear_search {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your no of element in your array");
        int element = sc.nextInt(); // no of element of our array
        int arr[] = new int[element];
        System.out.println("enter your arry's element one by one");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter key");
        int key = sc.nextInt();
        if (linear_search(arr, key) == -1) {
            System.out.println("key does not exist");
        } else {
            System.out.println("key is one index no. "+linear_search(arr, key));
        }
    }

    public static int linear_search(int array[], int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }
}


//tc = O(n)