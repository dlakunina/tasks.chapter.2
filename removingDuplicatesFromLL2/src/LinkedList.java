import java.util.Scanner;


public class LinkedList {

    private Node head;
    static class Node{
        int data;
        Node next;

        Node(int d, Node n){
            data = d;
            next = n;

        }

    }



    private void removeDuplicates() {
        Node pointer1;
        Node pointer2;
        pointer1 = head;
        while (pointer1 != null && pointer1.next!= null){
            pointer2 = pointer1;
            while(pointer2.next!=null){
                if (pointer1.data == pointer2.next.data){
                    pointer2.next = pointer2.next.next;
                }else {
                    pointer2 = pointer2.next;
                }
            }
            pointer1 = pointer1.next;
        }

    }

    void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        LinkedList ll = new LinkedList();
        String numbers = sc.nextLine();
        Scanner sc2 = new Scanner(numbers);
        while(sc2.hasNextInt()){
            ll.head = new Node(sc2.nextInt(), ll.head);
        }

        ll.removeDuplicates();
        ll.printList(ll.head);
    }

}
