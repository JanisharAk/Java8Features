package part03_StreamApiInterview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Code18_LenghtOfEachElementString {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "try", "banana", "berry");

        Map<Integer, List<String>> map = words.stream()
                .collect(Collectors.groupingBy(str-> str.length()));
        System.out.println(map);
    }
}
/*
Output : {3=[try], 5=[apple, berry], 6=[banana]}
 */