package part04_StreamApi;

import java.util.Arrays;
import java.util.List;

public class C18_PartitionEvenOdd {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> evenNumbers = numbers.stream()
                .filter(i -> i%2==0)
                .collect(java.util.stream.Collectors.toList());


        List<Integer> oddNumbers = numbers.stream()
                .filter(i -> i%2!=0)
                .collect(java.util.stream.Collectors.toList());
        System.out.println("Even numbers: " + evenNumbers);
        System.out.println("Odd numbers: " + oddNumbers);
    }
}
