//calculate a^n  tc=O(logn base=2) sc= ignoer .
//this program is only work for n>=0 here n is integer not float . here we can easily modify this prograrm for n<0.
//here a is any + or - integer or fraction.

public class theory10_Fast_exponentioation {
    public static void main(String args[]) {
        int a = -4;
        int n = 3;
        System.out.println("a to the power n is " + fastexponentioation(a, n));
    }

    public static int fastexponentioation(int a, int n) {
        int ans = 1;
        while (n != 0) {
            if ((n & 1) == 1) {
                ans *= a;
            }
            n = n >> 1;
            a *= a;
        }
        return ans;
    }

}
