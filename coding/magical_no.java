public class magical_no {
    public static void main(String[] args) {
        int m=3;
        int n=3;
        int count=0;
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0;i<m;i++){
            int sum=0;
            for(int j=0;j<n;j++){
                if(arr[i][j]%2!=0){
                    sum+=arr[i][j];
                }
            }
            if(sum%2==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
