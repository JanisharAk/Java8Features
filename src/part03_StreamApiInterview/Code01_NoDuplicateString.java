package part03_StreamApiInterview;

import java.util.Arrays;
import java.util.List;

public class Code01_NoDuplicateString {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "apple", "banana", "berry",
                "cherry", "pineapple", "papaya");
        words.stream()
                .distinct()
                .forEach(System.out::println);

    }

}
