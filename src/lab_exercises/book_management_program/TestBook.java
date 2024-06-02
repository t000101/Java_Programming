package lab_exercises.book_management_program;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class TestBook {
    public static void main(String[] args) {
        System.out.println("===== Book Management Program (CRUD) =====");
        System.out.println("1. New Book");
        System.out.println("2. Find a book (ISBN)");
        System.out.println("3. Update a book");
        System.out.println("4. Delete a book");
        System.out.println("5. Print the Book list");
        System.out.println("6. Exit");



        String isbn = "";
        boolean continueMenu = false;

        BookController bookController = new BookController();
        String filePath = System.getProperty("user.dir") + "\\src\\lab_exercises\\book_management_program\\BookList.txt";

        do{
            System.out.println("Your item: ");
            Scanner sc = new Scanner(System.in);
            int menuItem = sc.nextInt();
            switch (menuItem){
                case 1:
                    bookController.newBook(filePath);
                    continueMenu = bookController.continueToPlay();
                    break;
                case 2:
                    isbn = bookController.getISBNFromUser();
                    bookController.findBooks(isbn, filePath);
                    continueMenu = bookController.continueToPlay();
                    break;
                case 3:
                    isbn = bookController.getISBNFromUser();
                    bookController.updateABook(isbn,filePath);
                    continueMenu = bookController.continueToPlay();
                    break;
                case 4:
                    isbn = bookController.getISBNFromUser();
                    bookController.deleteBook(isbn, filePath);
                    continueMenu = bookController.continueToPlay();
                    break;
                case 5:
                    bookController.printBookList(filePath);
                    continueMenu = bookController.continueToPlay();
                    break;
                case 6:
                    System.out.println("===== End=====");
                    break;
                default:
                    continueMenu = bookController.continueToPlay();
            }
        }while(continueMenu == true);

    }
}
