package lesson_07;

//Parent class, super class
public class RobotCat extends Grandpa{

    private String name;
    private String productionDate;

    public RobotCat() {
    }

    public RobotCat(String name, String productionDate) {
        this.name = name;
        this.productionDate = productionDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(String productionDate) {
        this.productionDate = productionDate;
    }

    public String charge(){
        return "Charging ";
    }

    @Override
    public String toString() {
        return "RobotCat{" +
                "name='" + name + '\'' +
                ", productionDate='" + productionDate + '\'' +
                '}';
    }
}
