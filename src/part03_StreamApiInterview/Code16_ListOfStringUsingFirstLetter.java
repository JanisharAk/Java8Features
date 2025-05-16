package part03_StreamApiInterview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Code16_ListOfStringUsingFirstLetter {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "try", "banana", "berry");

        Map<Character, List<String>> list = words.stream()
                .collect(Collectors.groupingBy(str -> str.charAt(0)));
        System.out.println(list);
    }
}
/*
output:  {a=[apple], b=[banana, berry], t=[try]}
 */