import java.util.ArrayList;

public class max_levels {
    public static void main(String[] args) {
        int n=18;
        int x=0;
        ArrayList<Integer>list=new ArrayList<>();
        ArrayList<Integer>ans=new ArrayList<>();

        while(n>0){
            for(int i=0;i<n;i++){
                x=(int)Math.pow(2,i);
                if(x<=n){
                    list.add(x);
                }else{
                    break;
                }
                
            }

            ans.add(list.get(list.size()-1));
            
            x=0;
            n=n-list.get(list.size()-1);

        }
        String str="";
        for(int i=0;i<ans.size();i++){
            str+=ans.get(i);
            System.out.println(str);
        }
        System.out.println(ans);
        System.out.println(str);
    }
}
