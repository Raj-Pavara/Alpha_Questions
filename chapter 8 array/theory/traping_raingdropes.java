public class traping_raingdropes {
    public static void main(String args[]) {
             int arr[]={4,2,0,6,4,2,5};
             int width=1;
             System.out.println("your traping raindropes is "+traping_raingdropes(arr, width));
    }

    public static int traping_raingdropes(int arr[], int width) {
        int left[] = new int[arr.length];
        int right[] = new int[arr.length];
        left[0] = arr[0];
        for (int i = 1; i < right.length; i++) {
            left[i] = Math.max(arr[i], left[i - 1]);
        }
        right[arr.length - 1] = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            right[i] = Math.max(arr[i], right[i + 1]);
        }
        int ans = 0;
        for (int i = 0; i < right.length; i++) {
            ans += (Math.min(left[i], right[i]) - arr[i]) * width;
        }
        return ans;
    }
}


//tc = O(n), sc = O(n)