import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        String str;
        char n;
        int dem = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao mot chuoi bat ky khong qua 80 ky tu: ");
        str = sc.nextLine();
        System.out.println("Nhap vao mot ky tu bat ky: ");
        n = sc.next().charAt(0);
        for(int i = 0; i< str.length(); i++){
            if(str.charAt(i) == n){
                dem++;
            }
        }
        System.out.println("so lan ky tu vua nhap xuat hien trong chuoi la: "+ dem);
    }
}
