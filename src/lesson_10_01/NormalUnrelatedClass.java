package lesson_10_01;

public class NormalUnrelatedClass {
    public void doSth(){
        ParentClass childSamePackage = new ChildSamePackage();
        childSamePackage.fromParent();
    }
}
