package part03_StreamApiInterview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Code04_StringWithoutCharacterA {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "apple", "banana", "berry",
                "cherry", "pineapple", "papaya");
        //  Question:  Filter by words that string doesn't contains e character 'a' witing it

        List<String> list = words.stream()
                .filter(str -> !str.contains("a"))
                .collect(Collectors.toList());
        System.out.println(list);
    }
}
