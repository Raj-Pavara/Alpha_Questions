//print occurance of key in 2d array
public class sol1{
public static void main(String args[]){   
          int [][]array={{4,7,8},{8,8,7}};
          int key=7;
          System.out.println("occurance of "+key +" is "+occurance(array, key));
}
  public static int occurance(int arr[][],int key){
    int ans=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][j]==key){
                    ans++;

                }
            }
        }
        return ans;
  }
}


//tc O(m*n) sc O(1)