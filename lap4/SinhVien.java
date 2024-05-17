package lap4;

import java.util.Scanner;

public class SinhVien {
    private String maSV;
    private String hoTen;
    private String lop;
    Scanner sc = new Scanner(System.in);
    public void inputInfo(Scanner sc){
        System.out.println("Nhap ma sinh vien: ");
        this.maSV = sc.nextLine();
        System.out.println("Nhap ho ten: ");
        this.hoTen = sc.nextLine();
        System.out.println("Nhap lop: ");
        this.lop = sc.nextLine();
    }
    public String getLop() {
        return lop;
    }
    public String getMaSV(){
        return maSV;
    }
    public void displayInfo(){
        System.out.println("Ma sinh vien: "+ maSV);
        System.out.println("Ho ten: "+hoTen);
        System.out.println("Lop: " +lop);
    }
}
