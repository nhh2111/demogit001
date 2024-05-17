package lap4;

import java.util.LinkedList;
import java.util.Scanner;

public class bai2 {
     public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        Scanner sc = new Scanner(System.in);
        int n, number;
      
        System.out.println("Nhap so phan tu trong danh sach: ");
        n = sc.nextInt();
        for(int i = 0 ; i < n ; i++){
            System.out.println("Nhap phan tu thu "+i+" : ");
            number = sc.nextInt();

            if(number>0){
            list.add(number);
            } else {System.out.println("Error!!");
               }
        }
        int sophantu = 0;
        double trungbinhcong, tong = 0.0 ;
        for (int so : list){
            if( so % 2 == 0 ){
                sophantu++;
                tong += so;           
            }  
        }
         trungbinhcong = tong / sophantu;
         System.out.println("Trung binh cong cac so chan = "+trungbinhcong);
         sc.close();
    }
    
}
