package Chapter1_Exercises_on_Classes;

public class Employee {
    private String hoten;
    private int tuoi;
    private double luong;

    public Employee()
    {

    }

    public Employee(String hoten, int tuoi, double luong) {
        this.hoten = hoten;
        this.tuoi = tuoi;
        this.luong = luong;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }
    public double luonghangnam()
    {
        double luonghn=getLuong()*12;
        return luonghn;
    }
    public double luongmoi(double phantram) {
        return luong + (luong * phantram / 100);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "hoten='" + hoten + '\'' +
                ", tuoi=" + tuoi +
                ", luong=" + luong +
                '}';
    }
}
