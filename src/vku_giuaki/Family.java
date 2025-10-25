package vku_giuaki;

public class Family {
    private String mahogiadinh;
    private int sochudien;   // đổi String -> int
    private int sochunuoc;   // đổi String -> int
    private Energy dien;
    private Water nuoc;

    public Family() {}

    public Family(String mahogiadinh, int sochudien, int sochunuoc, Energy dien, Water nuoc) {
        this.mahogiadinh = mahogiadinh;
        this.sochudien = sochudien;
        this.sochunuoc = sochunuoc;
        this.dien = dien;
        this.nuoc = nuoc;
    }


    public String getMahogiadinh() {
        return mahogiadinh;
    }

    public void setMahogiadinh(String mahogiadinh) {
        this.mahogiadinh = mahogiadinh;
    }

    public int getSochudien() {
        return sochudien;
    }

    public void setSochudien(int sochudien) {
        this.sochudien = sochudien;
    }

    public int getSochunuoc() {
        return sochunuoc;
    }

    public void setSochunuoc(int sochunuoc) {
        this.sochunuoc = sochunuoc;
    }

    public Energy getDien() {
        return dien;
    }

    public void setDien(Energy dien) {
        this.dien = dien;
    }

    public Water getNuoc() {
        return nuoc;
    }

    public void setNuoc(Water nuoc) {
        this.nuoc = nuoc;
    }
    public int tiendien()
    {
        int Tiendien=sochudien*dien.getGia();
        return Tiendien;
    }
    public int tiennuoc()
    {
        int Tiennuoc=sochunuoc*nuoc.getGia();
        return Tiennuoc;
    }

    @Override
    public String toString() {
        return "Family{" +
                "mahogiadinh='" + mahogiadinh + '\'' +
                ", sochudien=" + sochudien +
                ", sochunuoc=" + sochunuoc +
                ", dien=" + dien +
                ", nuoc=" + nuoc +
                '}';
    }
}
