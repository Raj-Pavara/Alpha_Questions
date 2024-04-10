import java.util.concurrent.CountDownLatch;

//Convert uppercase characters to lowercase using bits.

public class sol4 {
    public static void main(String args[]) {
        System.out.println(converter('F'));
    }

    public static char converter(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
             return (char)(ch|32);
        }
        else{
            System.out.println("your input is wrong");
            return ' ';
        }
    }
}