package cognizant;

import java.util.Arrays;

public class book_reading {
    public static void main(String[] args) {
        int arr[]={4,2,3,1};
        int h=6;
        Arrays.sort(arr);
        int count=0;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum<=h){
                count++;
            }else{
                break;
            }
        }
        System.out.println(count);
    }
}
