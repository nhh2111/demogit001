import java.util.Scanner;

public class phuongtrinhbac1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double a,b,x;
        System.out.println("A= ");
        a = sc.nextDouble();
        System.out.println("B= ");
        b = sc.nextDouble();
        x = b/a;
        System.out.println("X= " +x);
        sc.close();
    }
}
