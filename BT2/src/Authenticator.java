import java.util.ArrayList;
import java.util.Scanner;

public class Authenticator {
    private ArrayList<Book> books= new ArrayList<>();
    private Scanner sc;
    public Authenticator(ArrayList<Book> books,Scanner sc) {
        this.books = books;
        this.sc = sc;
    }
    public User login(){
        System.out.println("Nhập tên đăng nhập (admin/guest): ");
        String name = sc.nextLine().trim().toLowerCase();
        if(name.equals("admin")){
            System.out.println("Nhập mật khẩu");
            String password = sc.nextLine().trim().toLowerCase();
            if(password.equals("admin")){
                System.out.println("Đăng nhập thành công: ");
                return new Admin(books, sc);
            }
            else{
                System.out.println("Sai mật khẩu");
                return null;
            }
        }
        else if(name.equals("guest")){
            System.out.println("Vào với tư cách là khách: ");
            return new Guest(books, sc);
        }
        else{
            System.out.println("Tài khoản không hợp lệ");
            return null;
        }
    }

}
