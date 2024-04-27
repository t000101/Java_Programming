package lesson_12;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class DataFactory {

    public static void readFile(String filePath) {
        System.out.println("Reading file from ".concat(filePath));

        try{
            FileInputStream fileInputStream = new FileInputStream(filePath);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        } catch (Exception e){
            throw new IllegalArgumentException("The file path".concat(filePath).concat("is not found"));
        }
    }

    public static void main(String[] args) {
        DataFactory.readFile("lesson_12/DataFactory.java");
    }
}
