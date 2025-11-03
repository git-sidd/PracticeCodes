public class divby3 {
    public static void main(String[] args) {
        String str="180";
        int num=Integer.parseInt(str);
        int sum=0;
        while(num>0){
            int lst=num%10;
            sum+=lst;
            num=num/10;
        }
        if(sum%3==0){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
