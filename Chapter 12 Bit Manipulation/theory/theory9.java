//count set bit in number (setbit=1). (number>=0)

public class theory9 {
    public static void main(String args[]) {
        System.out.println(countsetbit(15));
    }

    public static int countsetbit(int n) {
        int count = 0;
        while (n != 0) {
            if ((n & 1) == 1) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }
}

// tc O(logn+1 {log's base =2}).