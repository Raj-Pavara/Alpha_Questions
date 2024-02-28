public class insertionsortdesending {
    public static void main(String args[]) {
        int arr[] = { 3,6,2,1,8,7,4,5,3,1 };
        insertionsort(arr);
        printarry(arr);
    }

    public static void printarry(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void insertionsort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i ; j >= 0; j--) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                else{
                    break;
                }
            }
        }
    }
}


// worst case tc O(n^2) best case tc O(n)  sc O(1)