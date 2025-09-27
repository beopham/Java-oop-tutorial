package Baitap_gg.bai1;

import java.util.ArrayList;

public class Quanlicanbo {
    private ArrayList<Canbo> danhsachcanbo;
    public Quanlicanbo() {
        this.danhsachcanbo = new ArrayList<Canbo> () ;
    }
    public Quanlicanbo(ArrayList<Canbo> danhsachcanbo) {
        this.danhsachcanbo = danhsachcanbo;
    }
    public void themcanbo(Canbo canbo)
    {
        danhsachcanbo.add(canbo);

    }
    public void timkiemthongtin(String name)
    {
     // đặt cờ
        boolean found = false;
        for (Canbo danhsach : danhsachcanbo)
        {
             if(danhsach.getTen().equalsIgnoreCase(name))
             {
                 danhsach.hienthithongtincanbo();
                 found=true;
              }
        }
        if(!found)
        {
            System.out.println("❌ Không tìm thấy cán bộ nào tên: " + name);
        }

    }
    public void hienthiThongtin()
    {
        for (Canbo danhsach : danhsachcanbo)
        {
            danhsach.hienthithongtincanbo();
        }
    }

}
