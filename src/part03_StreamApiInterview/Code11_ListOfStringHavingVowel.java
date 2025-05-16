package part03_StreamApiInterview;

import java.util.Arrays;
import java.util.List;

public class Code11_ListOfStringHavingVowel {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "try", "banana", "berry",
                "pineapple", "cry");
        List<String> list = words.stream()
                .filter(str -> str.matches(".*[aeiou].*"))
                .toList();
        list.forEach(System.out::println);

        // Option 2: Print directly (if you don't need the list)
//        words.stream()
//                .filter(str -> str.matches(".*[aeiou].*"))
//                .forEach(System.out::println);

    }
}
