package part01_LambdaExpressions.pack03_WithCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Code01_UseLambdaInPlaceOfComparator {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(205);
        list.add(20);
        list.add(30);
        list.add(97);
        list.add(99);

        System.out.println("Elements in al before sorting: " + list);

//        We use here sorted() to sort the stream and collect as a List
//        List<Integer> sortedList = list.stream()
//                .sorted()
//                .collect(Collectors.toList());
//
//        // Convert to ArrayList explicitly if needed
//        ArrayList<Integer> list1 = new ArrayList<>(sortedList);
//
//        System.out.println("Elements in list after sorting: " + list1);



        // using lambda expression in place of comparator object
        Collections.sort(list, (a, b) -> (a > b) ? 1 :
                (a < b) ? -1 : 0);

        System.out.println("Elements of the ArrayList after" + " sorting : " + list);


    }
}
