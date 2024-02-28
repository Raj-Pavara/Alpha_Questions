import java.util.*;

public class binary_search {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("your array is upsorted or downsorted ? ");
        String ud = sc.nextLine();
        System.out.println("enter your no of element in your array");
        int element = sc.nextInt(); // no of element of our array
        int arr[] = new int[element];
        System.out.println("enter your arry's element one by one");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter key");
        int key = sc.nextInt();

        if (ud .equals( "upsorted")) {
            System.out.println(bsforupsorted(arr, key));
        } else {
            System.out.println(bsfordownsorted(arr, key));
        }

    }

    public static int bsforupsorted(int arr[], int key) {
        int start = 0, end = arr.length - 1, mid;
        while (start <= end) {
            mid = (start + end) / 2;
            if (key == arr[mid]) {
                return mid;
            } else if (key > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

    public static int bsfordownsorted(int arr[], int key) {
        int start = 0, end = arr.length - 1, mid;
        while (start <= end) {
            mid = (start + end) / 2;
            if (key == arr[mid]) {
                return mid;
            } else if (key > arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}


// tc = O(logn)