package part03_StreamApiInterview;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Code05_StringStartsWithP {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "apple", "banana", "berry",
                "cherry", "pineapple", "papaya");

        //Here it will print only the first p in the string i.e pineapple
        Optional<String> opstr = words.stream()
                .filter(str -> str.startsWith("p"))
                .findFirst();

        if(opstr.isPresent()){
            String val = opstr.get();
            System.out.println(val);
        }
    }
}
