package lab_exercises.employee;

import java.util.Arrays;

public class TestEmployee {
    public static void main(String[] args) {
        Employee employee1 = new FullTimeEmployee("John");
        Employee employee2 = new FullTimeEmployee("Mavis");
        Employee employee3 = new FullTimeEmployee("Hana");
        Employee employee4 = new ContractEmployee("Pete");
        Employee employee5 = new ContractEmployee("Chris");

        EmployeeController employeeController = new EmployeeController();
        employeeController.calculateTotalSalary(Arrays.asList(employee1, employee2, employee3, employee4, employee5));
    }
}
