//clear all bit between ith and jth position (i and j included).

public class theory7_clearrangeofbit {
    public static void main(String args[]) {
         System.out.println(clearrangeofbit(10,3,5));
    }

    public static int clearrangeofbit(int num, int i, int j) {
        int a = (-1 << j);
        int b = (int) Math.pow(2, i) - 1;
        return num & (a | b);
    }
}