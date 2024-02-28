// Question 1: Given an integer array nums, return true if any value appears at least twice in the
// array, and return false if every element is distinct.
// Example 1:
// Input: nums = [1, 2, 3, 1]
// Output: true
// Example 2:
// Input: nums = [1, 2, 3, 4]
// Output: false
// Example 3:
// Input: nums = [1, 1, 1, 3, 3, 4, 3, 2, 4, 2]
// Output: true

// Constraints:
// • 1 <= nums . lengtth <= 10^5
// • -10^9 <= nums [ i ] <= 10^9

public class sol1 {
    public static void main(String args[]) {
                    int arr[]={1,3,4,6,87,9};
                    System.out.println(repeat(arr));
    }

    public static boolean repeat(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}

// tc = O(n^2)