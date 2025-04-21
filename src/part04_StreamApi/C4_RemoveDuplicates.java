package part04_StreamApi;

import java.util.Arrays;

public class C4_RemoveDuplicates {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 3, 4, 5, 10};

        int[] num = Arrays.stream(numbers)  // Use Arrays.stream() for primitive arrays
                .distinct()
                .toArray();

        System.out.println(Arrays.toString(num));  // Prints: [1, 2, 3, 4, 5, 6, 10]
    }
}
