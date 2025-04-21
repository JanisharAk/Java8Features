package part04_StreamApi;

import java.util.Arrays;
import java.util.List;

public class C6_SumWithReduce {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 10, 15, 20);

        int sum = numbers.stream()
                .reduce(0, (a, b) -> a + b); // identity = 0, accumulator = sum

        /*
        Method 2:
        int sum = numbers.stream(numbers).mapToInt(Integer::intValue).sum();
        System.out.println("Sum of numbers: " + sum);
         */
        System.out.println("Sum of numbers: " + sum);
    }
}
