package chuong3;

public class PartTime extends NhanVien{
    private int gioLamViec;

    public PartTime(String ten, int gioLamViec){
        this.ten = ten;
        this.gioLamViec = gioLamViec;
    }
    @Override
    public String loaiNhanVien(){
        return "Nhan vien thoi vu";
    }
    public void TinhLuong(){
        luong = configs.PARTTime_LAMTHEM * gioLamViec;
    }
}
