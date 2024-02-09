package lesson_08;

import static lesson_08.HouseWithBuilder.Builder;

public class TestHouseBuilder {
    public static void main(String[] args) {
        Builder builder = new Builder();

//        builder.setDoorNum(2);
//        builder.setTopRoofColor("Dark BLue");
//        builder.setColor("Black");
//        HouseWithBuilder house = builder.build();


        //Method chaining
        HouseWithBuilder house = builder.setDoorNum(2)
                                        .setTopRoofColor("Dark Blue")
                                        .setColor("Green")
                                        .build();

        System.out.println(house);
    }


}
