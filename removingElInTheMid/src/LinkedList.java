import java.util.Scanner;


public class LinkedList {

    public Node head;
    public static class Node{
        int data;
        Node next;

        Node(int d, Node n){
            data = d;
            next = n;

        }

    }

    public void removeMidEl(){
        head.next = head.next.next;

    }

    public void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }


}
