import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> ll = new LinkedList<>();
        String numbers = sc.nextLine();
        Scanner sc2 = new Scanner(numbers);
        while(sc2.hasNextInt()){
            ll.add(sc2.nextInt());
        }
        int k = sc.nextInt();
        System.out.println(ll);
        System.out.println(k);
        int kThElem = findTheKthElem(ll, k);
        System.out.println(kThElem);

    }
    private static int findTheKthElem(LinkedList<Integer> ll, int k){
        int numFromBeg= ll.size() - k + 1;
        int result = 0;
        int count = 0;
        for (int num : ll){
            count ++;
            if (count == numFromBeg){
                result = num;
            }
        }
        return result;

    }

}
