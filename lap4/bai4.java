package lap4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        HashSet<String> hashSetStr = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        String name;
        do{
            System.out.print("Nhap ten cac loai trai cay(nhan enter de thoat): ");
            name = sc.nextLine();
            if(!name.isEmpty()){
                hashSetStr.add(name);
            }
        }while(!name.isEmpty());
        System.out.println("So luong phan tu co trong hashSet vua tao la: " +hashSetStr.size());
        String checkName;
        System.out.println("Nhap ten hoa qua can tim");
        checkName = sc.nextLine();
        if(hashSetStr.contains(checkName)){
            System.out.println("Co tim thay");
        }else{
            System.out.println("Khong tim thay");
        }
        String delete;
        System.out.println("Nhap phan tu can xoa: ");
        delete = sc.nextLine();
        if(hashSetStr.contains(delete)){
            hashSetStr.remove(delete);
            System.out.println("Xoa thanh cong");
            System.out.println("Cac phan tu trong hashSetStr sau khi xoa: ");
            System.out.println(hashSetStr);
        }else{
            System.out.println("Xoa khong thanh cong");
        }
        List<String> list = new ArrayList<>();
            list.add("Nhan");
            list.add("dua hau");
        hashSetStr.addAll(list);
        System.out.println("hashSetStr sau khi them cac phan tu trong list: ");
        Iterator<String> iterator = hashSetStr.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        hashSetStr.removeAll(list);
        System.out.println("HashSet sau khi xoa cac phan tu cua List: ");
        iterator = hashSetStr.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        sc.close();
    }
}
