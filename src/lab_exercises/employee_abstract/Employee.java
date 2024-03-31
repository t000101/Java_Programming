package lab_exercises.employee_abstract;

public abstract class Employee {
    String name;

    double salary;

    public Employee(String name) {
        this.name = name;
    }

    protected abstract double getSalary();
}
