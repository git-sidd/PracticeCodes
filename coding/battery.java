public class battery {
    public static void main(String[] args) {
        String s="HHCBHCHH";
        int k=2;
        int lft=0;
        int rt=0;

        int loc=s.indexOf('B');
        for(int i=loc;i>=0;i--){
            if(s.charAt(i)=='H' && k>=1){
                k=k-1;
                lft++;
            }
            if(s.charAt(i)=='C'){
                k=k+1;
            }
        }
        k=2;
        for(int i=loc;i<s.length();i++){
            
            if(s.charAt(i)=='H' && k>=1){
                k=k-1;
                rt++;
            }
            if(s.charAt(i)=='C'){
                k=k+1;
            }
        }
        System.out.println("lft:"+lft);
        System.out.println("rt:"+rt);
        int ans=lft+rt;
        System.out.println("ans:"+(ans));
    }
}
