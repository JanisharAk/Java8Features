package part03_StreamApiInterview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Code13_ConvertToSingleString {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "try", "banana", "berry");

        words.stream()
                .collect(Collectors.joining(","));// we can use String.join(",", words);
        System.out.println(words);
    }

}
