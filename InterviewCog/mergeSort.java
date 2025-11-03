import java.util.Arrays;

public class mergeSort {
    public static void merge(int arr[],int l,int m,int r){
        int n1=m-l+1;
        int n2=r-m;

        int L[]=new int[n1];
        int R[]=new int[n2];

        for(int i=0;i<n1;i++){
            L[i]=arr[l+i];
        }
        for(int i=0;i<n2;i++){
            R[i]=arr[m+1+i];
        }
        int i=0,j=0,k=l;
        while(i<n1 && j<n2){
            if(L[i]<=R[j]){
                arr[k++]=L[i++];
            }else{
                arr[k++]=R[j++];
            }
        }
        while (i < n1) arr[k++] = L[i++];
        while (j < n2) arr[k++] = R[j++];
    }
    public static void mergesort(int arr[],int l,int r){
        if(l<r){
            int m=l+(r-l)/2;
            mergesort(arr, l, m);
            mergesort(arr, m+1, r);
            merge(arr, l, m, r);

        }
    }
    public static void main(String[] args) {
        int arr[]={1,8,9,6,4};
        int l=0,r=arr.length-1;
        mergesort(arr,l,r);
        System.out.println(Arrays.toString(arr));
    }
}
