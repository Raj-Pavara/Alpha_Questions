// Question 3: You are given an array prices where prices[i] is the price of a given stock on
// the ith day.
// Return the maximum profit you can achieve from this transaction. If you cannot
// achieve any profit, return 0.

// Example 1:
// Input: prices = [7, 1, 5, 3, 6, 4]
// Output: 5
// Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
// Note that buying on day 2 and selling on day 1 is not allowed because
// you must buy before you sell.
// Example 2:
// Input: Prices = [7, 6, 4, 3, 1]
// Output: 0
// Explanation: In this case, no transactions are done and the max profit = 0.
// Constraints:
// • 1 <= prices . length <= 10^5
// • 0 <= prices [ i ] <= 10^4




public class sol3 {
    public static void main(String args[]) {
        int arr[] = {7, 6, 4, 3, 1 };
        System.out.println("max profit is " + stoks(arr));
        // return 0 means if you buy stock any day and sell you in futuer then you
        // always face a loss.

    }

    public static int stoks(int arr[]) {
        int buyingprize = arr[0];
        int profit = 0;
        for (int i = 1; i < arr.length; i++) {
            if (buyingprize < arr[i] && profit < arr[i] - buyingprize) {
                profit = arr[i] - buyingprize;
            } else if (buyingprize > arr[i]) {
                buyingprize = arr[i];
            }
        }
        return profit;
    }
}

//tc O(n)
