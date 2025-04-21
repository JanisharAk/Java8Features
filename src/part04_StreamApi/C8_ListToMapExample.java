package part04_StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class C8_ListToMapExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "kiwi", "orange");

        Map<String, Integer> wordLengthMap = words.stream()
                .collect(Collectors.toMap(
                        word -> word,         // key: the word itself
                        word -> word.length() // value: length of the word
                ));

        System.out.println(wordLengthMap);
    }
}
