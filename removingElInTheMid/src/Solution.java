import org.w3c.dom.Node;

import java.util.Scanner;

public class Solution {



    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        LinkedList ll = new LinkedList();
        String numbers = sc.nextLine();
        Scanner sc2 = new Scanner(numbers);
        while(sc2.hasNextInt()){
            ll.head = new LinkedList.Node(sc2.nextInt(), ll.head);
        }

        ll.removeMidEl();
        ll.printList(ll.head);
    }


}
