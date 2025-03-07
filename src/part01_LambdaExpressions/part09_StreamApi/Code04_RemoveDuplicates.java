package part01_LambdaExpressions.part09_StreamApi;

import java.util.Arrays;
import java.util.List;

public class Code04_RemoveDuplicates {
    public static void main(String[] args) {
        //remove duplicate from list
        List<Integer> list = Arrays.asList(1,2,4,2,1,5,6,4);
        List<Integer> list2 = list.stream()
                .distinct().toList();
        System.out.println(list2);
    }
}
