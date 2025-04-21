package part04_StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class C17_StreamPeekDebugging {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);

        List<Integer> result = numbers.stream()
                .peek(i -> System.out.println("Original: " + i))
                .map(i -> i * 2)
                .peek(i -> System.out.println("Doubled: " + i))
                .collect(Collectors.toList());

        System.out.println("Final list: " + result);
    }
}
