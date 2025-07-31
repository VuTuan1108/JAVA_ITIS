public class StudentManager {
    private Student a= new Student();
    public double getDiemTrungBinh(){
        return (a.getDiemAnh()+a.getDiemToan()+a.getDiemVan())/3;
    }
    StudentManager(Student a){
        this.a=a;
    }
    public String hocLuc(){
        if(getDiemTrungBinh()>=8){
            return "Xuất Sắc";
        }
        else if(getDiemTrungBinh()>=7){
            return "Giỏi";
        }
        else if(getDiemTrungBinh()>=6){
            return "Khá";
        }
        else if(getDiemTrungBinh()>=5){
            return "Trung Bình";
        }
        else return "Yếu";
    }
    public String toString(){
        return a.getName()+" "+a.getAge()+" "+a.getAddress()+" "+a.getDiemToan()+" "+a.getDiemVan()+" "+a.getDiemAnh()+" "+(String.format("%.2f",getDiemTrungBinh())+" "+hocLuc());
    }
}
