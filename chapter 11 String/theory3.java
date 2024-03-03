//convert each letter of string to uppercase.

public class theory3 {
    public static void main(String args[]) {
     System.out.println(uppercase("my name is raj pavara  "));
    }

    public static String uppercase(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(Character.toUpperCase(str.charAt(0)));
        for (int i = 1; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (i != str.length() - 1 && str.charAt(i) == ' ') {
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
        }
        return sb.toString();
    }
}

//tc O(n) sc O(n). 