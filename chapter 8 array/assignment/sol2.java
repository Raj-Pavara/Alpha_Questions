// Question 2: There is an integer array nums sorted in ascending order (with distinct values).
// Prior to being passed to your function, nums is possibly rotated at an unknown
// pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k],
// nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For
// example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and
// become [4,5,6,7,0,1,2].
// Given the array nums after the possible rotation and an integer target, return the
// index of target if it is in nums, or -1 if it is not in nums.
// You must write an algorithm with O(log n) runtime complexity.
// Example 1:
// Input: nums = [4, 5, 6, 7, 0, 1, 2], target = 0
// Output: 4
// Example 2:
// Input: nums = [4, 5, 6, 7, 0, 1, 2], target = 3
// Output: -1
// Example 3:
// Input: nums = [1], target = 0
// Output: -1
// Constraints:
// • 1 <= nums . lengtth <= 5000
// • -10^4 <= nums [ i ] <= 10^4
// • All values of nums are unique.
// • nums is an ascending array that is possibly rotated.
// • -10^4 <= target <= 10^4

public class sol2 {
    public static void main(String args[]) {
        int arr[] = { 2, 3, -2, -1, 0 };
        System.out.println(function(arr, -2));
    }

    public static int function(int arr[], int key) {
        if (key >= arr[0] && key <= arr[halfindex(arr) - 1]) {
            return binarySearch(arr, key, 0, halfindex(arr) - 1);
        } else {
            return binarySearch(arr, key, halfindex(arr), arr.length - 1);
        }

    }

    // this function is give you a index of your key.
    public static int binarySearch(int arr[], int key, int start, int end) {

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] > key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    // this method will return the minimum element's index.(bionary serch). tc of
    // this function is O(logn).
    public static int halfindex(int arr[]) {
        int start = 0, end = arr.length - 1, mid = (start + end) / 2;
        if (arr[start] < arr[end]) {
            return start;
        }
        while (start <= end) {
            if (arr[start] <= arr[mid]) {
                if (arr[mid] > arr[mid + 1]) {
                    return mid + 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (arr[mid] < arr[mid - 1]) {
                    return mid;
                } else {
                    end = mid - 1;
                }
            }
        }
        return 1;
    }

}


//tc O(logn)