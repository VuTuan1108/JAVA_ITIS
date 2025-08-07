import java.util.Scanner;

public class Book {
    private String tieuDe,tacGia,theLoai,ngayXuatBan;

    private int id,status;

    Book( int id,int status, String tieuDe, String tacGia, String theLoai,String ngayXuatBan ) {
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.theLoai = theLoai;
        this.ngayXuatBan = ngayXuatBan;
        this.id = id;
        this.status=status;
    }

    Book(){}

    public String getTieuDe() {
        return tieuDe;
    }

    public String getTacGia() {
        return tacGia;
    }
    public String getTheLoai() {
        return theLoai;
    }

    public String getNgayXuatBan() {
        return ngayXuatBan;
    }

    public int getId() {
        return id;
    }

    public int getStatus() {
        return status;
    }
    public void setStatus(int status) {
        this.status = status;
    }

    public String toString(){
        return id+" "+status+" "+tieuDe+" "+tacGia+" "+theLoai;
    }
}
