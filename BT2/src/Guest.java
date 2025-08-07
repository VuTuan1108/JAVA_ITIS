import java.util.ArrayList;
import java.util.Scanner;

public class Guest extends User {
    ArrayList<Book> books;
    Scanner sc;
    Guest(ArrayList<Book> books, Scanner sc){
        this.books=books;
        this.sc=sc;
    }
    public void menu() {
        GuestMenu guestMenu= new GuestMenu(books, sc);
        guestMenu.Menu();
    }
}
