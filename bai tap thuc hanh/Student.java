import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        SinhVien Sv = new Student().new SinhVien();
        Sv.NhapThongTin();
        Sv.tinhDiemTongKet();
        Sv.InThongTin();
    }

    class SinhVien {
        Scanner sc = new Scanner(System.in);
         String name;
         int age;
         String stdClass;
         double midtermScore;
         double finalExamScore;
    

    public void NhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten sinh vien: ");
        name = sc.nextLine();
        System.out.println("Nhap tuoi sinh vien: ");
        age = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap lop sinh vien : ");
        stdClass = sc.nextLine();
        System.out.println("Nhap diem qua trinh: ");
        midtermScore = sc.nextDouble();
        System.out.println("Nhap diem cuoi ky: ");
        finalExamScore = sc.nextDouble();
        sc.close();
    }


    public void InThongTin() {
        System.out.println("Ten sinh vien: " + name);
        System.out.println("Tuoi sinh vien: " + age);
        System.out.println("Lop sinh vien: " + stdClass);
        System.out.println("Diem qua trinh: " + midtermScore);
        System.out.println("Diem cuoi ky: " + finalExamScore);
        System.out.println("diem tong ket: " + tinhDiemTongKet());
    }


    public double tinhDiemTongKet() {
        return (midtermScore + finalExamScore) / 2;
    }
    
    }
}
