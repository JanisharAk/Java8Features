package part04_StreamApi;

import java.util.Arrays;
import java.util.List;

public class C10_SecondHighest {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 30, 50, 20, 40);

        int secondHighest = numbers.stream()
                .distinct()
                .sorted((a, b) -> b - a)
                .skip(1)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("No second highest found"));

        System.out.println("Second highest: " + secondHighest);

    }
}
