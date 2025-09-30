package Baitap_gg.ontap;

import java.util.ArrayList;

public class Quanlisinhvien {

    private ArrayList<Sinhvien> danhsachsinhvien;

    public Quanlisinhvien() {
        this.danhsachsinhvien = new ArrayList<>();
    }
    public Quanlisinhvien(ArrayList<Sinhvien> danhsachsinhvien) {
        this.danhsachsinhvien = danhsachsinhvien;
    }

    public ArrayList<Sinhvien> getDanhsachsinhvien() {
        return danhsachsinhvien;
    }

    public void setDanhsachsinhvien(ArrayList<Sinhvien> danhsachsinhvien) {
        this.danhsachsinhvien = danhsachsinhvien;
    }
    public void nhapsv(Sinhvien sv)
    {
        danhsachsinhvien.add(sv);
    }
    public void xuatsv()
    {
//        for (Sinhvien sv :danhsachsinhvien)
//        {
//            System.out.println(sv.toString());
//        }
        danhsachsinhvien.stream().forEach((sv) -> sv.hienthidanhsach());
    }
    public void sapxeptheogpa()
    {
        danhsachsinhvien.stream().sorted((sv1,sv2) ->Double.compare(sv1.getGpa(), sv2.getGpa()))
                .forEach((sv)-> sv.hienthidanhsach());
    }
    public void timkiemtheoten(String ten)
    {
        boolean found = danhsachsinhvien.stream()
                .anyMatch(sv -> sv.getTen().equalsIgnoreCase(ten));

        if (!found) {
            System.out.println("Không có tên sinh viên");
        } else {
            danhsachsinhvien.stream()
                    .filter(sv -> sv.getTen().equalsIgnoreCase(ten))
                    .forEach((sv) ->sv.hienthidanhsach());
        }
    }
    @Override
    public String toString() {
        return "Quanlisinhvien{" +
                "danhsachsinhvien=" + danhsachsinhvien +
                '}';
    }
}
