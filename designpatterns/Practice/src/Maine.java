import java.util.HashSet;

public class Maine {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        System.out.println("Doubly Linked List Test");
        System.out.println("Insert at Start");
        list.insertDebut("Start_Node");
        list.Afficher();
        System.out.println("Insert at End");
        list.insertFin("ali");
        list.Afficher();
        System.out.println("Insert at Position");
        list.insertInPos(1, "said");
        list.insertInPos(2, "3");
        list.insertInPos(3, "4");
        list.Afficher();
        System.out.println("Deleting at Position 1");
        list.deleteInPos(1);
        list.Afficher();
        
    }
}