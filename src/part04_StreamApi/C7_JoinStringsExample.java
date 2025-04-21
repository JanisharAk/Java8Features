package part04_StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class C7_JoinStringsExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Apple", "Banana", "Cherry", "Date");

        String result = words.stream()
                .collect(Collectors.joining(","));

        System.out.println(result);  // Output: Apple,Banana,Cherry,Date
    }
}
