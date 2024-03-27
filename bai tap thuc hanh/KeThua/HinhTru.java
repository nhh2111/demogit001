package KeThua;

public class HinhTru extends HinhTron{
    public float chieuCao;
    public HinhTru(){
        ten = "Hinh tru";
    }
    public void nhapChieuCao(){
        nhapBanKinh();
        System.out.print("Chieu cao = ");
        chieuCao = sc.nextFloat();
    }
    public void tinhTheTich(){
        tinhDienTich();
        theTich = dienTich * chieuCao;
    }
}
