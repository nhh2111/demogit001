package person;

public class employeFullTime extends employe{
    public int luong1gio = 25000;
    public int soGioLam;
    public double luong;
    public double thuong = (luong1gio * soGioLam) * 10 / 100;
    public employeFullTime(){
        lam = "Full Time";
    }
    public void nhapSoGiolam(){
        System.out.print("Nhap so gio lam: ");
        soGioLam = sc.nextInt();
    }
    public void tinhLuong(){
        luong = (luong1gio * soGioLam) + thuong;
    }
    public void xuatThongTinFT(){
        System.out.print("Luong: "+luong);
    }
}
