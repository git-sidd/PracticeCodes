package cognizant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class libSorting {
    public static void main(String[] args) {
        String s="helco";
        String arr[]=s.split("");
        ArrayList<String>list=new ArrayList<>(Arrays.asList(arr));
        ArrayList<String>list1=new ArrayList<>(Arrays.asList(arr));
        Collections.sort(list);
        System.out.println(list);
        int count=0;
        for(int i=0;i<s.length();i++){
            if(list1.get(i)!=list.get(i)){
                count++;
            }
        }
        System.out.println(count);

    }
}
