public class selectionsortdesending {
    public static void main(String args[]) {
        int arr[] = { 3,6,2,1,8,7,4,5,3,1 };
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
            int maxdex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[maxdex] < arr[j]) {
                    maxdex = j;
                }
            }
            if (arr[maxdex] > arr[i]) {
                int temp = arr[maxdex];
                arr[maxdex] = arr[i];
                arr[i] = temp;
            }
        }
    }
}



// tc O(n^2) sc O(1)