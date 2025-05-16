package part03_StreamApiInterview;

import java.util.Arrays;
import java.util.List;

public class Code14_ReverseList {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "try", "banana", "berry");
        List<String> list= words.stream()
                .map(str -> new StringBuffer(str).reverse().toString())
                .toList();
        System.out.println(list);
    }
}
