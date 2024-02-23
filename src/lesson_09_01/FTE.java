package lesson_09_01;

public class FTE extends Employee{

    private static int FTE_SALARY = 50000;
    public FTE(String name) {
        super(name);
    }

    @Override
    public int getSalary() {
        return FTE_SALARY;
    }

    @Override
    public int supportMoney() {
        return 5000;
    }
}
