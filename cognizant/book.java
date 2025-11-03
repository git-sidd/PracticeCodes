package cognizant;

public class book {
    public static boolean isPrime(int n){
        if(n<2)return false;
        
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int n=4;
        int k=5;
        int arr[]={3, 7, 5, 6};
        int sum=0;
        for(int i=0;i<n;i++){
            if(isPrime(i)){
                if(arr[i]<k){
                    sum+=arr[i];
                }
                else{
                    sum+=k;
                }
            }
        }
        System.out.println(sum);


    }
}
