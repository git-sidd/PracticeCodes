public class green_to_red {
    public static void main(String[] args) {
        int arr[]={1 ,2 ,1 ,6, 2, 9};
        int odev[]=new int[arr.length];
        //red even
        //green odd
        //green->red =1

        
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                odev[i]=1;
            }else{
                odev[i]=-1;
            }
        }
        int count=0;
        for(int i=0;i<arr.length-1;i++){
            if(odev[i]==-1 && odev[i+1]==1){
                count++;
            }
        }
        System.out.println(count);
    }
}
