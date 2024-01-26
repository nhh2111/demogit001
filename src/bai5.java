import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        int n,tong = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap cac so nguyen bat ky: ");
        while (tong <= 100) {
            n = sc.nextInt();
            tong += n;
        }
        System.out.print("Tong cac so da nhap la: "+tong);
        sc.close();
    }
}
