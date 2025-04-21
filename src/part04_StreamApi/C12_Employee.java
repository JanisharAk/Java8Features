package part04_StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class C12_Employee {
    String name;
    String department;

    C12_Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }
}

class CountByDepartment {
    public static void main(String[] args) {
        List<C12_Employee> employees = Arrays.asList(
                new C12_Employee("John", "IT"),
                new C12_Employee("Jane", "HR"),
                new C12_Employee("Jake", "IT"),
                new C12_Employee("Emily", "Finance"),
                new C12_Employee("Anna", "HR")
        );

        Map<String, Long> deptCount = employees.stream()
                .collect(Collectors.groupingBy(emp -> emp.department, Collectors.counting()));

        deptCount.forEach((dept, count) -> System.out.println(dept + ": " + count));
    }
}
