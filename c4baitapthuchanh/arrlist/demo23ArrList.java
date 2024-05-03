package c4baitapthuchanh.arrlist;

import java.util.ArrayList;
import java.util.Scanner;

public class demo23ArrList {
public static void main(String[] args) {
    ArrayList<Integer> arrayListInt = new ArrayList<>();
    int n,number;
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhap so phan tu cua mang: ");
    n = sc.nextInt();
    for(int i = 0; i< n ; i++){
        System.out.println("Nhap phan tu thu "+ i+": " );
        number = sc.nextInt();
        arrayListInt.add(number);
    }
    int max = arrayListInt.get(0);
    for (int i= 0; i< arrayListInt.size() ; i++ ) {
        if (arrayListInt.get(i).compareTo(max) > 0) {
            max = arrayListInt.get(i);
        }
    }
    System.out.println("Phan tu lon nhat trong mang vua nhap la: "+ max);
    sc.close();
}    
}
