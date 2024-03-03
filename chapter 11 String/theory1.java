//check if string is palindrome or not.

//tc  O(n) and sc is O(1).
public class theory1{
    public static boolean palindrome(String str){
        for (int i = 0; i < str.length()/2; i++) {
                 if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                          return false;
                 }
        }
        return true;
    }
public static void main(String args[]){   
          System.out.println("your string is palindrome "+palindrome("racecar"));
}
}