package c4baitapthuchanh.Sets;

import java.util.HashSet;
import java.util.Scanner;

public class page56c4 {
    public static void main(String[] args) {
        HashSet<String> hashSetStr = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        String name;

        hashSetStr.add("Hoang");
        hashSetStr.add("Hieu");
        hashSetStr.add("Huy");
        hashSetStr.add("Trang");
        hashSetStr.add("Lan Anh");

        System.out.println("Cac phan tu trong hashSetStr: ");
        System.out.println(hashSetStr);
        System.out.println("Nhap phan tu can xoa: ");
        name = sc.nextLine();

        if(hashSetStr.contains(name)){
            hashSetStr.remove(name);
            System.out.println("Xoa thanh cong");
            System.out.println("Cac phan tu trong hashSetStr sau khi xoa: ");
            System.out.println(hashSetStr);
        }else{
            System.out.println("Xoa khong thanh cong");
        }
        sc.close();
    }
}
