package lab_exercises.book_management_program;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DataFactory {

    public List<Book> getBookListFromFile (String filePath){
        List<Book> bookList = new ArrayList<>();

        try(
                FileInputStream fileInputStream = new FileInputStream(filePath);
                InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        ){
            String streamDataLine = bufferedReader.readLine();
            while(streamDataLine != null){
                String[] data = streamDataLine.split(";");
                String isbn = data[0];
                String title = data[1];
                String author = data[2];
                int year = Integer.parseInt(data[3]);

                Book book = new Book(isbn, title, author, year);
                bookList.add(book);
                streamDataLine = bufferedReader.readLine();
            }
        }catch (FileNotFoundException e){
            System.out.println("[ERR] FIle is not found.");
        }catch (IOException e){
            e.printStackTrace();
        }

        return bookList;
    }


    public void saveBookList(List<Book> bookList, String filePath){
        try(
                FileOutputStream fileOutputStream = new FileOutputStream(filePath);
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
                BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
        ){
            for (Book book : bookList) {
                String dataLine = book.getIsbn() + ";" + book.getTitle() + ";" + book.getAuthor() + ";" + book.getYear();
                bufferedWriter.write(dataLine);
                bufferedWriter.newLine();
            }
        }catch(FileNotFoundException e){
            System.out.println("[ERR] File is not found");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
