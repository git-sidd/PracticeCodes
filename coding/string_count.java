import java.util.LinkedHashMap;

public class string_count {
    public static void main(String[] args) {
        String s="aaabbcc";
        LinkedHashMap<Character,Integer>mpp=new LinkedHashMap<>();
        for(char i : s.toCharArray()){
            mpp.put(i,mpp.getOrDefault(i, 0)+1);
        }
        String ans="";
        for(char i:mpp.keySet()){
            ans=ans+i+mpp.get(i);
        }
        System.out.println(ans);
    }
}
