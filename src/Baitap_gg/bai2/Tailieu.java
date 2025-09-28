package Baitap_gg.bai2;

public class Tailieu {
    private String matailieu;
    private String tennhaxuatban;
    private String sopbanhathanh;

    public Tailieu()
    {

    }

    public Tailieu(String matailieu, String tennhaxuatban, String sopbanhathanh) {
        this.matailieu = matailieu;
        this.tennhaxuatban = tennhaxuatban;
        this.sopbanhathanh = sopbanhathanh;
    }

    public String getMatailieu() {
        return matailieu;
    }

    public void setMatailieu(String matailieu) {
        this.matailieu = matailieu;
    }

    public String getTennhaxuatban() {
        return tennhaxuatban;
    }

    public void setTennhaxuatban(String tennhaxuatban) {
        this.tennhaxuatban = tennhaxuatban;
    }

    public String getSopbanhathanh() {
        return sopbanhathanh;
    }

    public void setSopbanhathanh(String sopbanhathanh) {
        this.sopbanhathanh = sopbanhathanh;
    }

    public void hienthidanhsach()
     {
         System.out.println("Mã tài liệu" +matailieu);
         System.out.println("Tên nhà xuất bản" +tennhaxuatban);
         System.out.println("Số bản phát hành" +sopbanhathanh);
     }

    @Override
    public String toString() {
        return "Tailieu{" +
                "matailieu='" + matailieu + '\'' +
                ", tennhaxuatban='" + tennhaxuatban + '\'' +
                ", sopbanhathanh='" + sopbanhathanh + '\'' +
                '}';
    }
}
