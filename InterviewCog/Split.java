import java.util.Arrays;

public class Split {
    public static void main(String[] args) {
        String str=" Siddhesh Is One of the Tallest boy, But he is the kindest ; Is is ?";
        String arr[]=str.split("[,;?]+");
        System.out.println(Arrays.toString(arr));
    }
}
