package part04_StreamApi;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class C3_FindNonRepeatingCharacter {
    public static void main(String[] args) {
        String str = "Hello Halda";

        Character result = findFirstNonRepeatedChar(str);
        System.out.println("First non-repeated character is: " + result);
    }

    public static Character findFirstNonRepeatedChar(String str) {
        Map<Character, Long> charCountMap = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        return charCountMap.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null); // or another indicator for no non-repeated character
    }

}
