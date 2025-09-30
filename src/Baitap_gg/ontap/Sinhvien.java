package Baitap_gg.ontap;

public class Sinhvien {
    private String ten;
    private String lop;
    private double gpa;
    private String diachi;

    public Sinhvien()
    {

    }

    public Sinhvien(String ten, String lop, double gpa, String diachi) {
        this.ten = ten;
        this.lop = lop;
        this.gpa = gpa;
        this.diachi = diachi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }
    public void hienthidanhsach()
    {
        System.out.println("Tên " +ten);
        System.out.println("Lớp " +lop);
        System.out.println("Gpa " +gpa);
        System.out.println("Địa chỉ " +diachi);
    }
    @Override
    public String toString() {
        return "Sinhvien{" +
                "ten='" + ten + '\'' +
                ", lop='" + lop + '\'' +
                ", gpa=" + gpa +
                ", diachi='" + diachi + '\'' +
                '}';
    }
}
