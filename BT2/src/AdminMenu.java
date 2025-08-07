import java.util.ArrayList;
import java.util.Scanner;

public class AdminMenu extends GuestMenu {
     public AdminMenu(ArrayList<Book> books, Scanner sc) {
         super(books,sc);
     }

     public void showMenu(){
          while(true){
               System.out.println("===== MENU ADMIN =====");
               System.out.println("0: Thoát");
               System.out.println("1: Tìm kiếm sách");
               System.out.println("2: Xem toàn bộ sách");
               System.out.println("3: Thêm sách");
               System.out.println("4: Xóa sách");
               System.out.println("5: Sửa sách");
               System.out.println("6: Quay lại đăng nhập");
               int choice = Integer.parseInt(sc.nextLine());
               switch(choice){
                    case 1:
                         searchBook();
                         break;
                    case 2:
                         disPlayAllBooks();
                         break;
                    case 3:
                         addBook();
                         break;
                    case 4:
                         removeBook();
                         break;
                    case 5:
                         changeBook();
                         break;
                    case 6:
                         return;
                    case 0:
                         System.exit(0);
                    default:
                         System.out.println("Không hợp lệ");
               }
          }
     }
     private void addBook(){
          System.out.println("Nhập thông tin sách: ");
          Book book = new Book(Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine()),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
          books.add(book);
          System.out.println("Đã thêm sách");
     }

     private void removeBook(){
          System.out.println("Nhập ID sách cần xóa: ");
          int id = Integer.parseInt(sc.nextLine());
          books.removeIf(b -> b.getId() == id);
     }
     private void changeBook(){
          System.out.println("Nhập ID sách cần thay đổi: ");
          int id = Integer.parseInt(sc.nextLine());
          books.removeIf(b -> b.getId() == id);
          System.out.println("Nhập dữ liệu mới: ");
          Book book = new Book(Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine()),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
          books.add(book);
     }
}
