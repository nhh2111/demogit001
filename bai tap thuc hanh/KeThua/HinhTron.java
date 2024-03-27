package KeThua;

public class HinhTron extends HinhHoc{
    public float banKinh;
    public HinhTron(){
        ten = "Hinh tron";
    }
    public void nhapBanKinh(){
        System.out.print("Ban kinh = ");
        banKinh = sc.nextFloat();

    }
    public void tinhChuVi(){
        chuVi = 2 * pi * banKinh;
    }
    public void tinhDienTich(){
        dienTich = pi * banKinh * banKinh;
    }
}
