package lesson_10_04;

import java.util.Arrays;
import java.util.List;

public class RacingController {

    public void flyableRacing(List<IFlyable> flyAbleAnimal){

    }

    public void nonflyableRacing(List<MoveAble> moveAbleAnimal){

    }

    public static void main(String[] args) {
        Animal cat = new Cat("Meo", 20);
        Eagle eagle = new Eagle("Dai Bang", 70);

        new RacingController().flyableRacing(Arrays.asList(eagle));
    }
}
