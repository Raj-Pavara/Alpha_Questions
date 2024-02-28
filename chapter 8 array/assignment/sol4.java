// Question 4: Given n non-negative integers representing an elevation map where the width of
// each bar is 1, compute how much water it can trap after raining.

// Example 1:
// Input: height = [0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1]
// Output: 6
// Explanation: The above elevation map (black section) is represented by array
// [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section)
// are being trapped.
// Example 2:
// Input: height = [4, 2, 0, 3, 2, 5]
// Output: 9
// Constraints:
// • n == height . length
// • 1 <= n <= 2 * 10^4
// • 0 <= height [ i ] < = 10^5
public class sol4 {
    public static void main(String args[]) {
             int arr[]={1,2,3,4,5,6,7,8};
             int width=3;
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


//tc O(n) sc O(n)