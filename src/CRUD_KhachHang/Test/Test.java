package CRUD_KhachHang.Test;

import CRUD_KhachHang.Dao.DaoKhachHang;
import CRUD_KhachHang.Model.KhachHang;

import java.sql.Date;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
      DaoKhachHang dao=DaoKhachHang.getIntance();
//        KhachHang kh2 = new KhachHang(
//                "KHHU",                 // id_kh
//                "Trần Thị B",            // hoten
//                 Date.valueOf("1990-01-15"),
//                "456 Đường XYZ, Hà Nội"   // diachi
//        );
//        dao.insert(kh2);


        ArrayList<KhachHang> kh=dao.selecctAll();
        for (KhachHang kq : kh)
        {
            System.out.println(kq.toString());
        }

//        KhachHang khhu=new KhachHang("KHHU");
        KhachHang khhu=dao.selectByID("KHHU");
        System.out.println(khhu.toString());
        

    }
}
