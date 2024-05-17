package lap4;

import java.util.ArrayList;
import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
            ArrayList<Integer> arr = new ArrayList<>();
            Scanner sc = new Scanner(System.in);
            int n;
            System.out.println("Nhap vao so phan tu: ");
            n = sc.nextInt();
             
            for( int i = 0; i< n; i++){
                System.out.println("Nhap phan tu thu "+i+" : ");
                int number = sc.nextInt();
                arr.add(number);
            }  
           
        System.out.println("--------------------------\n");
            System.out.println("Cac phan tu trong day la : ");
            for( int number : arr){
                  System.out.print(number + "\t");
            }

            int max = arr.get(0);
            for(int i=1; i< arr.size(); i++){
                 if( arr.get(i).compareTo(max) >0){
                     max = arr.get(i); 
                 }
            }
            System.out.println("\n\nPhan tu lon nhat trong day = "+max);
  
        System.out.println("------------------------------------\n");
            System.out.print("Nhap vao so nguyen duong can xoa: ");
            int socanxoa = sc.nextInt();
            for (int i = arr.size() - 1; i >= 0; i--) { 
                if (arr.get(i) == socanxoa) {
                    arr.remove(i);
                }
            }
            
            arr.sort((o1,o2)->(o1-o2));
            System.out.println("\nDay so sau khi xoa va sap xep:");
            for (int so: arr) {
                 System.out.print(so + "\t");
            }
            sc.close();
    }
}
