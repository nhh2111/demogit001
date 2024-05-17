package lap4;

import java.util.ArrayList;
import java.util.Scanner;

import c4baitapthuchanh.Students;

public class bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Students> studentsSet = new ArrayList<>();

        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Them thong tin hoc sinh");
            System.out.println("2. Hien thi thong tin hoc sinh");
            System.out.println("3. Hien thi thong tin hoc sinh phai thi lai");
            System.out.println("4. Hien thi thong tin hoc sinh co diem so cao nhat");
            System.out.println("5. Tim kiem hoc sinh theo ten");
            System.out.println("0. Thoat");

            System.out.print("Nhap lua chon cua ban: ");
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    addStudent(studentsSet, scanner);
                    break;
                case 2:
                    displayStudents(studentsSet);
                    break;
                case 3:
                    displayStudentsDontPass(studentsSet);
                    break;
                case 4:
                    displayStudentsHighPoint(studentsSet);
                    break;
                case 5: 
                    SearchStudent(studentsSet, scanner);
                    break;
                case 0:
                    System.out.println("Thoat chuong trinh.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le.");
                    break;
            }
        } while (choice != 0);

        scanner.close();
    }

    private static void addStudent(ArrayList<Students> studentsSet, Scanner scanner) {
        Students student = new Students();
        student.inputInfo(scanner);
        student.inputPoint(scanner);
        studentsSet.add(student);
        System.out.println("Them hoc sinh thanh cong.");
    }
    
    private static void displayStudentsDontPass(ArrayList<Students> studentsSet){
        System.out.println("Danh sach hoc sinh phai thi lai: ");
        for (Students students : studentsSet) {
            if(students.getPoint() <= 5){
                students.displayInfo();
                students.display();
                System.out.println("---------------");
            }
        }
    }

    private static void displayStudents(ArrayList<Students> studentsSet){
    System.out.println("Danh sach hoc sinh: ");
    for (Students students : studentsSet) {
        students.displayInfo();
        students.display();
        System.out.println("---------------");
        }
    }

    private static void displayStudentsHighPoint(ArrayList<Students> studentsSet){
        int max = 0;
        System.out.println("Danh sach hoc sinh co diem so cao nhat: ");
        for (Students students : studentsSet) {
            if(students.getPoint()>= max){
                max = students.getPoint();
            }
            if(students.getPoint() == max){
                students.displayInfo();
                students.display();
                System.out.println("---------------");
            }
            }   
        }
        private static void SearchStudent(ArrayList<Students> studentsSet, Scanner scanner) {
            System.out.print("Nhap ten hoc sinh can tim: ");
            String fullname = scanner.nextLine();
            for (Students student : studentsSet) {
                if (student.getFullname().equals(fullname)) {
                    student.displayInfo();
                    student.display();
                    return;
                }
            }
            System.out.println("Khong tim thay hoc sinh co ten '" + fullname + "'.");
        }
}
