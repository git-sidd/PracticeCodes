public class string_rev {
    public static void main(String[] args) {
        String str="I Love Coding";
        String arr[]=str.split(" ");
        System.out.println(arr);
        String ans="";
        for(int i=0;i<arr.length;i++){
            String word="";
            for(int j=arr[i].length()-1;j>=0;j--){
                word+=arr[i].charAt(j);
                
            }
            ans+=word+" ";
        }
        System.out.println(ans);
        
    }
}
