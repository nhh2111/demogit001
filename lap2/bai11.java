import java.util.Scanner;

public class bai11 {
    public static void main(String[] args) {
        int n, tam = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu trong mang: ");
        n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Mang vua nhap la: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    tam = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tam;
                }
            }
        }
        System.out.println("\nMang sau khi sap xep theo thu tu tang dan la: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
