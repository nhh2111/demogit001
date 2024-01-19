import java.util.Scanner;

public class phuongtrinhbac2 {
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    Double a,b,c,x1,x2,delta;
    System.out.print("A= ");
    a = sc.nextDouble();
    System.out.print("B= ");
    b = sc.nextDouble();
    System.out.print("C= ");
    c = sc.nextDouble();
    delta = Math.pow(b, 2) - (a*4*c);
    if(delta < 0){
        System.out.println("Phuong trinh vo nghiem");
    }else if (delta == 0) {
        x1 = x2 = -b/(2 * a);
        System.out.println("Phuong trinh co nghiem kep: x1 = x2 =" +x1); 
    }else{
        x1 = (-b + Math.sqrt(delta)) / (a * 2);
        x2 = (-b - Math.sqrt(delta)) / (a * 2);
        System.out.println("Phuong trinh co nghiem x1 = "+ x1+" x2 = " +x2 );
    }
    sc.close();
}
    
}