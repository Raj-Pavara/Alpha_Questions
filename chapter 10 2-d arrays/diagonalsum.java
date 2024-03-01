//only for row=colume

public class diagonalsum {
    public static void main(String args[]) {
        int arr[][] = { { 1, 2, 3, 1 },
                { 4, 5, 6, 2 },
                { 7, 8, 9, 3 },
                { 4, 5, 6, 7 } };
        System.out.println("diagonal sum is " + diagonalsum(arr));
    }

    public static int diagonalsum(int arr[][]) {
        int sum = 0;

        //tc O(n*m) sc O(1)
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (i == j || j == arr[0].length - 1 - i) {
                    sum += arr[i][j];
                }
            }
        }

    //    optimizedmethod tc O(n) , sc O(1)
        // for (int i = 0; i < arr.length; i++) {
        //     sum += arr[i][i];
        //     if (i != arr.length - 1 - i) {
        //         sum += arr[i][arr.length - 1 - i];
        //     }
        // }

        return sum;
    }
}