package lab_exercises.employee;

import java.util.List;

public class EmployeeController {
    public void calculateTotalSalary(List<Employee> employeeList){
        double totalSalary = 0;
        for (Employee employee : employeeList) {
            totalSalary += employee.getSalary();
        }
        System.out.println("Total Salary is: " + totalSalary);
    }
}
