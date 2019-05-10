public class LinkedList {
    public ListNode head;

    public void print() {
        ListNode cur = head;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }

        System.out.println();
    }

    public LinkedList reverseCopy() {
        LinkedList list = new LinkedList();
        ListNode cur = head;
        while (cur != null) {
            list.head = new ListNode(cur.data, list.head);
            cur = cur.next;
        }

        return list;
    }
}
