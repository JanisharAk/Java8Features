package part01_LambdaExpressions.part09_StreamApi;

import java.util.Arrays;
import java.util.List;

public class Code03_PrimeNumber {

    public static void main(String[] args) {
        Code03_PrimeNumber obj = new Code03_PrimeNumber();
        obj.printPrime();
    }

    public boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void printPrime() {
        List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10, 11, 12, 13, 14, 15);
        boolean containsPrime = numbers.stream()
                .anyMatch(this::isPrime); // Using instance method reference
        System.out.println("List contains a prime number: " + containsPrime);
    }
}
