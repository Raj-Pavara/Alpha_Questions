//clear ith bit make ith bit 0

public class theory4_clearithbit {
    public static void main(String args[]) {
        int n = 3;
        n = clearithbit(-16
        , 1);
        System.out.println(n);
    }

    public static int clearithbit(int num, int i) {
        return num & (~(1 << (i - 1)));
    }
}