package lab_exercises.employee_abstract;

public class ContractEmployee extends Employee{

    public ContractEmployee(String name) {
        super(name);
    }

    @Override
    protected double getSalary() {
        return 40000;
    }
}
