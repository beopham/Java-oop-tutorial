package vku_giuaki;

public class Energy {
    private String madien;
    private int gia;

    public Energy()
    {

    }

    public Energy(String madien, int gia) {
        this.madien = madien;
        this.gia = gia;
    }

    public String getMadien() {
        return madien;
    }

    public void setMadien(String madien) {
        this.madien = madien;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }


    @Override
    public String toString() {
        return "Energy{" +
                "madien='" + madien + '\'' +
                ", gia=" + gia +
                '}';
    }
}
