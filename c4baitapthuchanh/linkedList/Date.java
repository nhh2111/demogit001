package c4baitapthuchanh.linkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class Date {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int index;
        LinkedList<String> list = new LinkedList<>();
        list.add("Thang 1");
        list.add("Thang 2");
        list.add("Thang 3");
        list.add("Thang 4");
        list.add("Thang 5");
        list.add("Thang 6");
        list.add("Thang 7");
        list.add("Thang 8");
        list.add("Thang 9");
        list.add("Thang 10");
        list.add("Thang 11");
        list.add("Thang 12");
        System.out.println("Nhap vao chi so cua phan tu can lay: ");
        index = sc.nextInt();
        if((index < 0) || (index > (list.size() -1))){
            System.out.println("Chi so can phai lay lon hon 0 va nho hon " +(list.size()-1));
        }else{
            String node = list.get(index);
            System.out.println("phan tu co chi so = "+index+ " trong linkedList la "+node);
        }
        String firstNode = list.getFirst();
        String lastNode = list.getLast();
        System.out.println("Phan tu dau tien trong danh sach la: "+firstNode+" ; Phan tu cuoi cung trong danh sach la: " +lastNode);
        sc.close();

    }
    
}
