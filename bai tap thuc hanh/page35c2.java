import java.util.Scanner;

public class page35c2 {
    public static void main(String[] args) {
        double a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao 2 so bat ky: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        if(a < b ){
            System.out.println("So nho nhat trong hai so la: " +a);
        }else{
            System.out.println("So nho nhat trong hai so la: " +b);
        }
        sc.close();
    }
}
