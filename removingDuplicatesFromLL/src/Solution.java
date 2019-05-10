import java.lang.reflect.Array;
import java.util.*;

public class Solution {


    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    LinkedList<Integer> ll = new LinkedList<>();
    String numbers = sc.nextLine();
    Scanner sc2 = new Scanner(numbers);
    while(sc2.hasNextInt()){
        ll.add(sc2.nextInt());
    }
    LinkedList<Integer> ll2 = removeDuplicates(ll);
    System.out.println(ll2);
    }

    private static LinkedList<Integer> removeDuplicates(LinkedList<Integer> ll) {
        Set<Integer> set = new HashSet<>(ll);
        ll.clear();
        ll.addAll(set);
        return ll;
    }



}
