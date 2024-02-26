// number is prime or not

public class extra{
    public static void fun(int a){
             if(a==1||a==2){
                System.out.println("prime");
             }
             else{
                int i;
                for( i=2;i<a;i++){
                    if(a%i==0){
                        break;
                    }
                }
                if(a==i){
                  System.out.println("prime");
                }
                else{
                    System.out.println("not prime");
                }
             }
    }
    
public static void main(String args[]){   
        fun(3);

    }
}