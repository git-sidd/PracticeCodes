public class jump {
    public static void main(String[] args) {
        int arr[]={1,2,4,5,8};
        int target=5;

        int i=0;
        int x=-1;
        while(i<arr.length && i>=0){
            if(arr[i]<target){
                i=i+arr[i];
            }
            else if(arr[i]>target ){
                i=i-arr[i];
            }
            else{
                x=1;
                break;
            }
        }
        if(x==1){
            System.out.println("Element Found");
        }else{
            System.out.println("-1");
        }
    }
}
