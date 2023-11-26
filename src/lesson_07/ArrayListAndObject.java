package lesson_07;

import java.util.ArrayList;
import java.util.List;

public class ArrayListAndObject {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        Person teo = new Person();
        Person teo2 = new Person();
        teo.setName("Teo");
        teo.setAge(18);

        personList.add(teo);
        personList.add(teo);
        personList.add(teo2);

//        for (Person person : personList) {
//            System.out.println(person.toString());
//        }

        personList.get(1).setName("Ti");
        personList.get(2).setName("Ti2");
        System.out.println(personList);
    }
}
