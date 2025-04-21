package part04_StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class C5_ConvertToUpperCase {
    public static void main(String[] args) {
        String str = "Hello India";

        // Split the string into words and convert each to uppercase
        List<String> result = Arrays.stream(str.split(" "))
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(result);  // Output: [HELLO, INDIA]
    }
}
