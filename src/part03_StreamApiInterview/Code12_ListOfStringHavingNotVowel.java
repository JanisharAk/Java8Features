package part03_StreamApiInterview;

import java.util.Arrays;
import java.util.List;

public class Code12_ListOfStringHavingNotVowel {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "try", "banana", "berry",
                "pineapple", "cry");
        List<String> list = words.stream()
                .filter(str -> !str.matches(".*[aeiou].*"))
                .toList();
        list.forEach(System.out::println);
    }
}
