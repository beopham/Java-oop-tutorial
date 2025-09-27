package Baitap_gg.bai1;

public class Nhanvien extends Canbo {
    private String congviec;

    public Nhanvien()
    {

    }

    public Nhanvien(String congviec) {
        this.congviec = congviec;
    }

    public Nhanvien(String ten, int tuoi, String gioitinh, String diachi, String congviec) {
        super(ten, tuoi, gioitinh, diachi);
        this.congviec = congviec;
    }

    @Override
    public String getCongviec() {
        return congviec;
    }

    @Override
    public void setCongviec(String congviec) {
        this.congviec = congviec;
    }

    @Override
    public void hienthithongtincanbo() {
        super.hienthithongtincanbo();
        System.out.println("Công việc " +congviec);
    }

    @Override
    public String toString() {
        return "Nhanvien{" +
                "congviec='" + congviec + '\'' +
                '}';
    }
}
