package c4baitapthuchanh;

import java.util.Scanner;

public class Students {
    private String fullname;
    private int age;

    public Students(String fullname, int age) {
        this.fullname = fullname;
        this.age = age;
    }

    public Students() {}

    public void inputInfo(Scanner scanner) {
        System.out.print("Nhap ten hoc sinh: ");
        this.fullname = scanner.nextLine();
        
        System.out.print("Nhap tuoi hoc sinh: ");
        this.age = scanner.nextInt();
        scanner.nextLine();
    }

    public void displayInfo() {
        System.out.println("Ten hoc sinh: " + fullname);
        System.out.println("Tuoi hoc sinh: " + age);
    }

    public String getFullname() {
        return fullname;
    }

    public void modifyInfo(String fullname, int age) {
        if (!fullname.isEmpty()) {
            this.fullname = fullname;
        }
        if (age >= 0) {
            this.age = age;
        }
    }
}