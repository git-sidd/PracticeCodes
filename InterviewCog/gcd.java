import java.util.Collection;

public class gcd {
    public static int findgcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
        
    }
    public static void main(String[] args) {
        System.out.println(findgcd(45,85 ));
    }
}
