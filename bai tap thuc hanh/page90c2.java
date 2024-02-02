import java.util.Scanner;

public class page90c2 {
    public static void main(String[] args) {
        String str;
        char kyTu;
        Scanner sc =  new Scanner(System.in);
        System.out.print("Nhap vao mot chuoi bat ky: ");
        str = sc.nextLine();
        System.out.println("Cac ky tu co trong chuoi la: ");
        for(int i = 0; i< str.length(); i++){
            kyTu = str.charAt(i);
            System.out.println(kyTu);
        }
        sc.close();
    }
}
