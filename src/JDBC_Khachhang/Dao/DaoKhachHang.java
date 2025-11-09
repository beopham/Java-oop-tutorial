package JDBC_Khachhang.Dao;

import JDBC_Khachhang.Database.JDBCUtil;
import JDBC_Khachhang.Model.KhachHang;

import java.sql.*;
import java.util.ArrayList;

public class DaoKhachHang implements DAOinterface<KhachHang> {
    public static DaoKhachHang getInstance()
    {
        return  new DaoKhachHang();
    }
    @Override
    public int Insert(KhachHang khachHang) {
        int ketqua=0;
        try {
            // Đầu tiên là kết nối data1base
            Connection con= JDBCUtil.getConnection();
            // viết câu lệnh sql;
            String sql="INSERT INTO sach.khachhang (id_kh, hoten, ngaysinh, diachi)" +
                    " VALUES (?,?,?,?)";
            // Tạo dối tượng preparedstatement
            PreparedStatement pst=con.prepareStatement(sql);
            pst.setString(1,khachHang.getId());
            pst.setString(2,khachHang.getHoten());
            pst.setDate(3, (Date) khachHang.getNgaysinh());
            pst.setString(4,khachHang.getDiachi());
            ketqua= pst.executeUpdate();
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
    public int Update(KhachHang khachHang) {
        int ketqua=0;
        try
        {
           Connection con=JDBCUtil.getConnection();
            String sql="UPDATE `khachhang`" +
                    " SET `hoten` = ?," +
                    " `ngaysinh` = ?, " +
                    "`diachi` = ? " +
                    " WHERE (`id_kh` = ?)";
            PreparedStatement pst=con.prepareStatement(sql);
            pst.setString(1,khachHang.getHoten());
            pst.setDate(2,(Date)khachHang.getNgaysinh());
            pst.setString(3,khachHang.getDiachi());
            pst.setString(4,khachHang.getId());
            ketqua= pst.executeUpdate();
            pst.close();
            JDBCUtil.closeConnection(con);
        }
        catch (SQLException e )
        {
            e.printStackTrace();
        }

        return ketqua;
    }

    @Override
    public int Delete(String t) {
        int ketqua=0;
        try
        {
            Connection con=JDBCUtil.getConnection();
            String sql=" delete from khachhang WHERE (`id_kh` = ?)";
            PreparedStatement pst=con.prepareStatement(sql);
            pst.setString(1,t);
            ketqua= pst.executeUpdate();
            pst.close();
            JDBCUtil.closeConnection(con);
        }
        catch (SQLException e )
        {
            e.printStackTrace();
        }

        return ketqua;
    }

    @Override
    public KhachHang selectByid(String t) {
        KhachHang kh=null;
        try
        {
            Connection con=JDBCUtil.getConnection();
            String sql=" select * from khachhang where id_kh= ? ";
            PreparedStatement pst=con.prepareStatement(sql);
            pst.setString(1,t);
            ResultSet rs=pst.executeQuery();
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
        catch (SQLException e )
        {
            e.printStackTrace();
        }
        return kh;
    }

    @Override
    public ArrayList<KhachHang> selectAll() {
        ArrayList<KhachHang>  kh= new ArrayList<>();
        try
        {
            Connection con=JDBCUtil.getConnection();
            String sql=" select * from khachhang";
            PreparedStatement pst=con.prepareStatement(sql);
            ResultSet rs=pst.executeQuery();
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
        catch (SQLException e )
        {
            e.printStackTrace();
        }
        return kh;
    }

    @Override
    public int DeleteAll() {
        int ketqua=0;
        try
        {
            Connection con=JDBCUtil.getConnection();
            String sql=" delete from khachhang ";
            PreparedStatement pst=con.prepareStatement(sql);
            ketqua= pst.executeUpdate();
            pst.close();
            JDBCUtil.closeConnection(con);
        }
        catch (SQLException e )
        {
            e.printStackTrace();
        }

        return ketqua;
    }
}
