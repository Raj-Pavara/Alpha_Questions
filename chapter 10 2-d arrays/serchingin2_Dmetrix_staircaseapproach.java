public class serchingin2_Dmetrix_staircaseapproach {
    public static void main(String args[]) {
        int metrix[][] = { { 2 }, { 3 }, { 5 }, { 7 } };
        staircase(metrix, 3
        );
    }

    public static void staircase(int metrix[][], int key) {
        //we can write this approch with 2 type 

        //type 1 

        // int i = 0, j = metrix[0].length - 1;
        // while (i < metrix.length && j >= 0) {
        // if (metrix[i][j] == key) {
        // System.out.println("your key is at index (" + i + "," + j + ")");
        // return;
        // } else if (metrix[i][j] > key) {
        // j--;
        // }
        // else{
        // i++;
        // }
        // }
        // System.out.println("your key doesn't exist");

         // type 2 
         
        int i = metrix.length - 1, j = 0;
        while (i >= 0 && j < metrix[0].length) {
            if (metrix[i][j] == key) {
                System.out.println("your key is at index (" + i + "," + j + ")");
                return;
            } else if (metrix[i][j] > key) {
                i--;
            } else {
                j++;
            }
        }
        System.out.println("your key doesn't exist");
    }
}


//  tc O(m+n) sc O(1)