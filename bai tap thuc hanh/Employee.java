import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
        Employe employe = new Employee().new Employe();
        employe.NhapThongTin();
        employe.tinhLuong();
        employe.InThongTin();
        
    }
    class Employe {
        Scanner sc = new Scanner(System.in);
        String name;
        int age;
        int wage1h = 20000;
        int workTime;

        public void NhapThongTin() {
            System.out.print("Nhap ten nhan vien: ");
            name = sc.nextLine();
            System.out.print("Nhap tuoi: ");
            age = sc.nextInt();
            System.out.print("So gio lam la: ");
            workTime = sc.nextInt();
        }
        public long tinhLuong() {
            return (wage1h * workTime);
        }
        public void InThongTin() {
          System.out.println("Ten: " + name);
          System.out.println("Tuoi: " + age);
          System.out.println("Tien luong cua nhan vien la: " + tinhLuong());
        }
    }
    
}
