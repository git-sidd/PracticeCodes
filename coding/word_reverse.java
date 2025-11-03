import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class word_reverse {
    public static void main(String[] args) {
        String s="This Is My Yard";
        String arr[]=s.split(" ");
        ArrayList<String>list=new ArrayList<>(Arrays.asList(arr));
        Collections.reverse(list);
        String ans=" ";
        for(int i=0;i<list.size();i++){
            ans+=list.get(i)+" ";
        }
        System.out.println(ans.trim());
        
    }
}
