package lesson_06;

public class RobotCat {

    private String name;

    public RobotCat(){
        System.out.println("Hello");
    }

    public  RobotCat(String name){
        this.name = name;
        System.out.println("Hello " + this.name);
    }

    //Setter
    public void setName(String name){
        this.name = name;
    }

    //Getter
    public  String getName(){
        return name;
    }

    public void printName(){
        System.out.println(name);
    }


}
