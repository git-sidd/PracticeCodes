public class reduce_count {
    public static int calculate(int n) {
        int sum=0;
        if(sum>0 && sum<=9){
            return sum;
        }
        while(n>0){
            int lst=n%10;
            sum+=lst;
            n=n/10;
        }
        if(sum>=10){
           return calculate(sum);
        }
        return sum;
       
    }
    public static void main(String[] args) {
        int n = 88;
        
        System.out.println(calculate(n));
        

    }
}
