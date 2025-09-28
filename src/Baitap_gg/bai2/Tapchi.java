package Baitap_gg.bai2;

public class Tapchi extends Tailieu{
    private String sophathanh;
    public int thanggphathanh;

    public Tapchi()
    {

    }

    public Tapchi(String sophathanh, int thanggphathanh) {
        this.sophathanh = sophathanh;
        this.thanggphathanh = thanggphathanh;
    }

    public Tapchi(String matailieu, String tennhaxuatban, String sopbanhathanh, String sophathanh, int thanggphathanh) {
        super(matailieu, tennhaxuatban, sopbanhathanh);
        this.sophathanh = sophathanh;
        this.thanggphathanh = thanggphathanh;
    }

    public String getSophathanh() {
        return sophathanh;
    }

    public void setSophathanh(String sophathanh) {
        this.sophathanh = sophathanh;
    }

    public int getThanggphathanh() {
        return thanggphathanh;
    }

    public void setThanggphathanh(int thanggphathanh) {
        this.thanggphathanh = thanggphathanh;
    }

    @Override
    public void hienthidanhsach() {
        super.hienthidanhsach();
        System.out.println("Số phát hành");
        System.out.println("Tháng phát hành");
    }

    @Override
    public String toString() {
        return "Tapchi{" +
                "sophathanh='" + sophathanh + '\'' +
                ", thanggphathanh=" + thanggphathanh +
                '}';
    }
}
