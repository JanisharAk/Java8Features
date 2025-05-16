package part03_StreamApiInterview;

import java.util.Arrays;
import java.util.List;

public class COde15_NotEmptyNotNullString {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "try", " ", "banana", "null");

        words.stream()
                .filter(str -> str != "null" && str != " ")
                .forEach(System.out::println);
    }
}
