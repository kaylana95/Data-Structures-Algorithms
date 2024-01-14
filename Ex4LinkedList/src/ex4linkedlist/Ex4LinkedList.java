package ex4linkedlist;

import java.util.Scanner;

public class Ex4LinkedList {

    public static void main(String[] args) {
        //If both the head and tail are null, the entire linked list would be empty
        Node head = null;
        Node tail = null;

        //Adding the first node means that both the head and tail point to it
        // head -> "Chicago" <- tail
        head = new Node("Chicago");
        tail = head;

        //To create a second node (as soon as we create a new node, we move the tail to it)
        //head -> "Chicago", next -> "Denver" <- tail, next -> null
        tail.next = new Node("Denver");
        tail = tail.next;

        tail.next = new Node("Dallas");
        tail = tail.next;

        //Displaying all nodes
        Node current = head; //this node copies the data in all the other nodes to be displayed

        while (current != null) {
            System.out.println(current.myElement);
            current = current.next;
        }

        //Asking the user to enter new values, then displaying all nodes
        Scanner sc = new Scanner(System.in);
        
        System.out.println();
        
        System.out.print("Please enter a value (enter 0 to quit): ");
        String input = sc.nextLine();

        while (!(input.equals("0"))) {
            if (head == null) {
                head = new Node(input); 
                tail = head;
            } else {
                tail.next = new Node(input);
                tail = tail.next;
            }

            System.out.print("Please enter a value (enter 0 to quit): ");
            input = sc.nextLine();
        }
        
        current = head;

        while (current != null) {
            System.out.println(current.myElement);
            current = current.next;
        }
    }
}

//A class that creates a node
class Node {

    //All java classes inherit Object and Node
    Object myElement;
    Node next; //space used for creating the next node

    //Constructor
    public Node(Object mE) {
        myElement = mE;
    }
}
