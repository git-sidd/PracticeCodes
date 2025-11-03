import java.util.Arrays;

public class bubbleSort {
    public static void bubblesort(int arr[]) {
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={5,6,7,1,2,9,4,3};
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));
    }
  
}
