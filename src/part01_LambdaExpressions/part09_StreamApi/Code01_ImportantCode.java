package part01_LambdaExpressions.part09_StreamApi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Code01_ImportantCode {

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 4, 6, 8, 10, 9, 7);

        //using stream
//        Stream<Integer> stream1 = list1.stream();
//        List<Integer> newList = stream1.filter(i-> i%2==0 )
//                .collect(Collectors.toList());
//        System.out.println(newList);

        List<Integer> newList = list1.stream()
                .filter(i -> i % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(list1);

        List<Integer> newList2 = list1.stream()
                .filter(i -> i > 5)
                .collect(Collectors.toList());
        System.out.println(newList2);
        System.out.println("======================");

        List<String> name = List.of("Abhi", "Aryan", "Jubair", "Babar");
        System.out.println(name);
        List<String> newNames = name.stream()
                .filter(e -> e.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println(newNames);

        System.out.println("======================");

        List<String> newNames2 = name.stream()
                .filter(e -> e.endsWith("r"))
                .collect(Collectors.toList());
        System.out.println(newNames2);

        System.out.println("======================");

        name.stream().forEach(
                e -> {
                    System.out.println(e);
                }
        );
        System.out.println("======================");


        List<Integer> nums = List.of(1, 4, 2, 6, 4);
        System.out.println(nums);
        List<Integer> newNums = nums.stream()
                .map(e -> e * e)
                .collect(Collectors.toList());
        System.out.println(newNums);

        System.out.println("======================");

        //sort
        nums.stream().sorted().forEach(System.out::println);
        System.out.println("=====================");


        Integer integer = nums.stream()
                .min((x, y) -> x.compareTo(y))
                .get();
        System.out.println(integer);
        System.out.println("=====================");


        Integer integer2 = nums.stream()
                .max((x, y) -> x.compareTo(y))
                .get();
        System.out.println(integer2);

        Integer maxVal = list1.stream()
                .max(Integer::compare)
                .get();
        System.out.println(maxVal);

        System.out.println("=====================");

        //find the min value
        Integer minVal = list1.stream()
                .min(Integer::compare)
                .get();
        System.out.println(minVal);

        System.out.println("=====================");

        // find the frequency HashMap
        Map<Integer, Long> freqMap = list1.stream()
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        System.out.println(freqMap);


        System.out.println("=====================");

        //find the 2nd largest element
        Integer secondLargestVal = list1.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get();
        System.out.println("secondLargestVal : " + secondLargestVal);

        System.out.println("=====================");
        //find the 2nd minimum element
        Integer secondMinimumVal = list1.stream()
                .sorted(Integer::compare)
                .skip(1)
                .findFirst()
                .get();
        System.out.println("secondMinimumVal : " + secondMinimumVal);

        System.out.println("=====================");
        //find the sum of all elements in a list
        Integer sum = list1.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("total sum : " + sum);












    }
}
