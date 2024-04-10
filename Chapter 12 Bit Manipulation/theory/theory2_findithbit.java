public class theory2_findithbit {
    public static void main(String args[]) {
        findithbit(7, 4);
    }

    public static void findithbit(int num, int i) {
        if ((num & (1 << (i - 1))) == 0) {
            System.out.println("ith bit of num is 0");
        } else if ((num & (1 << (i - 1))) == (1 << (i - 1))) {
            System.out.println("ith bit of num is 1");
        }
    }
}