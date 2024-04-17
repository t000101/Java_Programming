package lesson_11;

import java.util.Comparator;

public interface ISomething extends Comparable, Comparator {

    //by default set as public for all method in Interface
    //public abstract  method
    void doSth();

    //able to use without override
    //public default method
    default void doAnotherThing(){

    }

    //public static method
    static void doAnything(){

    }

}
