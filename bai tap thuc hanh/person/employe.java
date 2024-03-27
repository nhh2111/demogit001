package person;

public class employe extends person{
    public String employId;
    public void nhapEmploye(){
        System.out.print("Nhap id nhan vien: ");
        employId = sc.nextLine();
        super.nhapThongTin();
    }
    
    public void xuatEmploye(){
        System.out.println("Id nhan vien: " +employId);
        super.xuatThongTin();
    }
}
