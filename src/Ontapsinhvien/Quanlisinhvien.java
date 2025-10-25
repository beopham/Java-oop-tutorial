package Ontapsinhvien;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Quanlisinhvien {
    private ArrayList <SinhVien> sinhvien;
    public Quanlisinhvien() {
        this.sinhvien = new ArrayList<>();
    }
    public Quanlisinhvien(ArrayList<SinhVien> sinhvien) {
        this.sinhvien = sinhvien;
    }

    public void themsinhvien(SinhVien sv)
    {
        sinhvien.add(sv);
    }
    public void hienthidanhsach()
    {
        for (SinhVien sv : sinhvien)
        {
            sv.hienthidanhsach();
        }
    }
    public void xosasinhvientheoten(String ten)
    {
        boolean timthay=sinhvien.stream().anyMatch((sv) -> sv.getTen().equalsIgnoreCase(ten));

        if(timthay)
        {
            sinhvien.removeIf((sv) -> sv.getTen().equalsIgnoreCase(ten));
            System.out.println("Đã xóa sinh viên có tên là" + ten);
        }
        else
        {
            System.out.println("k tìm thấy sinh viên có tên là" +ten);
        }
    }

    public void capnhaptheoten(String ten, int tuoimoi,String diachimoi)
    {
        boolean timthay=false;

        for(SinhVien sv :sinhvien)
        {
            if(sv.getTen().equalsIgnoreCase(ten))
            {
                sv.setTuoi(tuoimoi);
                sv.setDiachi(diachimoi);

                timthay=true;
                break;
            }

        }
        if(!timthay)
        {
            System.out.println("k tìm thấy sinh viên có tên" +ten);
        }
    }
        public void sapxepsinhvientheotuoi()
        {

            sinhvien.stream().sorted(Comparator.comparingInt(SinhVien::getTuoi)).forEach((sv) -> sv.hienthidanhsach());
        }
        public void svlonhon20()
        {
            sinhvien.stream().filter((sv) ->sv.getTuoi()>=20).forEach((sv) ->sv.hienthidanhsach());
        }

}
