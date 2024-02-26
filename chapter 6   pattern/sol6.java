import java.util.*;

public class sol6 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number");
        int num = sc.nextInt();
        int yagnik = 2;
        int space=2*num-2;
        for (int i = 1; i <= 2 * num; i++) {
            for (int j = 1; j <= yagnik; j++) {
               System.out.print("*");
               if(j==yagnik/2){
                  for(int k=1;k<=space;k++){
                    System.out.print(" ");
                  }
               }
            }
            if(i<num){
                yagnik+=2;
                space-=2;
            }
            else if(i==num){}
            else{
                yagnik-=2;
                space+=2;
            }
            System.out.println();
        }
    }
}
