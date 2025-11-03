package cognizant;


import java.util.Arrays;


public class MinSum {
    public static void main(String[] args) {
        int n=4;
        int arr1[]={1,4,3,2};
        int arr2[]={1,4,3,4};
        
        int minimum_sum=0;
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for(int i=0;i<n/2;i++){
            int temp=arr2[i];
            arr2[i]=arr2[n-1-i];
            arr2[n-1-i]=temp;
        }
        for(int i=0;i<n;i++){
            minimum_sum+=arr1[i]*arr2[i];
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(minimum_sum);



    }
}
