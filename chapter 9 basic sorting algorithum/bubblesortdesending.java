public class bubblesortdesending {
    public static void main(String args[]) {
          int arr[]={3,6,2,1,8,7,4,5,3,1};
           bubblesort(arr);
          printarry(arr);
    }
 public static void printarry(int arr[]){
    for (int i = 0; i < arr.length; i++) {
         System.out.println(arr[i]);
    }
 }
    public static void bubblesort(int arr[]) {
        boolean t = true;
        for (int i = 0; i < arr.length - 1; i++) {
            t = true;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    t = false;
                }
            }
            if(t){return;}
        }
    }
}

// tc O(n^2) sc O(1)  best case tc O(n)