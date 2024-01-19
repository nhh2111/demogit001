import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double a,b;
        System.out.print("A= ");
        a = sc.nextDouble();
        System.out.print("B= ");
        b = sc.nextDouble();
        System.out.println("a + b = " +(a+b));
        System.out.println("a - b = " +(a-b));
        System.out.println("a * b = " +(a*b));
        System.out.println("a / b = " +(a/b));
        System.out.println("a % b = " +(a%b));
        if(a>b){
            System.out.println("a lon hon b");
        }else if(a ==b){
            System.out.println("a = b");
        }else{
            System.out.println("a < b");
        }
        sc.close();
    }
}
