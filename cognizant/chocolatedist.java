package cognizant;

public class chocolatedist {
    public static void main(String[] args) {
        int n=3;
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        int total=((int)n/5)*2*2;
        System.out.println(sum+total);
    }
}   
