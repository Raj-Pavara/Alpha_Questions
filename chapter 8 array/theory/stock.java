public class stock {
    public static void main(String args[]) {
        int arr[] = { 3, 5, 2, 1, 4, 7, 9, 5, 3 };
        System.out.println("max profit is " + stoks(arr));
        // return 0 means if you buy stock any day and sell you in futuer then you always face a loss.
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