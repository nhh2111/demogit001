import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        int n,tong = 0;
        String str = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap cac so nguyen bat ky: ");
        while (tong <= 100) {
            n = sc.nextInt();
            tong += n;
            str = str + n + " + ";
        }
        str = str.substring(0,str.length() - 2);
        System.out.print(str +"= "+tong);
        sc.close();
    }
}
