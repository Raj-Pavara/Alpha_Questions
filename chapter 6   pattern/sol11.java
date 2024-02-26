import java.util.*;

public class sol11 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number");
        int n = sc.nextInt();
        int space = n - 1;
        int z = 1;
        int ans;
        for (int i = 1; i <= n; i++) {
            ans=i;
            for (int k = 1; k <= space; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= z; j++) {
                System.out.print(ans);
                if(j<(z+1)/2){
                     ans--;
                }
                else{
                    ans++;
                }
            }
            space--;
            z += 2;
            System.out.println();
        }

    }
}