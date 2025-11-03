

public class len_freq {
    
    public static void main(String[] args) {
        int arr[]={2,2,1,2,3,3,3,4};
        int i=0;
        int count=0;
        int n=arr.length;
        while(i<n-1){
            int curr=arr[i];
            int len=0;
            while(arr[i]==curr){
                len++;
                i++;
            }
            if(len==curr){
                count++;
            }
        }  
        System.out.println(count);      
    }
}
