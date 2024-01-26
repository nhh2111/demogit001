import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        int nam;
        String ten;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten: " );
        ten = sc.nextLine();
        System.out.print("Nhap so tuoi: ");
        nam = sc.nextInt();
        if(nam >=18 ){
            System.out.println("Ban "+ten+" da gia");
        }else if(nam >=16){
            System.out.println("Ban "+ten+" o do tuoi truong thanh");
        }else {
            System.out.println("Ban "+ten+" o do tuoi vi thanh nien");
        }
        sc.close();
    }
}
