package JDBC_Khachhang.View;

import JDBC_Khachhang.Dao.DaoKhachHang;
import JDBC_Khachhang.Model.KhachHang;

import java.sql.Date;
import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        DaoKhachHang dao= DaoKhachHang.getInstance();
//        KhachHang kh1 = new KhachHang(
//                "KHNAM",                            // id_kh
//                "Nguyễn Văn A",                     // hoten
//                Date.valueOf("1990-01-15"),         // <-- SỬA LỖI Ở ĐÂY
//                "123 Đường ABC, Quận 1, TP. HCM"    // diachi
//        );
//        dao.Insert(kh1);
        ArrayList <KhachHang> danhsach=dao.selectAll();
        for (KhachHang kh : danhsach)
        {
            kh.danhsach();
        }
//        int xoa=dao.Delete("KHNAM");
//        System.out.println(xoa+"xóa thành công");
    }
}
