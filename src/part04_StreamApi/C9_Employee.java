package part04_StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class C9_Employee {
    String name;
    String department;

    public C9_Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }
}

class GroupByDepartment {
    public static void main(String[] args) {
        List<C9_Employee> employees = Arrays.asList(
                new C9_Employee("John", "IT"),
                new C9_Employee("Jane", "HR"),
                new C9_Employee("Jake", "IT"),
                new C9_Employee("Emily", "Finance")
        );

        Map<String, List<C9_Employee>> grouped = employees.stream()
                .collect(Collectors.groupingBy(emp -> emp.department));

        grouped.forEach((dept, list) -> {
            System.out.println(dept + ": " + list.stream().map(e -> e.name).collect(Collectors.toList()));
        });
    }
}
