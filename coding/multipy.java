public class multipy {
    public static void main(String[] args) {
        //124=100*20*4
        int n=124;
        int z=1;
        int ans=1;
        int lst=0;
        while(n>0){
            lst=n%10;
            ans*=lst*z;
            z=z*10;
            n=n/10;
        }
        System.out.println(ans);
    }
}
