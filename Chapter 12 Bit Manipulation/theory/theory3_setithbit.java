//setithbit means make ith bit 1.

public class theory3_setithbit {
    public static void main(String args[]) {
        int num = 1;
        num = setithbit(num, 4);
        System.out.println(num);
    }

    public static int setithbit(int num, int i) {
        return num | (1 << (i - 1));
    }
}