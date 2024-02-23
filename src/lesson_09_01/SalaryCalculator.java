package lesson_09_01;

import java.util.List;

public class SalaryCalculator {

    public int getTotalSalary(List<Employee> employeeList){
        int totalSalary = 0;
        for (Employee employee : employeeList) {
//            // Casting | Strongly NOT RECOMMEND | BAD practice
//            if(employee instanceof  FTE){
//                totalSalary = totalSalary + employee.getSalary() + ((FTE) employee).supportMoney();
//            }else{
//                totalSalary += employee.getSalary();
//            }

            totalSalary += employee.getSalary() + employee.supportMoney();
        }
        return totalSalary;
    }
}
