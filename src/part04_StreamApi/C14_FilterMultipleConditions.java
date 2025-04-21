package part04_StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class C14_FilterMultipleConditions {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Ankit");

        List<String> filtered = names.stream()
                .filter(name -> name.startsWith("A") || name.length() > 5)
                .collect(Collectors.toList());

        System.out.println("Filtered names: " + filtered);
    }
}
