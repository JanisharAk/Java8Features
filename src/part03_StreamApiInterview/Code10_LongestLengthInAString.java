package part03_StreamApiInterview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Code10_LongestLengthInAString {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "apple", "banana", "berry",
                "pineapple", "cherry", "papaya");

        // Best approach - uses ifPresent() and prints only once
        words.stream()
                .max(Comparator.comparing(String::length))
                .ifPresent(str -> System.out.println(str.toUpperCase()));
    }
}