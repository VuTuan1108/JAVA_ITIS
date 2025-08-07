import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n= sc.nextInt();
       sc.nextLine();
       ArrayList<StudentManager> list=new ArrayList<StudentManager>();
       for(int i=1;i<=n;i++){
           Student a=new Student(sc.nextLine(),sc.nextLine(),sc.nextLine(),Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine()),i);
           StudentManager m=new StudentManager(a);
           list.add(m);
       }
       for(StudentManager m:list){
           System.out.println(m);
       }
    }
}