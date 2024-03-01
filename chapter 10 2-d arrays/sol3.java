//print transpose metrix .
public class sol3 {
    public static void main(String args[]) {
        int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 } };
        int transpose[][] = new int[arr[0].length][arr.length];
        transpose(arr, transpose);
        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[0].length; j++) {
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }

    }

    public static void transpose(int arr[][], int transpose[][]) {
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++) {
                transpose[i][j] = arr[j][i];
            }
        }
    }
}


// tc O(n*m) sc O(m*n)