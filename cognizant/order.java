package cognizant;

import java.util.HashMap;
import java.util.LinkedHashSet;

public class order {
    public static void main(String[] args) {
        String s="abcabc";
        int n=s.length();
        LinkedHashSet<Character>set=new LinkedHashSet<>();
        HashMap<Character,Integer>mpp=new HashMap<>();
        for(int i=0;i<n;i++){
            set.add(s.charAt(i));
        }
        int ind=1;
        for(char i :set){
            mpp.put(i,ind);
            ind++;
        }
        System.out.println(mpp);
        String ans="";
        for(int i=0;i<n;i++){
            if(i<=n-2){
                ans+=String.valueOf(s.charAt(i)).repeat(mpp.get(s.charAt(i)))+"-";
            }
            else{
                ans+=String.valueOf(s.charAt(i)).repeat(mpp.get(s.charAt(i)));
            }
        }
        System.out.println(ans);
    }
}
