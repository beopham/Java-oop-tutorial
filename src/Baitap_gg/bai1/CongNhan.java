package Baitap_gg.bai1;

public class CongNhan extends Canbo{
    private int bac;

    public CongNhan()
    {

    }

    public CongNhan(int bac) {
        this.bac = bac;
    }

    public CongNhan(String ten, int tuoi, String gioitinh, String congviec, int bac) {
        super(ten, tuoi, gioitinh, congviec);
        this.bac = bac;
    }

    public int getBac() {
        return bac;
    }

    public void setBac(int bac) {
        this.bac = bac;
    }

    @Override
    public void hienthithongtincanbo() {
        super.hienthithongtincanbo();
        System.out.println("Bâc cn " +bac);
    }

    @Override
    public String toString() {
        return "CongNhan{" +
                "bac=" + bac +
                '}';
    }
}
