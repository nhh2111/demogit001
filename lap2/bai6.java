import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        int n, giaiThua = 1;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Nhap vao mot so nguyen duong bat ky: ");
            n = sc.nextInt();
            for(int i = 1; i<= n; i++){
                giaiThua *= i;
            }
        }while(n<=0);
        System.out.print("Giai thua cua so vua nhap la: "+giaiThua);
        sc.close();
    }
}
