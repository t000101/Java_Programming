package lesson_10_02;

import lesson_10_01.ChildSamePackage;
import lesson_10_01.ParentClass;

public class NormalUnrelatedClass {
    public void doSth(){
        ChildSamePackage childSamePackage = new ChildSamePackage();
        childSamePackage.fromParent();
    }
}
