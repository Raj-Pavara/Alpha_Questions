public class maxsubarray_kadanshalgo {
    public static void main(String args[]) {
        int arr[] = { -1, 3, -4, 2 };
        // max(arr);
        min(arr);
    }

    public static void max(int arr[]) {
        int cs = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            cs += arr[i];
            if (cs < 0) {
                cs = 0;
            }
            if (max < cs) {
                max = cs;
            }
        }
        // if all element of array is zero..
        if (max == 0) {
            max = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (max < arr[i]) {
                    max = arr[i];
                }
            }
        }
        System.out.println("max sum is " + max);
    }

    // min sum
    public static void min(int arr[]) {
        int cs = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            cs += arr[i];
            if (cs > 0) {
                cs = 0;
            }
            if (min > cs) {
                min = cs;
            }
        }
        // if all element of array is zero..
        if (min == 0) {
            min = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (min > arr[i]) {
                    min = arr[i];
                }
            }
        }
        System.out.println("min sum is " + min);
    }
}


//tc = O(n)