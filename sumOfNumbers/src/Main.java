import java.util.Scanner;

public class Main {

    //if the flag is true, that's the 6th task
    //if it's false, that's the 5th task
    private static boolean directDigitOrder = true;

    private static LinkedList loadList(String listAsString) {
        LinkedList revList = new LinkedList();

        Scanner sc2 = new Scanner(listAsString);
        while (sc2.hasNextInt()) {
            revList.head = new ListNode(sc2.nextInt(), revList.head);
        }

        return revList.reverseCopy();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedList firstNumberList = loadList(sc.nextLine());
        LinkedList secondNumberList = loadList(sc.nextLine());

        System.out.print("The first list: ");
        firstNumberList.print();
        System.out.print("The second list: ");
        secondNumberList.print();

        if (directDigitOrder) {

            firstNumberList = firstNumberList.reverseCopy();
            secondNumberList = secondNumberList.reverseCopy();
        }

        LinkedList sumList = sum(firstNumberList, secondNumberList);

        if (directDigitOrder) {
            sumList = sumList.reverseCopy();
        }

        System.out.print("The sum list: ");
        sumList.print();
    }

    private static LinkedList sum(LinkedList first, LinkedList second) {
        LinkedList resList = new LinkedList();
        ListNode resNode = null;

        ListNode firstListNode = first.head;
        ListNode secondListNode = second.head;

        int carry = 0;


        while (true) {
            if (firstListNode == null && secondListNode == null && carry == 0)
                return resList;

            int sum = carry;
            if (firstListNode != null) {
                sum += firstListNode.data;
                firstListNode = firstListNode.next;
            }
            if (secondListNode != null) {
                sum += secondListNode.data;
                secondListNode = secondListNode.next;
            }
            carry = sum / 10;

            ListNode newResNode = new ListNode(sum % 10, null);
            if (resNode == null) {
                resList.head = newResNode;
                resNode = resList.head;
            } else {
                resNode.next = newResNode;
                resNode = resNode.next;

            }

        }
    }
}
