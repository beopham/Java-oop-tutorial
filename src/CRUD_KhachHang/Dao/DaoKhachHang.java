package CRUD_KhachHang.Dao;

import CRUD_KhachHang.Database.JDBCUtil;
import CRUD_KhachHang.Model.KhachHang;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.*;
import java.sql.Date;
public class DaoKhachHang implements DaoGeneric<KhachHang> {
    public static DaoKhachHang getIntance()
    {
        return new DaoKhachHang();
    }
    @Override
    public int insert(KhachHang khachHang)
    {
        int ketqua=0;
        try
        {
            Connection con= JDBCUtil.getConnection();
            String sql="INSERT INTO sach.khachhang (id_kh, hoten, ngaysinh, diachi) VALUES"
                    + "(?,?,?,?)";
            PreparedStatement pst= con.prepareStatement(sql);
            pst.setString(1,khachHang.getId_kh());
            pst.setString(2,khachHang.getHoten());
            // Giả sử getNgaysinh() trả về java.util.Date
            pst.setDate(3,khachHang.getNgaysinh());

            pst.setString(4,khachHang.getDiachi());
            ketqua=pst.executeUpdate();
            if(ketqua==1)
            {
                System.out.println("Thêm thành công");
            }
            pst.close();
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ketqua;
    }

    @Override
    public int update(KhachHang khachHang) {
        int ketqua=0;
        try
        {
            Connection con= JDBCUtil.getConnection();
            String sql="UPDATE `sach`.`khachhang` SET " +
                    "`hoten` = ?," +
                    " `ngaysinh` = ?" +
                    " `diachi` = ?" +
                    "WHERE `id_kh` = ?";
            PreparedStatement pst= con.prepareStatement(sql);
            pst.setString(1,khachHang.getHoten());
            // Giả sử getNgaysinh() trả về java.util.Date
            pst.setDate(2,khachHang.getNgaysinh());
            pst.setString(3,khachHang.getDiachi());
            pst.setString(4,khachHang.getId_kh());
            ketqua=pst.executeUpdate();
            if(ketqua==1)
            {
                System.out.println("Cập nhập thành công");
            }
            pst.close();
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ketqua;
    }

    @Override
    public int delete(String t) {
        int ketqua=0;
        try
        {
            Connection con= JDBCUtil.getConnection();
            String sql="DELETE FROM `sach`.`khachhang` WHERE (`id_kh` = ?);";
            PreparedStatement pst= con.prepareStatement(sql);
            pst.setString(1,t);
            ketqua=pst.executeUpdate();
            if(ketqua==1)
            {
                System.out.println("xóa thành công");
            }
            pst.close();
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ketqua;
    }

    @Override
    public ArrayList<KhachHang> selecctAll()
    {
        ArrayList<KhachHang> kh=new ArrayList<>();
        try
        {
            Connection con= JDBCUtil.getConnection();
            String sql="select * from khachhang";
            PreparedStatement pst= con.prepareStatement(sql);
            ResultSet rs= pst.executeQuery();
            while (rs.next())
            {
                String id_kh=rs.getString("id_kh");
                String hoten=rs.getString("hoten");
                Date ngaysinh=rs.getDate("ngaysinh");
                String diachi=rs.getString("diachi");
                KhachHang khachhang=new KhachHang(id_kh,hoten,ngaysinh,diachi);
                kh.add(khachhang);

            }
            pst.close();
            JDBCUtil.closeConnection(con);
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return kh;
    }

    @Override
    public KhachHang selectByID(String t) {
        KhachHang kh=null;
        try
        {
            Connection con= JDBCUtil.getConnection();
            String sql="select * from khachhang  WHERE (`id_kh` = ?);";
            PreparedStatement pst= con.prepareStatement(sql);
            pst.setString(1,t);
            ResultSet rs= pst.executeQuery();
            while (rs.next())
            {
                String id_kh=rs.getString("id_kh");
                String hoten=rs.getString("hoten");
                Date ngaysinh=rs.getDate("ngaysinh");
                String diachi=rs.getString("diachi");
                kh=new KhachHang(id_kh,hoten,ngaysinh,diachi);


            }
            pst.close();
            JDBCUtil.closeConnection(con);
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return kh;
    }
}
