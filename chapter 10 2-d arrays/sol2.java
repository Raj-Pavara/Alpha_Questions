//print sum of particular row
public class sol2 {
    public static void main(String args[]) {
       int arr[][]={{1,4,9},{11,4,3},{2,2,3}};
                    System.out.println("sum of your row is "+sum(arr, 1));   
    }

    public static int sum(int arr[][], int rowno) {
        int ans = 0;
        for (int i = 0; i < arr[0].length; i++) {
            ans += arr[rowno][i];
        }
        return ans;
    }
}

//tc O(m) sc O(1)