//last i bit hoy te badhi 0 karo.

public class theory6_clearlastibits {
    public static void main(String args[]) {
          int num=7;
          num=clearlastibits(num, 2);
          System.out.println(num);
    }

    public static int clearlastibits(int num, int i) {
               return num&(-1<<(i));
    }
}