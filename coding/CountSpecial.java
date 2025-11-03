public class CountSpecial {
    public static void main(String[] args) {
        int arr[]={2,3,5,2,7,5,6};
        int count=0;
        int n=arr.length;
        for(int i=1;i<=n-2;i++){
            if(arr[i]==arr[i-1]+arr[i+1]){
                count++;
            }
        }
        System.out.println("count:"+count);

    }
}
