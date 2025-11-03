import java.util.Arrays;

class char_rev{
    //: sentence rev
    // public static void main(String[] args) {
    //     String str="Hello World";
    //     String rev=new StringBuilder(str).reverse().toString();
    //     System.out.println(rev);
    // }
    //: word rev keeping position same
    // public static void main(String[] args) {
    //     String str="Hello World";
    //     String ans="";
    //     String arr[]=str.split(" ");
    //     for(String word:arr){
    //         ans+=new StringBuilder(word).reverse().toString()+" ";
    //     }
    //     System.out.println(ans.trim());
    // }

    //: word rev 
    // public static void main(String[] args) {
    //     String str="Hello Siddhesh";
    //     String arr[]=str.split(" ");
    //     String ans="";
    //     for(int i =arr.length-1;i>=0;i--){
    //         ans+=arr[i]+" ";
    //     }
    //     System.out.println(ans.trim());
    // }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            // Last i elements are already in place
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

}
}