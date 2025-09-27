package Baitap_gg.bai1;

public class Canbo {
    private String ten;
    private int tuoi;
    private String gioitinh;
    private String diachi;

    public Canbo()
    {

    }

    public Canbo(String ten, int tuoi, String gioitinh, String diachi) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.gioitinh = gioitinh;
        this.diachi = diachi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getCongviec() {
        return diachi;
    }

    public void setCongviec(String diachi) {
        this.diachi = diachi;
    }
    public void hienthithongtincanbo()
    {
        System.out.println("Tên :" +ten);
        System.out.println("Giới tính :" +gioitinh);
        System.out.println("Tuổi :" +tuoi);
        System.out.println("Địa chỉ :" +diachi);
    }

    @Override
    public String toString() {
        return "Canbo{" +
                "ten='" + ten + '\'' +
                ", tuoi=" + tuoi +
                ", gioitinh='" + gioitinh + '\'' +
                ", diachi='" + diachi + '\'' +
                '}';
    }
}
