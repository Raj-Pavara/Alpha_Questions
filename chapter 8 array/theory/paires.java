public class paires {
    public static void main(String args[]) {
         int arr[]={1,2,3,4,5};
         paires(arr);
    }

    public static void paires(int arr[]) {
         for (int i = 0; i < arr.length; i++) {
             for (int j = i+1; j < arr.length; j++) {
                 System.out.println("(" +arr[i]+ ","+arr[j]+")");
             }
             System.out.println();
         }             
    }
}    

// total no of pairs is sum of num.length-1 = (num.length*(num.length-1))/2  
// sc is O(1)   tc  O((n*(n-1))/2)== O(n*n)  