package part01_LambdaExpressions.part09_StreamApi.part01;

import java.util.Arrays;
import java.util.List;

public class A01_Main {
    public static void main(String[] args) {
        List<class01_Person> persons = Arrays.asList(
                new class01_Person("Alice", 25),
                new class01_Person("Bob", 30),
                new class01_Person("Charlie", 35)
        );
        double averageAge = persons.stream()
                .mapToInt(class01_Person::getAge)
                .average()
                .orElse(0);

        System.out.println(averageAge);


    }
}
