public class Student {
    private String name, age, address;
    private double diemToan, diemVan, diemAnh;
    private int ID;

    Student(String name, String age, String address, double diemToan, double diemVan, double diemAnh, int ID) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.diemToan = diemToan;
        this.diemVan = diemVan;
        this.diemAnh = diemAnh;
        this.ID = ID;
    }

    Student() {}

        public String getName () {
            return name;
        }
        public String getAddress () {
            return address;
        }
        public String getAge () {
            return age;
        }
        public double getDiemAnh () {
            return diemAnh;
        }
        public double getDiemToan () {
            return diemToan;
        }
        public double getDiemVan () {
            return diemVan;
        }
        public int getID () {
            return ID;
        }

}
