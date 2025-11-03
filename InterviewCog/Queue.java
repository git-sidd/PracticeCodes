public class Queue {
    private int arr[];
    private int capacity,size,front,rear;

    public Boolean isFUll(){
        if(size==capacity)return true;
        return false;
    }

    public Boolean isEmpty(){
        if(size==0){
            return true;
        }
        return false;
    }

    public Queue(int capacity){
        this.capacity=capacity;
        arr=new int[capacity];
        front=0;
        size=0;
        rear=-1;
    }

    public int addElem(int elem){
        if(isFUll()){
            System.out.println("Cant Add Element..Queue is Full");
        }
        rear=rear+1;
        arr[rear]=elem;
        size++;
        return elem;
    }
    public int delElem(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
        }
        int value=arr[front];
        front=front+1;
        size--;
        return value;
        
    }
    public void display(){
        for(int i=0;i<size;i++){
            System.out.print(arr[front+i]+" ");
        }
    }
    public static void main(String[] args) {
        Queue q=new Queue(5);
        q.addElem(10);
        q.addElem(20);
        q.addElem(30);
        q.addElem(40);
        q.addElem(50);
        
        q.delElem();
        q.display();
    }
}
