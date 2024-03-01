public class spiralmetrix {
    public static void main(String args[]) {
        int arr[][] = { { 1, 2, 3 },
                { 4, 5, 6 }};
        printmetrix(arr);
        spiralmetrix(arr);
    }

    public static void printmetrix(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void spiralmetrix(int metrix[][]) {
        int startrow = 0, startcolume = 0, endrow = metrix.length - 1, endcolume = metrix[0].length - 1;
        while (endcolume >= startcolume && endrow >= startrow) {

            // this loop print upperline .
            for (int i = startcolume; i <= endcolume; i++) {
                System.out.print(metrix[startrow][i] + " ");
            }

            // this loop print leftline .
            for (int i = startrow + 1; i <= endrow; i++) {
                System.out.print(metrix[i][endcolume] + " ");
            }

            // this loop print lowerline .
            for (int i = endcolume - 1; i >= startcolume; i--) {
                if (startrow == endrow) {
                    break;
                }
                System.out.print(metrix[endrow][i] + " ");
            }

            // this loop print rightline .
            for (int i = endrow - 1; i >= startrow + 1; i--) {
                if (endcolume == startcolume) {
                    break;
                }
                System.out.print(metrix[i][startcolume] + " ");
            }
            startcolume++;
            startrow++;
            endcolume--;
            endrow--;
        }
    }
}


//tc O(n*m) sc O(1)