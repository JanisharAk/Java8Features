package part03_StreamApiInterview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Code08_sortElementInIncereaingOrder {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "apple", "banana", "berry",
                 "pineapple", "cherry", "papaya");
        List<String> list = words.stream()
                .sorted((a,b) -> a.length() - b.length())
                .collect(Collectors.toList());
        System.out.println(list);

    }
}
