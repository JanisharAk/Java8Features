package part03_StreamApiInterview;

import java.util.Arrays;
import java.util.List;

public class Code06_ContainingPInTheFirst {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "apple", "banana", "berry",
                "cherry", "pineapple", "papaya");

        List<String> list = words.stream()
                .filter(str -> str.startsWith("p"))
                .toList();
        System.out.println(list);
    }
}
