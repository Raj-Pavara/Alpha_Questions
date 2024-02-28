public class countingsortdesending {
    public static void main(String args[]) {
        int arr[] = {3,6,2,1,8,7,4,5,3,1};
        countingsort(arr);
        printarray(arr);
    }

    public static void countingsort(int arr[]) {
        // this loop find maximum element of arr
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        int occurance[] = new int[max + 1];
        for (int i = 0; i < arr.length; i++) {
            occurance[arr[i]]++;
        }
        int j = arr.length-1;
        for (int i = 0; i < occurance.length; i++) {
            while (occurance[i] > 0) {
                occurance[i]--;
                arr[j] = i;
                j--;
            }
        }
    }

    public static void printarray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}


//tc = sc = O(n)