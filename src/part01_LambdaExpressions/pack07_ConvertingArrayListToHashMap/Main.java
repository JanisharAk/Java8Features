package part01_LambdaExpressions.pack07_ConvertingArrayListToHashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ArrayList<ListItems> list = new ArrayList<ListItems>();
        list.add(new ListItems(1, "Hello"));
        list.add(new ListItems(2,"I"));
        list.add(new ListItems(3,"am"));
        list.add(new ListItems(4,"Janishar"));

        // Map which will store the list element
        Map<Integer, String> map = new HashMap<>();
        // for (ListItems n : list) { map.put(n.getkey(),
        // n.getvalue()); }
        // the below lambda  performs the same task as the
        // above given for loop will do
        // put the list items in the Map
        list.forEach((n)-> {
            map.put(n.getkey(), n.getvalue()); });
        System.out.println(map);
    }
}