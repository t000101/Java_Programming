package lesson_08;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        if(age < 0){
            throw new IllegalArgumentException("Age can't be negative number!");
        }
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if(age < 0){
            throw new IllegalArgumentException("Age can't be negative number!");
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void doSth(){

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
