package KeThua;

public class HinhChuNhat extends HinhHoc{
    public float dai;
    public float rong;
    public HinhChuNhat(){
        ten = "Hinh chu nhat";
    }
    public void nhapChieuDai(){
        System.out.print("Chieu dai = ");
        dai = sc.nextFloat();
    }
    public void nhapChieuRong(){
        System.out.print("Chieu rong = ");
        rong = sc.nextFloat();
    }
    public void tinhChuVi(){
        chuVi = 2 * (dai + rong);
    }
    public void tinhDienTich(){
        dienTich = dai * rong;
    }
}
