package part04_StreamApi;

import java.util.HashMap;
import java.util.Map;

public class C13_SortMapByValue {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 30);
        map.put("C", 20);

        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(entry -> System.out.println(entry.getKey() + " = " + entry.getValue()));
    }
}
