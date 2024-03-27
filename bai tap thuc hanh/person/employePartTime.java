package person;

public class employePartTime extends employe{
    public int luong1gio = 20000;
    public int soGioLam;
    public double luong;
    public double thuong = (luong1gio * soGioLam) * 10 / 100;

    public employePartTime(){
        lam = "Part Time";
    }

    public void nhapSoGiolam(){
        System.out.print("Nhap so gio lam: ");
        soGioLam = sc.nextInt();
    }
    public void tinhLuong(){
        luong = (luong1gio * soGioLam) + thuong;
    }
    public void xuatThongTinPT(){
        System.out.print("Luong: "+luong);
    }
}
