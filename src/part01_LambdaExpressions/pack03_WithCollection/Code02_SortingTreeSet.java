package part01_LambdaExpressions.pack03_WithCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class Code02_SortingTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        TreeSet<Integer> set1 = new TreeSet<>((a, b) -> b - a);
        TreeSet<Integer> set2 = new TreeSet<>(Collections.reverseOrder());

        set.add(12);
        set.add(19);
        set.add(24);
        set.add(55);
        set.add(36);
        set.add(97);
        System.out.println(set);// treeSet is already sorted.

        set1.add(12);
        set1.add(19);
        set1.add(24);
        set1.add(55);
        set1.add(36);
        set1.add(97);
        System.out.println(set1);

        set2.add(12);
        set2.add(19);
        set2.add(24);
        set2.add(55);
        set2.add(36);
        set2.add(97);
        System.out.println(set2);

        ArrayList<String> list = new ArrayList<>();
        list.add("Banana");
        list.add("Apple");
        list.add("Mango");
        list.add("Cherry");
        list.add("Grapes");
        System.out.println(list);

        // Sorting using Lambda Expression (Ascending Order)
        list.sort((s1, s2) -> s1.compareTo(s2));
       // list.sort(String::compareTo);

        System.out.println("After sorting in ascending order: " + list);


    }
}
