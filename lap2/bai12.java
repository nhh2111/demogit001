import java.util.Scanner;

public class bai12 {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so cot cho mang: ");
        b = sc.nextInt();
        System.out.print("Nhap so dong cho mang: ");
        a = sc.nextInt();
        int arr[][] = new int [a][b];
        for(int i = 0; i < a; i++){
            for(int j = 0; j< b; j++){
                System.out.print("Nhap phan tu thu ["+ i+"] ["+j+"] = ");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("\nMa tran vua nhap la:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int n = 0;
        for(int i = 0; i < a; i++){
            for(int j = 0; j< b; j++){
                if(n <= arr[i][j]){
                    n = arr[i][j];
                }
            }
        }
        System.out.println("gia tri lon nhat trong ma tran la: " +n);
        sc.close();
    }
}
