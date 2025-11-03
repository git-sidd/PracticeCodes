public class armstrong {
    public static void main(String[] args) {
        int num=153;
        int n=String.valueOf(num).length();
        int sum=0;
        while(num>0){
            int lst=num%10;
            sum+=Math.pow(lst, n);
            num/=10;
        }
        if(sum==num){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
