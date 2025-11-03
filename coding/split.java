public class split {
    public static void main(String[] args) {
        String str[]={"0.6","0.7","0.6","0.7"};
        int n=str.length;
        String  strarr[]=new String[n];

        for(int i=0;i<n;i++){
            String num[]=str[i].split("\\.");
            strarr[i]=num[1];
        }
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(strarr[i]);
        }
        int mid=(int)Math.ceil(n/2);
        int lft=0;
        int rt=0;
        for(int i=0;i<mid;i++){
            lft+=arr[i];
        }
        for(int i=mid;i<n;i++){
            rt+=arr[i];
        }
        if(lft==rt){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
