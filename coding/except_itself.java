import java.util.ArrayList;

public class except_itself {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int lft=0;
        int rt=0;
        int i=0;
        int n=arr.length;
        ArrayList<Integer>list=new ArrayList<>();
        while(i<arr.length){
            if(i>0){
                for(int j=0;j<i;j++){
                    lft+=arr[j];
                }
            }
            if(i<n-1){
                for(int j=i+1;j<n ;j++){
                    rt+=arr[j];
                }
            }
            list.add(lft+rt);
            lft=0;
            rt=0;
            i++;
        }
        System.out.println(list);
    }
}
