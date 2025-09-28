package Baitap_gg.bai2;

public class Sach extends Tailieu{

    private String tacgia;
    private int sotrang;

    public Sach()
    {

    }

    public Sach(String tacgia, int sotrang) {
        this.tacgia = tacgia;
        this.sotrang = sotrang;
    }

    public Sach(String matailieu, String tennhaxuatban, String sophathanh, String tacgia, int sotrang) {
        super(matailieu, tennhaxuatban, sophathanh);
        this.tacgia = tacgia;
        this.sotrang = sotrang;
    }

    public String getTacgia() {
        return tacgia;
    }

    public void setTacgia(String tacgia) {
        this.tacgia = tacgia;
    }

    public int getSotrang() {
        return sotrang;
    }

    public void setSotrang(int sotrang) {
        this.sotrang = sotrang;

    }

    @Override
    public void hienthidanhsach() {
        super.hienthidanhsach();
        System.out.println("Tác giả " +tacgia);
        System.out.println("Số trang " +sotrang);
    }

    @Override
    public String toString() {
        return "Sach{" +
                "tacgia='" + tacgia + '\'' +
                ", sotrang=" + sotrang +
                '}';
    }
}
