package lesson_13;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestDataFactory {
    public static void main(String[] args) {

        //READING
        String relativeFilePath = "\\src\\lesson_13\\Persons.txt";
        String absoluteFilePath = System.getProperty("user.dir").concat(relativeFilePath);


        List<Employee> employeeList = DataFactory.getEmployeeListFromFile(absoluteFilePath);
        Collections.sort(employeeList);
        System.out.println(employeeList);


        //WRITING
        Employee teo = new Employee("Teo", 18, 100000);
        Employee ti = new Employee("Ti", 19, 20000);
        Employee tun = new Employee("Tun", 20, 10099);
        List<Employee> employeeListTosave = Arrays.asList(teo, ti, tun);
        String employeeDataFile = System.getProperty("user.dir").concat("\\src\\lesson_13\\Employee.txt");
        DataFactory.saveEmployeeList(employeeListTosave, employeeDataFile);
    }
}
