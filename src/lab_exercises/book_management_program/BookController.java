package lab_exercises.book_management_program;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookController {


    public void newBook(String filePath){
        Book newBook = new Book();
        DataFactory dataFactory = new DataFactory();
        List<Book> listBooks = dataFactory.getBookListFromFile(filePath);

        Scanner sc = new Scanner(System.in);

        System.out.println("Please input ISBN:");
        newBook.setIsbn(sc.next());

        if(findBooks(newBook.getIsbn(), filePath)){
            System.out.println("[ERR] There is an existing Book in the list.");
        }else{

            System.out.println("Please input title:");
            newBook.setTitle(sc.next());

            System.out.println("Please input author:");
            newBook.setAuthor(sc.next());

            System.out.println("Please input year:");
            newBook.setYear(sc.nextInt());

            listBooks.add(newBook);
            dataFactory.saveBookList(listBooks, filePath);
        }

    }

    public Boolean findBooks(String searchISBN, String filePath){
        DataFactory dataFactory = new DataFactory();
        List<Book> listBooks = dataFactory.getBookListFromFile(filePath);
        List<Book> results = new ArrayList<>();
        for (Book book : listBooks) {
            if(book.getIsbn().matches(searchISBN)){
                results.add(book);
            }
        }

        if(results.size() != 0){
            System.out.println("=== Search Results ===");
            System.out.println(results);
            return true;
        }else{
            System.out.printf("Book with ISBN <%s> is not found.", searchISBN + "/n");
            return false;
        }
    }

    public void updateABook(String isbn, String filePath){
        DataFactory dataFactory = new DataFactory();
        List<Book> listBooks = dataFactory.getBookListFromFile(filePath);
        if(findBooks(isbn, filePath)){
            Scanner sc = new Scanner(System.in);
            System.out.println("Please input new title: ");
            String newTitle = sc.next();

            System.out.println("Please input new author: ");
            String newAuthor = sc.next();

            System.out.println("Please input new year: ");
            int newYear = sc.nextInt();

            for (Book book : listBooks) {
                if(book.getIsbn().matches(isbn)){
                    book.setTitle(newTitle);
                    book.setAuthor(newAuthor);
                    book.setYear(newYear);
                    break;
                }
            }

            dataFactory.saveBookList(listBooks, filePath);
        }else{
            System.out.println("[ERR] Unable to find the book for updating.");
        }
    }

    public void deleteBook(String isbn, String filePath){
        DataFactory dataFactory = new DataFactory();
        List<Book> listBooks = dataFactory.getBookListFromFile(filePath);

        if(findBooks(isbn, filePath)){
            for (Book book : listBooks) {
                if(book.getIsbn().equals(isbn)){
                    listBooks.remove(book);
                    break;
                }
            }
            dataFactory.saveBookList(listBooks, filePath);
        }else{
            System.out.println("[ERR] Unable to find the book for deleting.");
        }
    }

    public void printBookList(String filePath){
        DataFactory dataFactory = new DataFactory();
        List<Book> bookList = dataFactory.getBookListFromFile(filePath);
        for (int i = 0; i < bookList.size(); i++) {
            System.out.printf("Book %d: %s\n", i, bookList.get(i).getTitle());
            System.out.printf("   ISBN: %s\n", bookList.get(i).getIsbn());
            System.out.printf("   Author: %s\n", bookList.get(i).getAuthor());
            System.out.printf("   Year: %d\n", bookList.get(i).getYear());
        }
    }

    public String getISBNFromUser(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input ISBN:");
        return sc.next();
    }

    public boolean continueToPlay(){
        System.out.println("Do you want to continue? (y/n)");
        Scanner sc = new Scanner(System.in);
        String answer = sc.next();
        if(answer.equals("y")){
            return true;
        }else{
            return false;
        }
    }


}
