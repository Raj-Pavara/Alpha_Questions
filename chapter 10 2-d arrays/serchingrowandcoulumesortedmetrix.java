public class serchingrowandcoulumesortedmetrix {
    public static void main(String args[]) {

    }


    //tc O(n*m)  sc O(1)
    public static void unsorted(int metrix[][], int key) {
        for (int i = 0; i < metrix.length; i++) {
            for (int j = 0; j < metrix[0].length; j++) {
                if (metrix[i][j] == key) {
                    System.out.println("key is on index (" + i + "," + j + ")");
                    return;
                }
            }
        }
        System.out.println("key does not exist");
    }

    //  tc O(n*logm) sc O(1)
    public static void rowwisesorted(int metrix[][], int key) {
        for (int i = 0; i < metrix.length; i++) {
            int start = 0, end = metrix[0].length - 1, mid;
            while (start <= end) {
                mid = (start + end) / 2;
                if (metrix[i][mid] == key) {
                    System.out.println("key is on index (" + i + "," + mid + ")");
                    return;
                } else if (metrix[i][mid] > key) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        System.out.println("key does not exist");
    }

    //tc O(logn * m) sc O(1)
    public static void columewisesorted(int metrix[][], int key) {
        for (int i = 0; i < metrix[0].length; i++) {
            int start = 0, end = metrix.length - 1, mid;
            while (start <= end) {
                mid = (start + end) / 2;
                if (metrix[mid][i] == key) {
                    System.out.println("key is on index (" + mid + "," + i + ")");
                    return;
                } else if (metrix[mid][i] > key) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        System.out.println("key does not exist");
    }

}