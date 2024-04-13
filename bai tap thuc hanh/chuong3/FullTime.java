package chuong3;

public class FullTime extends NhanVien{
    private int ngayLamThem;
    private  int loaiChucVu;

    public FullTime(String ten){
        this.ten = ten;
    }
    public FullTime(String ten, int ngayLamThem){
        this.ten = ten;
        this.ngayLamThem = ngayLamThem;
    }
    public void setLoaiChucVu(int loaiChucVu){
        this.loaiChucVu = loaiChucVu;
    }

    @Override
    public String loaiNhanVien(){
        return "Nhan vien toan thoi gian";
    }
    public void TinhLuong() {
    if (loaiChucVu == configs.SEP) {
        luong = configs.FullTime_SEP + ngayLamThem * configs.FullTime_LAMTHEM;
    } else if (loaiChucVu == configs.LINH) {
        luong = configs.FullTime_LINH + ngayLamThem * configs.FullTime_LAMTHEM;
    }
}
}
