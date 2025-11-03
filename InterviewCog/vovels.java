public class vovels {
    public static void main(String[] args) {
        int count=0;
        String vowel="AEIOUaeiou";
        String str="Sidddhesh Patole";
        for(int i=0;i<str.length();i++){
            if(vowel.contains(String.valueOf(str.charAt(i)))){
                count++;
            }
        }
        System.out.println(count);
    }
}
