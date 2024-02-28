public class selectionsortasending {
    public static void main(String args[]) {
        int arr[] = { 3, 3, -5, 8, 4, 3 };
        selectionsort(arr);
        printarry(arr);
    }

    public static void printarry(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void selectionsort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minindex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minindex] > arr[j]) {
                    minindex = j;
                }
            }
            if (arr[minindex] < arr[i]) {
                int temp = arr[minindex];
                arr[minindex] = arr[i];
                arr[i] = temp;
            }
        }
    }
}


// tc O(n^2) sc O(1)