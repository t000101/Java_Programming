package lesson_10_03;

public class TestEch {
    public static void main(String[] args) {
        Ech ech;

        boolean isEnoughTime = true;

        if(isEnoughTime){
            ech = new NongNoc();
        }else{
            ech = new TrungEch();
        }


    }
}
