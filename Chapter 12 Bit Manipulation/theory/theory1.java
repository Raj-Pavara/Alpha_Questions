//check the num is odd or even using bitwise oprator

public class theory1 {
    public static void main(String args[]) {
        int num = 45;
        if ((num&1) == 1) {
            System.out.println("your number is odd");
        } else if ((num & 1) == 0) {
            System.out.println("your number is even");
        }
    }
}