package part01_LambdaExpressions.part09_StreamApi;

import java.util.Arrays;
import java.util.List;

public class Code02_LongestString {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "grapefruit");
        String longestString = strings.stream().max(String::compareTo).get();
        System.out.println(longestString);
    }
}
