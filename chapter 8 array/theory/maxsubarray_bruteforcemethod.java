
//print all subarray and find max and min subarray sum. (Brute Force Method)

public class maxsubarray_bruteforcemethod {
    public static void main(String args[]) {
        int arr[] = { -1, 2, -3, 4, -5 };
        subarray(arr);
    }

    public static void subarray(int arr[]) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int cs = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                cs = 0;
                System.out.print("|");
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + "|");
                    cs += arr[k];
                }
                if (cs < min) {
                    min = cs;
                }
                if (cs > max) {
                    max = cs;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("max subarray sum is " + max + " and min sybarray sum is " + min);
    }

}

//tc = O(n^3) 