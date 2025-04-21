package part04_StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class C16_RemoveNullsEmptyStrings {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "", null, "banana", "  ", "orange", null);

        List<String> cleanList = list.stream()
                .filter(s -> s != null && !s.trim().isEmpty())
                .collect(Collectors.toList());

        System.out.println("Clean list: " + cleanList);
    }
}
