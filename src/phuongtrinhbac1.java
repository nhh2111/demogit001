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
        if(a==0){
            System.out.println("Phuong trinh vo nghiem");
        }else{
            System.out.println("Phuong trin co nghiem la: X = " +x);
        }
        
        sc.close();
    }
}
