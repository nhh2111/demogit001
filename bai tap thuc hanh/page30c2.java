import java.util.Scanner;

public class page30c2 {
    public static void main(String[] args) {
        int n, tong = 0; 
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so nguyen n bat ky (n>0): ");
        n = sc.nextInt();
        while (n <= 0) {
            System.out.print("Nhap vao so nguyen n bat ky (n>0): ");
            n = sc.nextInt();
        };
        
        while(n>0){
            tong += n%10;
            n = n / 10;
        }
        System.out.println("Tong cac chu so vua nhap la: " +tong);
        sc.close();
    }
}
