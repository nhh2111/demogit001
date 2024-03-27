package person;

public class mainClass {
    public static void main(String[] args) {
        employe employe = new employe();
        employe.nhapEmploye();
        employe.xuatEmploye();

        employeFullTime employeFullTime = new employeFullTime();
        employeFullTime.xuatLam();
        employeFullTime.nhapSoGiolam();
        employeFullTime.tinhLuong();
        employe.xuatEmploye();
        employeFullTime.xuatThongTinFT();
        
        employePartTime employePartTime = new employePartTime();
        employePartTime.xuatLam();
        employePartTime.nhapSoGiolam();
        employePartTime.tinhLuong();
        employe.xuatEmploye();
        employePartTime.xuatThongTinPT();
    }
}
