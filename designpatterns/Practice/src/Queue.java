//Queue implementation.

public class Queue {
    private String[] arr;
    private int front;
    private int back;
    private int capacity;
    private int current_size;

    Queue(int size){
        arr=new String[size];
        capacity=size;
        front=0;
        back=-1;
        current_size=0;
    }
    boolean isFull(Queue Q){
        return (Q.current_size == Q.capacity);
    }

    boolean isEmpty(Queue Q){
        return(Q.current_size==0);
    }

    void add_elt(Queue Q,String elt){
        if (isFull(Q)){
            System.out.println("queue is full can't add *"+elt+"*anymore.");
            return;
        }
        this.back=(this.back+1)%this.capacity;
        this.arr[this.back]=elt;
        this.current_size++;
        System.out.println("The element :*"+elt+"* has been added to the queue");
    }

    String delete_elt(Queue Q){
        if(isEmpty(Q)){
            System.out.print("already empty");
            return "";
        }
        String elt = this.arr[this.front];
        front = (front + 1) % this.capacity;
        this.current_size--;
        return ("The element :*"+elt+"* has been deleted from queue");

    }

    String getFront(Queue Q){
        if (isEmpty(Q)){
            System.out.println("it's an empty queue");
            return "";
        }
        return("front of queue is :"+this.arr[this.front]);
    }
    String getBack(Queue Q){
        if (isEmpty(Q)){
            System.out.println("it's an empty queue");
            return "";
        }
        return("back of queue is :"+this.arr[this.back]);
    }
}
class Test{
    public static void main(String[] args){
        Queue Q=new Queue(7);

        Q.add_elt(Q,"ali");
        Q.add_elt(Q,"said");
        Q.add_elt(Q,"yassine");
        Q.add_elt(Q,"ihab");
        Q.add_elt(Q,"skylark");
        Q.add_elt(Q,"12a");
        Q.add_elt(Q,"technopark");

        System.out.println(Q.getFront(Q));
        System.out.println(Q.getBack(Q));

        System.out.println(Q.delete_elt(Q));

        System.out.println(Q.getFront(Q));
        System.out.println(Q.getBack(Q));
        Q.add_elt(Q,"jack");
        Q.add_elt(Q,"ssssss");
    }
}