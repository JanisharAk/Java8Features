package part01_LambdaExpressions.part09_StreamApi.part03;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class COde02_Main {
    public static void main(String[] args) {
        // Correcting List Initialization
        List<Code01_Employee> empList = Arrays.asList(
                new Code01_Employee("59-385-1088", "Zacharias", "Schwerin", "zchwerin@gmail.com", "Male", "True", 101146, 0),
                new Code01_Employee("73-274-6476", "Kyle", "Frudd", "kfrudd1@ovh.net", "Male", "FALSE", 29310, 2),
                new Code01_Employee("85-939-9584", "Axe", "Gumb", "agumb2@twitter.com", "Female", "FALSE", 62291, 4),
                new Code01_Employee("08-180-8292", "Robinet", "Batterham", "rbatterham3@last.fm", "Male", "FALSE", 142439, 4),
                new Code01_Employee("21-825-2623", "Ulick", "Burrel", "uburrel4@google.ru", "Male", "FALSE", 128764, 5),
                new Code01_Employee("66-708-5539", "Tailor", "Ridding", "Ridding", "Female", "FALSE", 152924, 4),
                new Code01_Employee("81-697-2363", "Joete", "Braybrooke", "jbraybrooke6@prnewswire.com", "Male", "TRUE", 128907, 0),
                new Code01_Employee("63-019-1110", "Elroy", "Baverstock", "ebaverstock7@ehow.com", "Male", "TRUE", 2510, 0)
        );

        // Filtering Female Employees and Collecting into a List
        List<Code01_Employee> femaleEmployees = empList.stream()
                .filter(e -> e.getGender().equals("Female"))
                .collect(Collectors.toList());

        // Printing Female Employees
        femaleEmployees.forEach(System.out::println);
    }
}
