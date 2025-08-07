import java.util.ArrayList;
import java.util.Scanner;

public class GuestMenu {
    protected ArrayList<Book> books = new ArrayList<Book>();
    protected Scanner sc;

    public GuestMenu(ArrayList<Book> books, Scanner sc) {
        this.books = books;
        this.sc = sc;
    }

    public void Menu(){
        while(true) {
            System.out.println("===== MENU KHÁCH =====");
            System.out.println("1: Tìm kiếm sách");
            System.out.println("2: Xem toàn bộ sách");
            System.out.println("3: Quay lại đăng nhập");
            System.out.println("0: thoát");
            int choice=Integer.parseInt(sc.nextLine());
            switch(choice){
                 case 1:
                     searchBook();
                     break;
                 case 2:
                     disPlayAllBooks();
                     break;
                  case 3:
                      return;
                  case 0:
                      System.exit(0);
                  default:
                      System.out.println("Không hợp lệ");
            }
        }
    }

    protected  void searchBook(){
        System.out.println("Nhập từ khóa:");
        String keyword = sc.nextLine().toLowerCase();
        int check=0;
        for(Book b:books){
            if(b.getTacGia().toLowerCase().contains(keyword)||
               b.getTheLoai().toLowerCase().contains(keyword)||
               b.getNgayXuatBan().toLowerCase().contains(keyword)||
               b.getTieuDe().toLowerCase().contains(keyword)
            ){
                System.out.println(b);
                check=1;
            }
        }
        if(check==0){
            System.out.printf("Không tìm thấy");
        }
    }
    protected void disPlayAllBooks(){
        for(Book b:books){
            System.out.println(b);
        }
    }


}
