package Baitap_gg.bai2;

public class Bao extends Tailieu {
    private int ngayphathanh;

    public Bao()
    {

    }

    public Bao(int ngayphathanh) {
        this.ngayphathanh = ngayphathanh;
    }

    public Bao(String matailieu, String tennhaxuatban, String sopbanhathanh, int ngayphathanh) {
        super(matailieu, tennhaxuatban, sopbanhathanh);
        this.ngayphathanh = ngayphathanh;
    }

    public int getNgayphathanh() {
        return ngayphathanh;
    }

    public void setNgayphathanh(int ngayphathanh) {
        this.ngayphathanh = ngayphathanh;
    }

    @Override
    public void hienthidanhsach() {
        super.hienthidanhsach();
        System.out.println("Ngày phát hành" +ngayphathanh);
    }

    @Override
    public String toString() {
        return "Bao{" +
                "ngayphathanh=" + ngayphathanh +
                '}';
    }
}
