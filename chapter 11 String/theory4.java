//string compression.
//tc O(n )  sc O(n)

public class theory4 {
    public static void main(String args[]) {
        System.out.println(compresioin("aaabbbcddd"));
    }

    public static String compresioin(String str) {
        int count = 1;
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            while (  i  < str.length()-1) {
                if(str.charAt(i) != str.charAt(i + 1)){
                    break;
                }
                count++;
                i++;
            }
            if (count > 1) {
                sb.append(count);
            }
            count=1;
        }
        return sb.toString();

    }
}