package person;

import java.util.Scanner;

public class person {
    public String ten;
    public int tuoi;
    public String lam;
    public Scanner sc = new Scanner(System.in);
    public void xuatLam(){
        System.out.println("\n\n===== "+ lam +" ====");
    }
    public void nhapThongTin(){
        System.out.print("Nhap ten: ");
        ten = sc.nextLine();
        System.out.print("Nhap tuoi: ");
        tuoi = sc.nextInt();
    }
    public void xuatThongTin(){
        System.out.println("Ten: "+ ten);
        System.out.println("Tuoi: "+tuoi);
    }
}
