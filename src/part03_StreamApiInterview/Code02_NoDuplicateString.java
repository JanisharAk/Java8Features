package part03_StreamApiInterview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Code02_NoDuplicateString {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "apple", "banana", "berry",
                "cherry", "pineapple", "papaya");
        List<String> words1 = words.stream()
                .distinct()
                .collect(Collectors.toList());//we can use toList();
        words1.forEach(str -> System.out.print(str + " "));
    }
}
