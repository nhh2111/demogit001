package c4baitapthuchanh.Sets;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class page60c4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        Set<String> linkedHashSet = new LinkedHashSet<String>();
        linkedHashSet.add("Java");
        linkedHashSet.add("C++");
        linkedHashSet.add("PHP");
        System.out.println("Cac phan tu trong linkedHashSet la: ");
        for (String str : linkedHashSet) {
            System.out.println(str);
        }
        System.out.println("Nhap phan tu can xoa: ");
        name = sc.nextLine();

        if(linkedHashSet.contains(name)){
            linkedHashSet.remove(name);
            System.out.println("Xoa thanh cong");
            System.out.println("Cac phan tu trong linkedHashSet sau khi xoa: ");
            System.out.println(linkedHashSet);
        }else{
            System.out.println("Xoa khong thanh cong");
        }
        sc.close();
    }
}
