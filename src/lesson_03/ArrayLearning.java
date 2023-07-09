package lesson_03;

public class ArrayLearning {
    public static void main(String[] args) {
        int arrayLength = 5;
        int [] myIntArray = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            myIntArray[i] = i + 1;
        }

        myIntArray[arrayLength - 1] = 10;

        //arrayLength.for
        for(int i = 0; i < arrayLength; i++){
            System.out.printf("Element at  the index %d has the value %d\n", i, myIntArray[i]);
        }


        //Enhanced for Loop
        for (int arrayElement : myIntArray) {
            System.out.println(arrayElement);
        }
    }
}
