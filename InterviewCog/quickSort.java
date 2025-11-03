import java.util.Arrays;

public class quickSort{
    public static int partition(int arr[],int l,int r){
        int ind=l-1;
        int pivot=arr[r];

        for(int i=l;i<r;i++){
            if(arr[i]<=pivot){
                ind++;
                int temp=arr[i];
                arr[i]=arr[ind];
                arr[ind]=temp;
            }
        }
        ind++;
        int temp=arr[ind];
        arr[ind]=arr[r];
        arr[r]=temp;



        return ind;
    }

    public static void quicksort(int arr[],int l,int r){
        if(l<r){
            int pi=partition(arr,l,r);
            quicksort(arr, 0, pi-1);
            quicksort(arr, pi+1, r);
        }
    }
    public static void main(String[] args) {
        int arr[]={5,6,8,1,2,9,7,6};
        quicksort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}