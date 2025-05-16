package part03_StreamApiInterview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Code09_CompareTo {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "apple", "banana", "berry",
                "pineapple", "cherry", "papaya");

        List<String> sortedWords = words.stream()
                .sorted(Comparator.comparing(String::length))
                .collect(Collectors.toList());

        System.out.println(sortedWords);

        //printing in reverse order
//        List<String> sortedWords = words.stream()
//                .sorted(Comparator.comparing(String::length).reversed())
//                .collect(Collectors.toList());
    }
}