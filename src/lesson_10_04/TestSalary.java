package lesson_10_04;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestSalary {

    public static void main(String[] args) {
        Employee teo = new Employee("Teo", 10);
        teo.setAge(20);
        Employee ti = new Employee("Ti", 7);
        ti.setAge(21);
        Employee tun = new Employee("Tun", 11);
        tun.setAge(18);

        List<Employee> employeeList = Arrays.asList(teo, ti, tun);

        System.out.println("===BEFORE===");
        System.out.println(employeeList);

        Collections.sort(employeeList);

        System.out.println("===AFTER===");
        System.out.println(employeeList);

        Collections.sort(employeeList, new EmpAgeComparator());

    }
}
