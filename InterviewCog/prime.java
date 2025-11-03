public class prime {
    public static boolean isPrime(int n){
        if(n<2)return false;
        if(n==2)return false;
        if(n%2==0)return false;

        for(int i=3;i*i<=n;i+=2){
            if(n%i==0)return false;
        }
        return true;
    }
    public static void main(String[] args) {
        if(isPrime(7)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
