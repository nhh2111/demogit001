package chuong3;

public class MainTinhLuong {
    public static void main(String[] args) {
        FullTime sep = new FullTime("Nguyen Van Sep");
        sep.setLoaiChucVu(1);

        FullTime linh1 = new FullTime("Nguyen Van Linh1");
        FullTime linh2 = new FullTime("Nguyen Van Linh2", 4);
        linh1.setLoaiChucVu(2);
        linh2.setLoaiChucVu(2);

        PartTime thoiVu = new PartTime("Nguyen Thi Thoi Vu", 240);

        sep.TinhLuong();
        linh1.TinhLuong();
        linh2.TinhLuong();
        thoiVu.TinhLuong();

        sep.xuatThongTin();
        linh1.xuatThongTin();
        linh2.xuatThongTin();
        thoiVu.xuatThongTin();
    }
}
