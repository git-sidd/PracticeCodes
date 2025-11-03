package cognizant;

public class decryptedString {
    public static void main(String[] args) {
        String s = "abcd";
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='a'){
                ans+='z';
            }
            else{
                ans+=(char)(s.charAt(i)-1);
            }
        }
        System.out.println(ans);
    }
}
