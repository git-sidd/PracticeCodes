class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class kthElemLL {
    public static int kth_node(Node head,int k){
        Node curr=head;
        int count=0;
        while(curr!=null){
            if(count==k-1){
                return curr.data;
            }
            count++;
            curr=curr.next;

        }

        return 0;
    }
    public static void main(String[] args) {
        Node head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);
        head.next.next.next.next=new Node(50);
        System.out.println(kth_node(head, 3));

    }
}
