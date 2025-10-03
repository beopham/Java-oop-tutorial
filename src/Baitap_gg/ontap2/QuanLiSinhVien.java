package Baitap_gg.ontap2;

import java.util.ArrayList;

public class QuanLiSinhVien {

    ArrayList<Sinhvien> danhsachsinhvien;

    public  QuanLiSinhVien()
    {
        this.danhsachsinhvien=new ArrayList<>();
    }

    public QuanLiSinhVien(ArrayList<Sinhvien> danhsachsinhvien) {
        this.danhsachsinhvien = danhsachsinhvien;
    }

    public void themsinhvien(Sinhvien sv)
    {
        danhsachsinhvien.add(sv);
    }
    public void xuatsv()
    {
        for (Sinhvien sv : danhsachsinhvien)
        {
            sv.hienthidanhsach();
        }
    }
    public void sapxeptheogpa()
    {
        danhsachsinhvien.stream().sorted((sv1,sv2) ->Double.compare(sv2.getGpa(), sv1.getGpa())).forEach((sv) ->sv.hienthidanhsach());
    }
    public void timiiemtheoten(String ten)
    {
        boolean timkiem=danhsachsinhvien.stream().anyMatch((sv) -> sv.getTen().equalsIgnoreCase(ten));
        if(!timkiem)
        {
            System.out.println("k có tên sinh viên");
        }
        else
        {
            danhsachsinhvien.stream().filter((sv)-> sv.getTen()
                            .equalsIgnoreCase(ten))
                    .forEach((sv) ->sv.hienthidanhsach());
        }
    }
    public void tiemkiemsinhhvientheolop(String lop)
    {
        boolean kiemtralop=danhsachsinhvien.stream().anyMatch((sv)  ->sv.getLop().equalsIgnoreCase(lop));
        if(!kiemtralop)
        {
            System.out.println("k có lớp sinh viên");
        }
        else
        {
            danhsachsinhvien.stream().filter((sv) ->sv.getLop().equalsIgnoreCase(lop)).forEach((sv) ->sv.hienthidanhsach());
        }
    }
    public void xoasvtheoten(String ten)
    {
        // xóa đối tượng nha
        boolean xoasvten=danhsachsinhvien.removeIf((sv) ->sv.getTen().equalsIgnoreCase(ten));
        if(xoasvten)
        {
            System.out.println("đã xóa thành công sinh viên");
        }
        else {
            System.out.println("k có tên sinh viên");
        }

    }
    public void capnhapssinhvien(String ten, double gpaMoi, String lopMoi, String diachiMoi)
    {
       for (Sinhvien sv : danhsachsinhvien)
       {
           if(sv.getTen().equalsIgnoreCase(ten))
           {
               sv.setGpa(gpaMoi);
               sv.setLop(lopMoi);
               sv.setDiachi(diachiMoi);
               System.out.println("cập nhập thành công");
               return;
           }

       }
    }
    public void maxGpa()
    {
                // tìm điêm gpa cao nhất
                danhsachsinhvien
                .stream().max((sv1,sv2) -> Double.compare(sv1.getGpa(), sv2.getGpa()))
                .ifPresent((sv)-> sv.hienthidanhsach());
    }
    public void minGpa()
    {
        // tìm điêm gpa cao nhất
        danhsachsinhvien
                .stream().min((sv1,sv2) -> Double.compare(sv1.getGpa(), sv2.getGpa()))
                .ifPresent((sv)-> sv.hienthidanhsach());
    }

    public long demsv()
    {
        return danhsachsinhvien.stream().count();
    }
}

