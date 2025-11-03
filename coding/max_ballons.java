public class max_ballons {
    public static void main(String[] args) {
        int arr[]={4,6,2,7};
        int n=arr.length;
        int cost[]={5,3,1,6};
        int budget=8;
        int maxb=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(cost[i]+cost[j]<=budget){
                    maxb=Math.max(maxb, arr[i]+arr[j]);
                }
            }
        }
        System.out.println(maxb);

    }
}
