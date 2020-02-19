//Linked List implementation.

public class LinkedList {

    Node Debut; // head of list


    static class Node {

        String data;
        Node Apres;

        // Constructor 
        Node(String d)
        {
            data = d;
            Apres = null;
        }
    }

    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, String data)
    {
        // Create a new node with given data 
        Node new_node = new Node(data);
        new_node.Apres = null;

        // If the Linked List is empty, 
        // then make the new node as head 
        if (list.Debut == null) {
            list.Debut = new_node;
        }
        else {
            // Else traverse till the last node 
            // and insert the new_node there 
            Node Fin = list.Debut;
            while (Fin.Apres != null) {
                Fin = Fin.Apres;
            }

            // Insert the new_node at last node 
            Fin.Apres = new_node;
        }

        // Return the list by head 
        return list;
    }

    // Method to print the LinkedList. 
    public static void Afficher(LinkedList list)
    {
        Node currNode = list.Debut;

        System.out.print("LinkedList: ");

        // Traverse through the LinkedList 
        while (currNode != null) {
            // Print the data at current node 
            System.out.print(currNode.data + " ");

            // Go to next node 
            currNode = currNode.Apres;
        }
    }

    // Driver code 
    public static void main(String[] args)
    {
        /* Start with the empty list. */
        LinkedList list = new LinkedList();

        // Insert the values 
        list = insert(list, "aaaaa");
        list = insert(list, "2");
        list = insert(list, "3");
        list = insert(list, "Said4");
        list = insert(list, "minia");
        list = insert(list, "6");
        list = insert(list, "06555");
        list = insert(list, "SkyLark");

        // Print the LinkedList 
        Afficher(list);
    }
} 