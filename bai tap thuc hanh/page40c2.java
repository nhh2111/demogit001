import java.util.Scanner;

public class page40c2 {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so ngay: ");
        a = sc.nextInt();
        switch (a) {
            case 1:
                System.out.println("Chu nhat");
                break;
                case 2:
                System.out.println("Thu hai");
                break;
                case 3:
                System.out.println("Thu ba");
                break;
                case 4:
                System.out.println("Thu tu");
                break;
                case 5:
                System.out.println("Thu 5");
                break;
                case 6:
                System.out.println("Thu sau");
                break;
                case 7:
                System.out.println("Thu bay");
                break;
            default:
            System.out.println("Khong phai thu trong tuan");
                break;
        }
        sc.close();
    }
}
