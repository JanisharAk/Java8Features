package part03_StreamApiInterview;

import java.util.Arrays;
import java.util.List;

public class Code07_LengthOfEveryElement {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "apple", "banana", "berry",
                "cherry", "pineapple", "papaya");
        words.stream()
                .map(str -> str.length()) // (String::length)
                .forEach(str -> System.out.print(str + " "));
    }
}
