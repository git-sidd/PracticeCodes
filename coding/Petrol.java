import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Petrol{
    public static void main(String[] args) {
        int n=5;
        int inter=3;
        int arr[]={1,2,3,4,5};
        int bin[]={0,1,1,0,1};
        
        for(int i=0;i<inter;i++){
            for(int j=0;j<n;j++){
                if(bin[j]==1){
                arr[j]*=2;
            }
            }
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}