// Question 5: Given an integer array nums, return all the triplets [nums[i], nums[j],
// nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
// Notice that the solution set must not contain duplicate triplets.

// Example 1:
// Input: nums = [-1, 0, 1, 2, -1, -4]
// Output: [ [-1, -1, 2] , [-1, 0, 1] ]
// Example 2:
// Input: nums = [ ]
// Output: [ ]
// Example 3:
// Input: nums = [ 0 ]
// Output: [ ]
// Constraints:
// • 0 <= nums . length <= 3000
// • -10^5 <= nums [ i ] <= 10^5


public class sol5{
public static void main(String args[]){   
          int arr[]={3,4,2,-3,-1,0};
          triplets(arr);
}
  public static void triplets(int arr[]){
    System.out.print("[");
      for (int i = 0; i < arr.length; i++) {
         for (int j = i+1; j < arr.length; j++) {
            for (int k = j+1; k < arr.length; k++) {
                if(arr[i]+arr[j]+arr[k]==0){
                   System.out.print("["+arr[i]+","+arr[j]+","+arr[k]+"] ");
                }
            }
         }
      }
      System.out.print("]");
  }
}