public class maxsubarray_prefixsummethod {
    public static void main(String args[]) {
        int arr[] = { -1, -2, -3, -4, -5 };
        subarray(arr);
    }

    public static void subarray(int arr[]) {
        int prefix[] = new int[arr.length];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int cs = 0;
        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        for (int i = 0; i < prefix.length; i++) {
            for (int j = i; j < prefix.length; j++) {
                if (i == 0) {
                    cs = prefix[j];
                } else {
                    cs = prefix[j] - prefix[i - 1];
                }
                if (cs > max) {
                    max = cs;
                }
                if (cs < min) {
                    min = cs;
                }
            }
        }
        System.out.println("max subarray sum is " + max + " and min subarray sum is " + min);
    }
}


// tc = O(n^2)  sc = O(n)