package part01_LambdaExpressions.part09_StreamApi.part02;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Code02_SumOfTransactionAmounts {

    public static void main(String[] args) {
        List<Code01_Transaction> transactions = Arrays.asList(
                new Code01_Transaction("2022-01-01", 100),
                new Code01_Transaction("2022-01-01", 200),
                new Code01_Transaction("2022-01-02", 300),
                new Code01_Transaction("2022-01-02", 400),
                new Code01_Transaction("2022-01-03", 500));

        // Compute the sum of all transaction amounts
        int totalAmount = transactions.stream()
                .mapToInt(Code01_Transaction::getAmount)
                .sum();

        System.out.println("Total transaction amount: " + totalAmount);

        System.out.println("===============================");

        // Compute the average of the transaction amounts
        OptionalDouble avgAmount = transactions.stream()
                .mapToInt(Code01_Transaction::getAmount)
                .average();
        System.out.println("Average transaction amount: " + avgAmount.getAsDouble());

        // Print the average if present
//        if (avgAmount.isPresent()) {
//            System.out.println("Average transaction amount: " + avgAmount.getAsDouble());
//        } else {
//            System.out.println("No transactions available.");
//
//        }
        System.out.println("===============================");

        // Compute the Lagest amount of an transaction amounts
        int largestAmount = transactions.stream()
                .mapToInt(Code01_Transaction::getAmount) // Extract transaction amounts
                .max() // Get the maximum value
                .orElse(0); // Default to 0 if the list is empty
        System.out.println("Largest transaction amount: " + largestAmount);

        System.out.println("===============================");

        //Compute the Smallest amount of an transaction amounts
        int smallestAmount = transactions.stream()
                .mapToInt(Code01_Transaction::getAmount)
                .min()
                .orElse(0);
        System.out.println("Smallest transaction amount: " + smallestAmount);

        //Diferrence between largestAmount and smallestAmount
        int diffAmount = 
    }
}

