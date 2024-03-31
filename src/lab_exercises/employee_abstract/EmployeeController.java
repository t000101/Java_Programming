package lab_exercises.employee_abstract;

import lab_exercises.employee.Employee;

import java.util.List;

public class EmployeeController {
    public void calculateTotalSalary(List<lab_exercises.employee.Employee> employeeList){
        double totalSalary = 0;
        for (Employee employee : employeeList) {
            totalSalary += employee.getSalary();
        }
        System.out.println("Total Salary is: " + totalSalary);
    }
}
