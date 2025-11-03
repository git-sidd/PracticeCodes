import java.util.Arrays;

public class selectionSort{

    public static void selection(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int minInd=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minInd]){
                    minInd=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minInd];
            arr[minInd]=temp;
        }
    }
    public static void main(String[] args) {
        int arr[]={4,3,6,1,9,7,5};
        selection(arr);
        
        System.out.println(Arrays.toString(arr));

    }
}