package lab_exercises.employee_abstract;

public class FullTimeEmployee extends Employee{
    public FullTimeEmployee(String name) {
        super(name);
    }

    @Override
    protected double getSalary() {
        return 50000;
    }
}
