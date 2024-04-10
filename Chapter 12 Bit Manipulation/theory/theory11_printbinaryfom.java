//print bionaryfom of number.

public class theory11_printbinaryfom {
  public static void main(String args[]) {
    System.out.println(binaryfom(32));
  }
  
  public static String binaryfom(int num) {
    StringBuilder sb = new StringBuilder("");
    if (num >= 0) {
      while (num != 0) {
        if ((num & 1) != 0) {
          sb.append("1");
        } else {
          sb.append("0");
        }
        num = num >> 1;
      }
      return reverseof(sb.toString());
    } else {
      while (num != -1) {
        if ((num & 1) != 0) {
          sb.append("1");
        } else {
          sb.append("0");
        }
        num = num >> 1;
      }

      return reverseof(sb.toString());
    }
  }

  public static String reverseof(String str) {
    String s = "";
    for (int i = str.length()-1; i >=0 ; i--) {
      s += (str.charAt(i));
    }
    return s;
  }
}