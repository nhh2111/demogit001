import java.util.Scanner;

public class bai9 {
    public static void main(String[] args) {
        String str;
        int kyTuThuong = 0, kyTuHoa = 0, so = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao mot chuoi bat ky: ");
        str = sc.nextLine();
        char arr[] = str.toCharArray();
        for(int i = 0; i< arr.length; i++){
            if(arr[i]>=65 && arr[i] <= 90){
                kyTuHoa++;
            }
            else if(arr[i]>=97 && arr[i] <= 122){
                kyTuThuong++;
            }else if(arr[i] >= 48 && arr[i] <= 57){
                so++;
            }
        }
        System.out.println("So ky tu hoa co trong chuoi la: " +kyTuHoa);
        System.out.println("So ky tu thuong co trong chuoi la: " +kyTuThuong);
        System.out.println("So cac so co trong chuoi la: " +so);
        sc.close();
    }
}
