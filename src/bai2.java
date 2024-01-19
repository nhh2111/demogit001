import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so bat ky: ");
        int a;
        a = sc.nextInt();
        if(a%2 == 0){
            System.out.println("So vua nhap la so chan");
        }else {
            System.out.println("So vua nhap la so le");
        }
        sc.close();
    }
}
