import java.util.ArrayList;
import java.util.Scanner;

public class Admin extends User{
    private ArrayList<Book> books;
    private Scanner sc;

    Admin(ArrayList<Book> books, Scanner sc){
        this.books = books;
        this.sc = sc;
    }

    public void menu(){
        AdminMenu adminMenu= new AdminMenu(books, sc);
        adminMenu.showMenu();
    }
}
