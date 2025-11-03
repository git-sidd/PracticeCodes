import java.util.Arrays;
import java.util.LinkedHashSet;

public class duplicate {
    public static void main(String[] args) {
        int num=16;
        int l=0;int h=num;int ans=0;
        while(l<=h){
            int mid=(l+h)/2;
            if(mid*mid==num){
                ans=mid;
                break;
            }
            else if(mid*mid<num){
                l=mid+1;
                ans=mid;
            }
            else{
                h=mid-1;
            }
        }
        System.out.println(ans);
        

    }
}
