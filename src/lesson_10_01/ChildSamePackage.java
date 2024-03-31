package lesson_10_01;

public class ChildSamePackage extends ParentClass{
    @Override
    public void fromParent() {
        super.fromParent();
    }

    public void doSth(){
        fromParent();
    }
}
