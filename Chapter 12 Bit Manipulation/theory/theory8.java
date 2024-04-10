// check if a number of power of 2 or not using bitwise operators.

public class theory8 {
    public static void main(String args[]) {
        System.out.println(powerof2ornot(256));
    }

    public static boolean powerof2ornot(int num) {
        if (num == 1) {
            return false;
        }
        if ((num & (num - 1)) == 0) {                 //if num is power of 2 then num &num-1 is always 0 .
            return true;
        }
        return false;
    }
}