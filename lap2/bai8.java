import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {
        int n , so;
        double  avg = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so cac so nguyen trong day: ");
        n = sc.nextInt();
        for(int i = 0; i< n ; i++){
            so = sc.nextInt();
            avg += so;
        }
        avg = avg /n;
        System.out.println("Trung binh cong cac so co trong day la: "+ avg);
        sc.close();
    }
}
