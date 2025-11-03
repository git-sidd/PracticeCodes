package cognizant;

public class password {
    public static void main(String[] args) {
        String s="bbbb";
        int dist=0;
        int n=s.length();
        int l=0;
        int r=n-1;
        while(l<r){
            if(s.charAt(l)==s.charAt(r)){
                r--;
            }else{
                dist=Math.abs(r-l);
                break;
            }
        }
        System.out.println(dist);
    }
}
