
//Stack implementation.

public class Stack {
    int top_value;
    String[] arr =new String[10];
    Stack(){
        this.top_value=-1;
    }
    void push(String elt) {
        if (this.top_value == 9) {
            System.out.println("Stack is already full");
        }
        this.top_value=this.top_value+1;
        this.arr[top_value] = elt;
        System.out.println(elt+" est ajouté");
    }
    String pop(){
            if(top_value<0){
                System.out.println("it's already empty");
                return "";
            }else{
                return(arr[top_value--]+" est supprimée");
            }
    }
}
class Test2{
    public static void main(String[] args){
        Stack S=new Stack();
        for (int i=0;i<10;i++){
            S.push(Integer.toString(i));
        }

        System.out.println(S.pop());
    }

}
