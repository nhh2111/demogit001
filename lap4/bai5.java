package lap4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong sinh vien can nhap: ");
        n = sc.nextInt();
        sc.nextLine(); 
        List<SinhVien> sinhVienList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin sinh vien thu " + (i + 1) + ":");
            SinhVien sv = new SinhVien();
            sv.inputInfo(sc);
            sinhVienList.add(sv);
        }

        System.out.println("Nhap ten lop can tim: ");
        String tenLop = sc.nextLine();
        System.out.println("Sinh vien thuoc lop " + tenLop + " la:");
        boolean foundLop = false;
        for (SinhVien sv : sinhVienList) {
            if (sv.getLop().equals(tenLop)) {
                sv.displayInfo();
                foundLop = true;
            }
        }
        if (!foundLop) {
            System.out.println("Khong tim thay lop vua nhap");
        }

        System.out.println("Nhap ma sinh vien can tim: ");
        String maSv = sc.nextLine();
        boolean foundMaSV = false;
        for (SinhVien sv : sinhVienList) {
            if (sv.getMaSV().equals(maSv)) {
                System.out.println("Thong tin sinh vien co ma vua nhap la:");
                sv.displayInfo();
                foundMaSV = true;
            }
        }
        if (!foundMaSV) {
            System.out.println("Khong tim thay sinh vien tuong ung");
        }

        sc.close();
    }
}
