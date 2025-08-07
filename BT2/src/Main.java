import java.util.ArrayList;
import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<Book>();
        System.out.println("Dữ liệu ban đầu");
        for(int i=0;i<5;i++){
            Book book = new Book(Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine()),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
            books.add(book);
        }
        while(true) {
            Authenticator login = new Authenticator(books, sc);
            User user = null;
            while (user == null) {
                user = login.login();
            }
            user.menu();
        }
    }
}