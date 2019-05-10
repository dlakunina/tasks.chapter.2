import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Solution {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> ll = new LinkedList<>();
        String numbers = sc.nextLine();
        Scanner sc2 = new Scanner(numbers);
        while (sc2.hasNextInt()) {
            ll.add(sc2.nextInt());
        }
        int i = sc.nextInt();
        System.out.println(ll);
        System.out.println(i);
        System.out.println(devideThelist(ll, i));
    }

    private static LinkedList devideThelist(LinkedList<Integer> ll, int i) {
        LinkedList resultingList = new LinkedList();
        for (int num : ll) {
            if (num < i) {
                resultingList.addFirst(num);
            }
            if (num >= i) {
                resultingList.addLast(num);
            }
        }
        return resultingList;
    }
}
