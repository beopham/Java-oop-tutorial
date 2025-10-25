package Ontapsinhvien;

public class SinhVien {
    private String ten;
    private int tuoi;
    private String diachi;


    public SinhVien()
    {

    }

    public SinhVien(String ten, int tuoi, String diachi) {
        this.ten = ten;
        this.tuoi = tuoi;
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

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }


    public void hienthidanhsach()
    {
        System.out.println("Tên " + getTen());
        System.out.println("Tuổi " + getTuoi());
        System.out.println("Địa chỉ " + getDiachi());
        System.out.println("====================================");
    }
    @Override
    public String toString() {
        return "SinhVien{" +
                "ten='" + ten + '\'' +
                ", tuoi=" + tuoi +
                ", diachi='" + diachi + '\'' +
                '}';
    }
}
