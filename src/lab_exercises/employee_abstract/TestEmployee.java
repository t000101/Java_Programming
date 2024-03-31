package lab_exercises.employee_abstract;

import lab_exercises.employee.ContractEmployee;
import lab_exercises.employee.Employee;
import lab_exercises.employee.EmployeeController;
import lab_exercises.employee.FullTimeEmployee;

import java.util.Arrays;

public class TestEmployee {
    public static void main(String[] args) {
        lab_exercises.employee.Employee employee1 = new lab_exercises.employee.FullTimeEmployee("John");
        lab_exercises.employee.Employee employee2 = new lab_exercises.employee.FullTimeEmployee("Mavis");
        lab_exercises.employee.Employee employee3 = new FullTimeEmployee("Hana");
        lab_exercises.employee.Employee employee4 = new lab_exercises.employee.ContractEmployee("Pete");
        Employee employee5 = new ContractEmployee("Chris");

        lab_exercises.employee.EmployeeController employeeController = new EmployeeController();
        employeeController.calculateTotalSalary(Arrays.asList(employee1, employee2, employee3, employee4, employee5));
    }
}
