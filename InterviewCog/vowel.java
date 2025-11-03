public class vowel {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static void add(){
        int arr[]={1,2,3,4,6};
        Node head=new Node(arr[0]);
        Node curr=head;
        for(int i=1;i<arr.length;i++){
            curr.next=new Node(arr[i]);
            curr=curr.next;
        }
        Node temp=head;
        while (temp!=null) {
            System.out.println(temp.data);
            temp=temp.next;
        }

    }
    public static void main(String[] args) {
        vowel v1=new vowel();
        v1.add();
    }
}
