// update ith bit set ith bit 0 or 1 . 

public class theory5_updateithbit {
    public static void main(String args[]) {
        int num = 1;
        num = updateithbit(num, 4, 1);
        System.out.println(num);
    }

    public static int updateithbit(int num, int i, int newbit) {
        if (newbit == 1) {
            return setithbit(num, i);
        } else {
            return clearithbit(num, i);
        }
    }

    public static int clearithbit(int num, int i) {
        return num & (~(1 << (i - 1)));
    }

    public static int setithbit(int num, int i) {
        return num | (1 << (i - 1));
    }
}