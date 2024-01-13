package LinkedList;

import java.util.ArrayList;
import java.util.List;

public class ReverseLL {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
        l.add(7);
        Integer[] arr = l.toArray(new int[0]);
        List<Integer> s = l.subList(1, l.size());
        System.out.println(s);
        System.out.println(l.get(0));
    }
}
