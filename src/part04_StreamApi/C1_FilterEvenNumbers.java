package part04_StreamApi;

import java.util.Arrays;

public class C1_FilterEvenNumbers {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] num = Arrays.stream(numbers)
                .filter(i -> i%2==0)
                .toArray();
        System.out.println(Arrays.toString(num));
    }
}
